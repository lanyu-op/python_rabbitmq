package com.microservice.rabbitmq.devices.mapper;

import com.microservice.rabbitmq.devices.entity.DevBoxInfo;
import com.microservice.rabbitmq.devices.entity.DevBoxInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevBoxInfoMapper {
    long countByExample(DevBoxInfoExample example);

    int deleteByExample(DevBoxInfoExample example);

    int insert(DevBoxInfo record);

    int insertSelective(DevBoxInfo record);

    List<DevBoxInfo> selectByExample(DevBoxInfoExample example);

    int updateByExampleSelective(@Param("record") DevBoxInfo record, @Param("example") DevBoxInfoExample example);

    int updateByExample(@Param("record") DevBoxInfo record, @Param("example") DevBoxInfoExample example);
}