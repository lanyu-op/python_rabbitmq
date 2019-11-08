package com.microservice.rabbitmq.devices.mapperx;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DevManageMapper {

    String delAllTable(@Param(value="userid") String userid);

}