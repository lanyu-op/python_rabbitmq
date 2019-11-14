package com.microservice.rabbitmq.consumer;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;
 
import com.alibaba.fastjson.JSONObject;
import com.hazelcast.core.HazelcastInstance;
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
import com.microservice.rabbitmq.component.CommonUtils;
import com.microservice.rabbitmq.component.DecryptionHelper;
import com.microservice.rabbitmq.component.HazelcastDB;
import com.microservice.rabbitmq.component.UUIDGenerator;

import lombok.extern.slf4j.Slf4j;


/**
 * 消费服务
 */
@Component
@Slf4j
public class DispatchConsumer implements RabbitTemplate.ConfirmCallback{
    @Autowired
    private RabbitTemplate rabbitTemplate;
    
	@Autowired
	HazelcastDB HazelcastDB;
	
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
    /*
    public String HazelcastQueueProcess(Queue<JSONObject> clusterQueue) throws InterruptedException, ExecutionException {
        Callable<String> onProcessing = new Callable<String>() {

            @Override
            public String call() throws Exception {
                Map<String,Object> Content = jsonObject.getInnerMap();

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
                return "";
            }
            
        };
        clusterQueue.forEach(item->{
        	
        	JSONObject poll = ((Queue<JSONObject>) item).poll();
        	
        }
        );
        
        FutureTask<String> task = new FutureTask<String>(onProcessing);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(task);//线程开启一个任务

        if (!task.isDone()) {  // 联系快递员，询问是否到货
            
        }
        String re_task = task.get();
        return re_task;
    }
    */
    //采集消费者
    @RabbitListener(queues = "collector_queue",containerFactory = "customContainerFactory")
    //@RabbitListener(queues = "collector_queue")
    public void collector_process_router(Message message, @Headers Map<String, Object> headers, Channel channel) throws Exception {
    	log.debug("=============[队列路由start!]==================");
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
        String HeadInfo = jsonObject.getString("HeadInfo");//设备IP做为区分设备唯一标识，进行hash
        
        int hash=HeadInfo.hashCode();


        
        //参数检查，为空直接放弃
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
        send(UUIDGenerator.getUUID(),jsonObject,""+(hash%2));
        log.debug("----------------HASH取模,路由到--------collector_queue"+(hash%2));
    	int insertOk=1;
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
        log.debug("=============[队列路由end  !]==================");
    } 
    
    private void send(String msgId,JSONObject jsonObect,String mod) {
    	String echoType = jsonObect.getString("Cmd");
        int priority=1;
        String expiration=String.valueOf(10000);//消息有效期，超过有效期进入私信队列。默认死信队列设置24小时过期。10S后
    	if(CommonUtils.zhengzeSpace(echoType.toString(), "init")) {
    		priority=9;
    		expiration=String.valueOf(0);//
    	}
    	
        // 封装消息
        String msg = jsonObect.toJSONString();

        Message sendmessage = MessageBuilder.withBody(msg.getBytes()).setContentType(MessageProperties.CONTENT_TYPE_JSON)
                .setContentEncoding("utf-8").setMessageId(msgId)
                .setPriority(priority)
                //.setExpiration(expiration)
                .build();
		//log.debug(""+"msg:" );
        // 构建回调返回的数据
        CorrelationData correlationData = new CorrelationData(msgId);
        // 发送消息
        this.rabbitTemplate.setMandatory(true);
        this.rabbitTemplate.setConfirmCallback(this);
        //普通的生产者
        rabbitTemplate.convertAndSend("direct_exchange"+mod, "collectRoutingKey", sendmessage, correlationData);

    }
    
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        String orderId = correlationData.getId(); //id 都是相同的哦  全局ID
        System.out.println("消息id:" + correlationData.getId()); 
        if (ack) { //消息发送成功
            System.out.println("消息发送确认成功");
        } else {
            //重试机制，如果确认失败，
            //send(orderId); 
        	log.debug("==[队列路由失败！！！]"+"消息id:" + correlationData.getId());
        	log.debug("消息发送确认失败:" + cause);
            System.out.println("消息发送确认失败:" + cause);
        }
 
    } 
  
    //@RabbitListener(queues = "collector_queue0")
    public void collector_process_direct0(Message message, @Headers Map<String, Object> headers, Channel channel) throws Exception {
    	log.debug("=============[队列处理start!]==================");
    	//Thread.sleep(60*1000*10);
    	JSONObject jsonObject=null;
    	try {
            String msg = new String(message.getBody(), "UTF-8");
             jsonObject = JSONObject.parseObject(msg);
    	}catch(Exception e) {
    		log.debug("json格式错误");
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            return;
    	}
        String devType = jsonObject.getString("devType");
        String echoType = jsonObject.getString("Cmd");
        String boxNo = jsonObject.getString("boxNo");
        String ip = jsonObject.getString("ip");
        String HeadInfo = jsonObject.getString("HeadInfo");//设备IP做为区分设备唯一标识，进行hash
        
        int hash=HeadInfo.hashCode();
        //HazelcastInstance hz= HazelcastDB.getHazelcastInstance();
     // 创建集群Queue
        //Queue<JSONObject> clusterQueue = hz.getQueue("MyQueue"+(hash%2));
        //clusterQueue.offer(jsonObject);
        
        //ConcurrentMap<String, JSONObject> map = hz.getMap("my-distributed-map");
        //map.put("key"+(hash%2), jsonObject);
        //map.get("key"+(hash%2));
        log.debug("=========HASH取模：================"+(hash%2));
        //log.debug("=========HASH取模JSON：================"+clusterQueue.size());
        //Concurrent Map methods
        //map.putIfAbsent("somekey", "somevalue");
        //map.replace("key", "value", "newvalue");
        
        //取模放到不同的
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
    

    @RabbitListener(queues = "collector_queue1")
    public void collector_process_direct1(Message message, @Headers Map<String, Object> headers, Channel channel) throws Exception {
    	log.debug("=============[队列处理start!]==================");
    	//Thread.sleep(60*1000*10);
    	JSONObject jsonObject=null;
    	try {
            String msg = new String(message.getBody(), "UTF-8");
            jsonObject = JSONObject.parseObject(msg);
    	}catch(Exception e) {
    		log.debug("json格式错误");
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            return;
    	}
        String devType = jsonObject.getString("devType");
        String echoType = jsonObject.getString("Cmd");
        String boxNo = jsonObject.getString("boxNo");
        String ip = jsonObject.getString("ip");
        String HeadInfo = jsonObject.getString("HeadInfo");//设备IP做为区分设备唯一标识，进行hash
        
        int hash=HeadInfo.hashCode();
        //HazelcastInstance hz= HazelcastDB.getHazelcastInstance();
     // 创建集群Queue
        //Queue<JSONObject> clusterQueue = hz.getQueue("MyQueue"+(hash%2));
        //clusterQueue.offer(jsonObject);
        
        //ConcurrentMap<String, JSONObject> map = hz.getMap("my-distributed-map");
        //map.put("key"+(hash%2), jsonObject);
        //map.get("key"+(hash%2));
        log.debug("=========HASH取模：================"+(hash%2));
        //log.debug("=========HASH取模JSON：================"+clusterQueue.size());
        //Concurrent Map methods
        //map.putIfAbsent("somekey", "somevalue");
        //map.replace("key", "value", "newvalue");
        
        //取模放到不同的
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