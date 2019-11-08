package com.microservice.rabbitmq.devices.mapper;

import com.microservice.rabbitmq.devices.entity.DevSubboardInfo;
import com.microservice.rabbitmq.devices.entity.DevSubboardInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevSubboardInfoMapper {
    long countByExample(DevSubboardInfoExample example);

    int deleteByExample(DevSubboardInfoExample example);

    int insert(DevSubboardInfo record);

    int insertSelective(DevSubboardInfo record);

    List<DevSubboardInfo> selectByExample(DevSubboardInfoExample example);

    int updateByExampleSelective(@Param("record") DevSubboardInfo record, @Param("example") DevSubboardInfoExample example);

    int updateByExample(@Param("record") DevSubboardInfo record, @Param("example") DevSubboardInfoExample example);
}