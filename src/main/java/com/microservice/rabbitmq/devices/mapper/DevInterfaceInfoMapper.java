package com.microservice.rabbitmq.devices.mapper;

import com.microservice.rabbitmq.devices.entity.DevInterfaceInfo;
import com.microservice.rabbitmq.devices.entity.DevInterfaceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevInterfaceInfoMapper {
    long countByExample(DevInterfaceInfoExample example);

    int deleteByExample(DevInterfaceInfoExample example);

    int insert(DevInterfaceInfo record);

    int insertSelective(DevInterfaceInfo record);

    List<DevInterfaceInfo> selectByExample(DevInterfaceInfoExample example);

    int updateByExampleSelective(@Param("record") DevInterfaceInfo record, @Param("example") DevInterfaceInfoExample example);

    int updateByExample(@Param("record") DevInterfaceInfo record, @Param("example") DevInterfaceInfoExample example);
}