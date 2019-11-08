package com.microservice.rabbitmq.devices.mapper;

import com.microservice.rabbitmq.devices.entity.DevChassisInfo;
import com.microservice.rabbitmq.devices.entity.DevChassisInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevChassisInfoMapper {
    long countByExample(DevChassisInfoExample example);

    int deleteByExample(DevChassisInfoExample example);

    int insert(DevChassisInfo record);

    int insertSelective(DevChassisInfo record);

    List<DevChassisInfo> selectByExample(DevChassisInfoExample example);

    int updateByExampleSelective(@Param("record") DevChassisInfo record, @Param("example") DevChassisInfoExample example);

    int updateByExample(@Param("record") DevChassisInfo record, @Param("example") DevChassisInfoExample example);
}