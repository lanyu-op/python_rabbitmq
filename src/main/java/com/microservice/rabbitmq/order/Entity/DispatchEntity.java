package com.microservice.rabbitmq.order.Entity;


import lombok.Data;
 
@Data
public class DispatchEntity {
 
    private Long id;
    // 订单号
    private String orderId;
    // 外卖员id
    private Long takeoutUserId;
    
}
