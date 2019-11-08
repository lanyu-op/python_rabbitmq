package com.microservice.rabbitmq.component;

import java.util.List;

import com.microservice.rabbitmq.devices.entity.DevBoxInfo;

public class CommonUtils {


    
    public static boolean zhengzeSpace(String string,String target) {
        for(String a:string.split("\\s+")){
        	if(a.equals(target)) {
        		return true;
        	}
           
        }
        return false;
    }

    public static boolean zhengzeSpace(String string,String[] target) {
    	int x=0;
    	int z=target.length;
    	int y=string.split("\\s+").length;
        for(String a:string.split("\\s+")){
        	for(int i=0;i<z;i++){
	        	if(a.equals(target[i])) {
	        		x++;

	        		
	        	}
        	}
           
        }
		if(x==y) {
			return true;	
		}
        return false;
    }
    
}
