package com.microservice.rabbitmq.analysis.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.microservice.rabbitmq.analysis.impl.Device;
import com.microservice.rabbitmq.analysis.service.DevHuaweiS9300;
//工厂模式获取设备解析类
@Component
public class DeviceParseFactory {
	@Autowired
	DevHuaweiS9300 devHuaweiS9300;
	   //使用 getShape 方法获取形状类型的对象
	   public Device getDevByType(String devType){
	      if(devType == null){
	         return null;
	      }        

	         //return new DevHuaweiS9300();
	        // try {
	   	      	if(devType.equalsIgnoreCase("S9300")){
	   	      		return devHuaweiS9300;
	   	      		//return (Device)Class.forName("com.microservice.rabbitmq.analysis.service.DevHuaweiS9300").newInstance();
	   	      	} else if(devType.equalsIgnoreCase("huawei2")){
			         //return new DevHuawei2();
			      } else if(devType.equalsIgnoreCase("huawei3")){
			         //return new DevHuawei3();
			      }
	        // } catch (InstantiationException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			//} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			//} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			//}

	      return null;
	   }
	}