package com.microservice.rabbitmq.consumer;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Map;
 
import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;
 
import com.alibaba.fastjson.JSONObject;
import com.microservice.rabbitmq.analysis.factory.DeviceParseFactory;
import com.microservice.rabbitmq.analysis.impl.Device;
import com.microservice.rabbitmq.analysis.impl.DeviceBase;
import com.microservice.rabbitmq.devices.entity.DevBasicInfo;
import com.microservice.rabbitmq.devices.entity.DevBasicInfoExample;
import com.microservice.rabbitmq.devices.entity.DevBoxInfo;
import com.microservice.rabbitmq.devices.entity.DevBoxInfoExample;
import com.microservice.rabbitmq.devices.entity.DevChassisInfo;
import com.microservice.rabbitmq.devices.mapper.DevBasicInfoMapper;
import com.microservice.rabbitmq.devices.mapper.DevBoxInfoMapper;
import com.microservice.rabbitmq.devices.mapper.DevChassisInfoMapper;
import com.microservice.rabbitmq.order.Entity.DispatchEntity;
import com.microservice.rabbitmq.order.dao.DispatchMapper;
import com.rabbitmq.client.Channel;

import lombok.extern.slf4j.Slf4j;

/**
 * 派单服务
 */
@Component
@Slf4j
public class DispatchConsumer {
    @Autowired
    private DispatchMapper dispatchMapper;
    @Autowired
    DeviceParseFactory deviceParseFactory;
    
    @Autowired
    DevBasicInfoMapper devBasicInfoMapper;
    @Autowired
    DevBoxInfoMapper devBoxInfoMapper;
    
	@Autowired
	DevChassisInfoMapper devChassisInfoMapper;
	
    //@RabbitListener(queues = "order_dic_queue")
    public void process(Message message, @Headers Map<String, Object> headers, Channel channel) throws Exception {
        String messageId = message.getMessageProperties().getMessageId();
        String msg = new String(message.getBody(), "UTF-8");
        System.out.println("派单服务平台" + msg + ",消息id:" + messageId);
        JSONObject jsonObject = JSONObject.parseObject(msg);
        String orderId = jsonObject.getString("orderId");
        if (StringUtils.isEmpty(orderId)) {
            // 日志记录
            return;
        }
        DispatchEntity dispatchEntity = new DispatchEntity();
        // 订单id
        dispatchEntity.setOrderId(orderId);
        // 外卖员id
        dispatchEntity.setTakeoutUserId(12l);
        
        try {
            int insertDistribute = dispatchMapper.insertDistribute(dispatchEntity);
            if (insertDistribute > 0) {
                // 手动签收消息,通知mq服务器端删除该消息
                channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // // 丢弃该消息
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
        }
    }
    //采集消费者
    //@RabbitListener(queues = "collector_queue")
    public void collector_process(Message message, @Headers Map<String, Object> headers, Channel channel) throws Exception {
        //String messageId = message.getMessageProperties().getMessageId();
        String msg = new String(message.getBody(), "UTF-8");
        //System.out.println("派单服务平台" + msg + ",消息id:" + messageId);
        JSONObject jsonObject = JSONObject.parseObject(msg);
        String devType = jsonObject.getString("devType");
        String echoType = jsonObject.getString("echoType");
        //String boxNo = jsonObject.getString("boxNo");
        //String remark = jsonObject.getString("remark");
        //String uploadCode = jsonObject.getString("uploadCode");
        //if (StringUtils.isEmpty(msgId)||!msgId.equals(messageId)) {
            // 日志记录
        //    return;
        //}
        //解码
        //String decode = new String(Base64.getDecoder().decode(uploadCode), StandardCharsets.UTF_8);
        //System.out.println(decode);
        
        //调用解析类
        
    	Device device=deviceParseFactory.getDevByType(devType);//选择设备类型
    	JSONObject jb=device.analysisMessage(message,echoType);//回显解析器，这里做一下解析
        //StringBuilder Sb = new StringBuilder(jb.toString());
        //System.out.println("当前json:" + Sb.toString());
		//log.debug("当前json："+jb);
		log.debug("=========================");
		log.debug("设备类型："+devType);
		log.debug("回显类型："+echoType);
		log.debug("回显解码json："+jb.toString());
    	int insertOk=0;
    	insertOk=device.insertDB(jb);

    	//jb 插入数据库
    	//如果插入数据库失败报错，会中断
    	//统一的格式
        try {
          
        	//插入数据库成功，则删除消息。
            if (insertOk > 0) {
                // 手动签收消息,通知mq服务器端删除该消息
                channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
                log.info("collector_queue消费成功OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // // 丢弃该消息，当队列出现问题的时候。回滚
            log.info("collector_queue异常回滚消息");
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
        }
    } 
    
    //采集消费者
    @RabbitListener(queues = "collector_queue",containerFactory = "customContainerFactory")
    public void collector_process_direct(Message message, @Headers Map<String, Object> headers, Channel channel) throws Exception {
    	log.debug("=============[队列处理start!]==================");
    	//Thread.sleep(60*1000*10);
    	JSONObject jsonObject=null;
    	try {
    	 jsonObject=DeviceBase.converMsgDirect(message);//解码
    	}catch(Exception e) {
    		log.debug("json格式错误");
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            return;
    	}
        String devType = jsonObject.getString("devType");
        String echoType = jsonObject.getString("Cmd");
        String boxNo = jsonObject.getString("boxNo");
        String ip = jsonObject.getString("ip");
        if((devType!=null&&!devType.equals(""))&&
        		(echoType!=null&&!echoType.equals(""))&&
        		(boxNo!=null&&!boxNo.equals(""))&&
        		(ip!=null&&!ip.equals(""))
        		) {
        }else {
        	log.debug("json参数为空");
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            return;
        }
        Map<String,Object> Content = jsonObject.getInnerMap();
        //DevBasicInfoExample example=new DevBasicInfoExample();
        //example.createCriteria().andIpAddressEqualTo(ip).andBoxNoEqualTo(boxNo);
        //List<DevBasicInfo> ll=null;
        //List<DevBasicInfo> ll=devBasicInfoMapper.selectByExample(example);
        
        //DevChassisInfo devChassisInfo =new DevChassisInfo();
		//devChassisInfo.setChassisName("999");
		//devChassisInfo.setDeviceType("999");
		//devChassisInfo.setBasicinfoId(ll.get(0).getId());
		
		//devChassisInfoMapper.insertSelective(devChassisInfo);
        
        //调用解析类ll.get(0).getUserId();
        //查找设备是否注册
        //List<DevBoxInfo> dbi=
        DevBoxInfoExample example=new DevBoxInfoExample();
        example.createCriteria().andBoxNoEqualTo(boxNo);
        List<DevBoxInfo> ll=devBoxInfoMapper.selectByExample(example);
        
    	Device device=deviceParseFactory.getDevByType(devType);//选择设备类型
		//log.debug("========================="+ll.size());
    	log.debug("=========消息体详情================");
		log.debug("设备类型："+devType);
		log.debug("回显类型："+echoType);
		log.debug("回显原文："+jsonObject.toString());
    	int insertOk=0;
    	insertOk=device.insertDB(Content,ll);
    	log.debug("insertOk："+insertOk);
    	//insertOk=1;
    	//jb 插入数据库
    	//如果插入数据库失败报错，会中断
    	//统一的格式
        try {
          
        	//插入数据库成功，则删除消息。
            if (insertOk > 0) {
                // 手动签收消息,通知mq服务器端删除该消息
                channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
                log.info("collector_queue消费成功OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // // 丢弃该消息，当队列出现问题的时候。回滚
            log.info("collector_queue异常回滚消息");
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
        }
        log.debug("=============[队列处理end  !]==================");
    } 
}