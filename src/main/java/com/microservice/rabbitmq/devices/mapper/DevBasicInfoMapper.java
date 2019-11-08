package com.microservice.rabbitmq.devices.mapper;

import com.microservice.rabbitmq.devices.entity.DevBasicInfo;
import com.microservice.rabbitmq.devices.entity.DevBasicInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevBasicInfoMapper {
    long countByExample(DevBasicInfoExample example);

    int deleteByExample(DevBasicInfoExample example);

    int insert(DevBasicInfo record);

    int insertSelective(DevBasicInfo record);

    List<DevBasicInfo> selectByExample(DevBasicInfoExample example);

    int updateByExampleSelective(@Param("record") DevBasicInfo record, @Param("example") DevBasicInfoExample example);

    int updateByExample(@Param("record") DevBasicInfo record, @Param("example") DevBasicInfoExample example);
}