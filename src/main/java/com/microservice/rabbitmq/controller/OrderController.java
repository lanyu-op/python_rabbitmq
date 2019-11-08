package com.microservice.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.rabbitmq.component.BaseApiService;
import com.microservice.rabbitmq.component.ResponseBase;
import com.microservice.rabbitmq.service.impl.OrderService;
 
//rabbitmq做分布式事务
 
@RestController
public class OrderController extends BaseApiService {
    @Autowired
    private OrderService orderService;
 
    @RequestMapping("/addOrder")
    public ResponseBase addOrder() {
        return orderService.addOrderAndDispatch();
    }

    @RequestMapping("/testdb")
    public ResponseBase testdb() {
        return orderService.addOrderAndDispatch();
    }
}