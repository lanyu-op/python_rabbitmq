package com.microservice.rabbitmq.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.microservice.rabbitmq.devices.entity.DevBasicInfo;

public interface EchoDbService {
	int insetDisplayDevice(Map<String, Object> map,List<DevBasicInfo> ll) ;
}
