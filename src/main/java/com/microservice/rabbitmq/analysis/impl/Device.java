package com.microservice.rabbitmq.analysis.impl;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.springframework.amqp.core.Message;

import com.alibaba.fastjson.JSONObject;
import com.microservice.rabbitmq.devices.entity.DevBasicInfo;
import com.microservice.rabbitmq.devices.entity.DevBoxInfo;

public interface Device {

	//根据传入message自动匹配解析组
	JSONObject analysisMessage(Message message) throws UnsupportedEncodingException, Exception;
	//根据传入message自动匹配解析组
	JSONObject analysisMessage(Message message, String echoType) throws UnsupportedEncodingException, Exception;
	//根据传入message自动匹配解析组
	JSONObject analysisMessage(JSONObject json) throws UnsupportedEncodingException, Exception;

	//插入数据库
	int insertDB(JSONObject json);
	
	//插入数据库
	int insertDB(Map<String,Object> json,List<DevBoxInfo> ll) throws Exception;
	
}
