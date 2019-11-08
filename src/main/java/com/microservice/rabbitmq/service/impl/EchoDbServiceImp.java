package com.microservice.rabbitmq.service.impl;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.microservice.rabbitmq.component.BaseApiService;
import com.microservice.rabbitmq.component.ResponseBase;
import com.microservice.rabbitmq.consumer.DispatchConsumer;
import com.microservice.rabbitmq.devices.entity.DevBasicInfo;
import com.microservice.rabbitmq.devices.entity.DevChassisInfo;
import com.microservice.rabbitmq.devices.mapper.DevChassisInfoMapper;
import com.microservice.rabbitmq.order.Entity.OrderEntity;
import com.microservice.rabbitmq.order.dao.OrderMapper;
import com.microservice.rabbitmq.service.EchoDbService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class EchoDbServiceImp implements EchoDbService  {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RabbitTemplate rabbitTemplate;
 
    @Autowired 
    FanoutExchange collectorExchange;
    
	@Autowired
	DevChassisInfoMapper devChassisInfoMapper;


	@Override
	public int insetDisplayDevice(Map<String, Object> map,List<DevBasicInfo> ll) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		log.debug("===========insertDB=============="+map.get("Cmd"));
		if(map.get("Cmd").toString().equalsIgnoreCase("display  device")) {
			//正则解析echoCode,解析为我们定义的json,用于写数据库。
			//diguiFunction(map);
			//log.debug(Content);
			//Map<String, Object> content=(Map<String, Object>) map.get("Content");
			JSONArray content=(JSONArray) map.get("Content");
			//diguiFunction(map.get("Content"));
			
			for(int i=0;i<content.size();i++) {
				//log.debug("========================"+i);
				Map<String, Object> xxx=(Map<String, Object>) content.get(i);
				log.debug("=============机柜==========="+xxx.get("Chassis"));
				//ll.get(0).getUserId()
				DevChassisInfo devChassisInfo =new DevChassisInfo();
				//devChassisInfo.setChassisName(""+xxx.get("Chassis"));
				//devChassisInfo.setDeviceType(""+map.get("devType"));
				//devChassisInfo.setBasicinfoId(ll.get(0).getId());
				
				devChassisInfo.setChassisName("999");
				devChassisInfo.setDeviceType("999");
				//devChassisInfo.setBasicinfoId(ll.get(0).getId());
				
				devChassisInfoMapper.insertSelective(devChassisInfo);
				
				List list=(List) xxx.get("devinfo");
				for(int y=0;y<list.size();y++) {
					Map<String, Object>  xxx1=(Map<String, Object>) list.get(y);
					log.debug("============槽位============"+xxx1.get("slot"));
					if(xxx1.get("subinfo")!=null) {
						List list1=(List)xxx1.get("subinfo");
						if(list1.size()>0) {
							for(int a=0;a<list1.size();a++) {
								Map<String, Object>  xxx2=(Map<String, Object>) list1.get(a);
									
									log.debug("============子卡============"+xxx2.get("Type"));
							}
						}
					}
				}
				//log.debug(""+content.gets.get("Chassis"));
				//Map<String, Object> devinfo=(Map<String, Object>) content.get("devinfo");
				//for(int y=0;y<devinfo.size();y++) {
				//	log.debug(""+devinfo.get(y));
					
				//}
			}
			
		
	
		}
		return 0;
 
	}
}