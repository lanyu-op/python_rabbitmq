package com.microservice.rabbitmq.devices.mapper;

import com.microservice.rabbitmq.devices.entity.DevBoardInfo;
import com.microservice.rabbitmq.devices.entity.DevBoardInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevBoardInfoMapper {
    long countByExample(DevBoardInfoExample example);

    int deleteByExample(DevBoardInfoExample example);

    int insert(DevBoardInfo record);

    int insertSelective(DevBoardInfo record);

    List<DevBoardInfo> selectByExample(DevBoardInfoExample example);

    int updateByExampleSelective(@Param("record") DevBoardInfo record, @Param("example") DevBoardInfoExample example);

    int updateByExample(@Param("record") DevBoardInfo record, @Param("example") DevBoardInfoExample example);
}