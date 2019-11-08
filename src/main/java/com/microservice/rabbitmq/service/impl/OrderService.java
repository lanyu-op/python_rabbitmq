package com.microservice.rabbitmq.service.impl;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.alibaba.fastjson.JSONObject;
import com.microservice.rabbitmq.component.BaseApiService;
import com.microservice.rabbitmq.component.ResponseBase;
import com.microservice.rabbitmq.consumer.DispatchConsumer;
import com.microservice.rabbitmq.order.Entity.OrderEntity;
import com.microservice.rabbitmq.order.dao.OrderMapper;
import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class OrderService extends BaseApiService implements RabbitTemplate.ConfirmCallback {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RabbitTemplate rabbitTemplate;
 
    @Autowired 
    FanoutExchange collectorExchange;
    
    
    public ResponseBase addOrderAndDispatch() {
        //先下单 订单表插入数据
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setName("黄焖鸡米饭");
        // 价格是300元
        orderEntity.setOrderMoney(300d);
        // 商品id
        String orderId = UUID.randomUUID().toString();
        orderEntity.setOrderId(orderId);
        // 1.先下单，创建订单 (往订单数据库中插入一条数据)
        int orderResult = orderMapper.addOrder(orderEntity);
        //System.out.println(":" + orderResult);
        if (orderResult <= 0) {
            return setResultError("下单失败!");
        }
        // 2.订单表插插入完数据后 订单表发送 外卖小哥
        send(orderId);
    //    int i = 1/0;   //发生异常
        return setResultSuccess();
    }
 
    private void send(String msgId) {
    	String text = ""
    			+ "    S9306's Device status:\r\n" + 
    			"    Slot  Sub Type         Online    Power      Register       Status     Role  \r\n" + 
    			"    -------------------------------------------------------------------------------\r\n" + 
    			"    1     -   LE1D2S16SX2S Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    2     -   LE1D2S16SX2S Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    5     -   LE1D2G48TX1C Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    7     -   LE1D2SRUE000 Present   PowerOn    Registered     Normal     Slave \r\n" + 
    			"        1   LE1D2VS04000 Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    8     -   LE1D2SRUE000 Present   PowerOn    Registered     Normal     Master\r\n" + 
    			"        1   LE1D2VS04000 Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    PWR1  -   -            Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    PWR3  -   -            Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    CMU1  -   LE02CMUA     Present   PowerOn    Registered     Normal     Master\r\n" + 
    			"    FAN1  -   -            Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    FAN2  -   -            Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    }\r\n" + 
    			"    Chassis 2 (Standby Switch)\r\n" + 
    			"    S9306's Device status:\r\n" + 
    			"    Slot  Sub Type         Online    Power      Register       Status     Role  \r\n" + 
    			"    -------------------------------------------------------------------------------\r\n" + 
    			"    1     -   LE1D2S16SX2S Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    2     -   LE1D2S16SX2S Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    5     -   LE1D2G48TX1C Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    7     -   LE1D2SRUE000 Present   PowerOn    Registered     Normal     Slave \r\n" + 
    			"        1   LE1D2VS04000 Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    8     -   LE1D2SRUE000 Present   PowerOn    Registered     Normal     Master\r\n" + 
    			"        1   LE1D2VS04000 Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    PWR1  -   -            Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    PWR3  -   -            Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    CMU1  -   LE02CMUA     Present   PowerOn    Registered     Normal     Master\r\n" + 
    			"    FAN1  -   -            Present   PowerOn    Registered     Normal     NA    \r\n" + 
    			"    FAN2  -   -            Present   PowerOn    Registered     Normal     NA";
 
    	//编码
        String encode = Base64.getEncoder()
                .encodeToString(text.getBytes(StandardCharsets.UTF_8));
        //System.out.println("base64:"+encode);    	
        JSONObject jsonObect = new JSONObject();
        jsonObect.put("msgId", msgId);//消息ID，uuid生成
        jsonObect.put("boxNo", "macxxxxxiiisssdd");//盒子ID，盒子MAC地址
        jsonObect.put("devType", "S9300");//设备类型，上传
        jsonObect.put("echoType", "echo1");//回显类型，上传
        jsonObect.put("remark", "");//预留字段
        jsonObect.put("uploadCode", encode);//回显文本
        String msg = jsonObect.toJSONString();
        //单线程操作字符串缓冲区下操作大量数据 StringBuilder,快
        //多线程操作字符串缓冲区下操作大量数据 StringBuffer；慢
        //StringBuilder Sb = new StringBuilder(msg);
        //StringBuffer Sb= new StringBuffer(5000);
        //Sb.append(msg);
        //System.out.println("msg:" + Sb.toString());

        //System.out.println("msg:" + msg.length());

        // 封装消息
        Message message = MessageBuilder.withBody(msg.getBytes()).setContentType(MessageProperties.CONTENT_TYPE_JSON)
                .setContentEncoding("utf-8").setMessageId(msgId).build();
		//log.debug(""+"msg:" );
        // 构建回调返回的数据
        CorrelationData correlationData = new CorrelationData(msgId);
        // 发送消息
        this.rabbitTemplate.setMandatory(true);
        this.rabbitTemplate.setConfirmCallback(this);
        //直连交换器方式
        //body = JSON.toJSONString(issueMessage).getBytes(AmqpConfiguration.MESSAGE_ENCODING);
        //rabbitTemplate.convertAndSend(AmqpConfiguration.EXCHANGE_ISSUE,AmqpConfiguration.ROUTING_KEY_ISSUE_USER, message, correlationData);
        //普通的生产者
        //rabbitTemplate.convertAndSend("order_exchange_name", "orderRoutingKey", message, correlationData);
        //扇形交换器模式
        //for(int x=0;x<1000;x++) {
        rabbitTemplate.convertAndSend(collectorExchange.getName(),"", message, correlationData);
        //}
    }
 
    // 生产消息确认机制 生产者往服务器端发送消息的时候 采用应答机制
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        String orderId = correlationData.getId(); //id 都是相同的哦  全局ID
        System.out.println("消息id:" + correlationData.getId()); 
        if (ack) { //消息发送成功
            System.out.println("消息发送确认成功");
        } else {
            //重试机制
            send(orderId); 
            System.out.println("消息发送确认失败:" + cause);
        }
 
    }
 
}