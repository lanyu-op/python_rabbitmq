package com.microservice.rabbitmq.component;

import lombok.Data;

@Data
public class HttpResult {

	public HttpResult(int code, String body) {
		super();
		this.code = code;
		this.body = body;
	}
	private int code;
	private String body;
	
    @Override
    public String toString() {
        return "ResponseBase [rtnCode=" + code + ", msg=" + body +  "]";
    }
 
}