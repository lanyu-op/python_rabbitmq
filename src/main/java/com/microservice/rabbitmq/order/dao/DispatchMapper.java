package com.microservice.rabbitmq.order.dao;

import org.apache.ibatis.annotations.Insert;

import com.microservice.rabbitmq.order.Entity.DispatchEntity;
 

public interface DispatchMapper {
 
    /**
     * 新增派单任务
     */
    @Insert("INSERT into platoon values (null,#{orderId},#{takeoutUserId});")
    public int insertDistribute(DispatchEntity distributeEntity);
 
}