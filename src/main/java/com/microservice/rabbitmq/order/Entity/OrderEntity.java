package com.microservice.rabbitmq.order.Entity;

import lombok.Data;

@Data
public class OrderEntity {
 
    private Long id;
    // 订单名称
    private String name;
    // 下单金额
    private Double orderMoney;
    // 订单id
    private String orderId;
}