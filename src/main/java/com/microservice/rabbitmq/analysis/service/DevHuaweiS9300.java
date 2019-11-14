package com.microservice.rabbitmq.analysis.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bouncycastle.est.ESTService;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.microservice.rabbitmq.analysis.impl.Device;
import com.microservice.rabbitmq.analysis.impl.DeviceBase;
import com.microservice.rabbitmq.component.CommonUtils;
import com.microservice.rabbitmq.component.SpinLock;
import com.microservice.rabbitmq.consumer.DispatchConsumer;
import com.microservice.rabbitmq.devices.entity.DevBasicInfo;
import com.microservice.rabbitmq.devices.entity.DevBasicInfoExample;
import com.microservice.rabbitmq.devices.entity.DevBoardInfo;
import com.microservice.rabbitmq.devices.entity.DevBoxInfo;
import com.microservice.rabbitmq.devices.entity.DevChassisInfo;
import com.microservice.rabbitmq.devices.entity.DevChassisInfoExample;
import com.microservice.rabbitmq.devices.entity.DevInterfaceInfo;
import com.microservice.rabbitmq.devices.entity.DevSubboardInfo;
import com.microservice.rabbitmq.devices.mapper.DevBasicInfoMapper;
import com.microservice.rabbitmq.devices.mapper.DevBoardInfoMapper;
import com.microservice.rabbitmq.devices.mapper.DevChassisInfoMapper;
import com.microservice.rabbitmq.devices.mapper.DevInterfaceInfoMapper;
import com.microservice.rabbitmq.devices.mapper.DevSubboardInfoMapper;
import com.microservice.rabbitmq.devices.mapperx.DevManageMapper;
import com.microservice.rabbitmq.service.EchoDbService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
public class DevHuaweiS9300 extends DeviceBase implements Device {
	
	//@Autowired
	//EchoDbService EchoDbService;
	private static SpinLock mLock = new SpinLock();
	@Autowired
	DevChassisInfoMapper devChassisInfoMapper;	
	@Autowired
	DevBoardInfoMapper devBoardInfoMapper;
	@Autowired
	DevBasicInfoMapper devBasicInfoMapper;	
	@Autowired
	DevSubboardInfoMapper devSubboardInfoMapper;
	@Autowired
	DevManageMapper devManageMapper;
	
	@Autowired
	DevInterfaceInfoMapper devInterfaceInfoMapper;
	
	@Override
	public JSONObject analysisMessage(Message message,String echoType) throws Exception {
		// TODO Auto-generated method stub
		//回显转换json
		
		JSONObject jsono=converMsg(message);
		String uploadCodeD = jsono.getString("uploadCodeD");		
		//命令切换
		if(echoType.equalsIgnoreCase("echo1")) {
			//正则解析echoCode
			//jsono.put("echoCodeD", echoCode);
			
		}
		return jsono;
	}

	@Override
	public JSONObject analysisMessage(Message message) throws Exception {
		//回显转换json
		JSONObject jsono=converMsg(message);
        //String devType = jsono.getString("devType");
        String echoType = jsono.getString("echoType");
		String echoCode = jsono.getString("uploadCodeD");		
		//命令切换
		if(echoType.equalsIgnoreCase("echo1")) {
			//正则解析echoCode,解析为我们定义的json,用于写数据库。
			//jsono.put("echoCodeD", echoCode);
			
		}
		return jsono;
	}

	@Override
	public int insertDB(JSONObject jsonObject) {

		// TODO Auto-generated method stub
		//1、解析后的我们格式的json
		//2、判断当前echo 类型
		//3、根据不同类型写数据库
	      //String devType = jsono.getString("devType");
        String echoType = jsonObject.getString("Cmd");
		String Content = jsonObject.getString("Content");	
		log.debug("===========insertDB=============="+echoType);
		if(echoType.equalsIgnoreCase("display  device")) {
			//正则解析echoCode,解析为我们定义的json,用于写数据库。
			
			log.debug(Content);
			log.debug("===========插入数据库成功==============");

		}
		//大于0，插入数据库成功。
		return 1;
	}

	@Override
	public JSONObject analysisMessage(JSONObject json) throws UnsupportedEncodingException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	 private static JSONArray diguiFunction(Map<String,Object> map){
			JSONArray array=null;
		for(Entry<String,Object> entry: map.entrySet() ){
			
				String key = entry.getKey();
				Object value = entry.getValue();
			
				if(value instanceof JSONObject){
					JSONObject jsonObject = (JSONObject) value;
					diguiFunction((Map)jsonObject);
				}else if(value instanceof JSONArray){
					 array = (JSONArray)value;
					
					//log.debug("========================="+array.size());
					//log.debug(array);
					//System.out.println(array);
				}else{
				}
				
				
		}

		return array;
	 }
	@Override
	@Transactional
	public int insertDB(Map<String, Object> map,List<DevBoxInfo> ll) throws Exception{

		int flag=0;
			// TODO Auto-generated method stub
			log.debug("===========insertDB=============="+map.get("Cmd"));
			if(	
					CommonUtils.zhengzeSpace(map.get("Cmd").toString(), "device4372662")
					) {
				//暂废弃，不处理
				
				//正则解析echoCode,解析为我们定义的json,用于写数据库。
				//diguiFunction(map);
				//log.debug(Content);
				//Map<String, Object> content=(Map<String, Object>) map.get("Content");
				JSONArray content=(JSONArray) map.get("Content");
				//diguiFunction(map.get("Content"));
				
				for(int i=0;i<content.size();i++) {
					//log.debug("========================"+i);
					Map<String, Object> xxx=(Map<String, Object>) content.get(i);
					log.debug("=============机柜==========="+xxx.get("Chassis"));
					//ll.get(0).getUserId()
					//DevChassisInfoExample example =new DevChassisInfoExample();
					//example.createCriteria()
					//.andChassisNameEqualTo(""+xxx.get("Chassis"))
					//.andDeviceTypeEqualTo(""+map.get("devType"))
					//.andBasicinfoIdEqualTo(ll.get(0).getId());
					//List<DevChassisInfo> ls=devChassisInfoMapper.selectByExample(example);
					//if(ls.size()>0) {
						//如果一样则不删
						/*
						devChassisInfoMapper.deleteByExample(example);
						DevChassisInfo devChassisInfo =new DevChassisInfo();
						devChassisInfo.setChassisName(""+xxx.get("Chassis"));
						devChassisInfo.setDeviceType(""+map.get("devType"));
						devChassisInfo.setBasicinfoId(ll.get(0).getId());
						devChassisInfoMapper.insertSelective(devChassisInfo);
						*/
					//}else {
						//if(ls.size()>0) {
						//	DevChassisInfoExample example1 =new DevChassisInfoExample();
						//	example1.createCriteria().andIdEqualTo(ls.get(0).getId());
						//	devChassisInfoMapper.deleteByExample(example1);
						//}
						DevChassisInfo devChassisInfo =new DevChassisInfo();
						devChassisInfo.setChassisName(""+xxx.get("Chassis"));
						devChassisInfo.setDeviceType(""+map.get("devType"));
						devChassisInfo.setBasicinfoId(ll.get(0).getId());//设备ID
						int chassid=devChassisInfoMapper.insertSelective(devChassisInfo);//机柜ID
					//}
					List list=(List) xxx.get("devinfo");
					for(int y=0;y<list.size();y++) {
						Map<String, Object>  xxx1=(Map<String, Object>) list.get(y);
						log.debug("============槽位============"+xxx1.get("slot"));
						//DevBoardInfo record=new DevBoardInfo();
						//record.setBasicInfoId(ll.get(0).getId());
						//record.setChassisId(chassid);
						//devBoardInfoMapper.insertSelective(record);
						if(xxx1.get("subinfo")!=null) {
							List list1=(List)xxx1.get("subinfo");
							if(list1.size()>0) {
								for(int a=0;a<list1.size();a++) {
									Map<String, Object>  xxx2=(Map<String, Object>) list1.get(a);
										
										log.debug("============子卡============"+xxx2.get("Type"));
								}
							}
						}
					}
					//log.debug(""+content.gets.get("Chassis"));
					//Map<String, Object> devinfo=(Map<String, Object>) content.get("devinfo");
					//for(int y=0;y<devinfo.size();y++) {
					//	log.debug(""+devinfo.get(y));
						
					//}
				}
				
			return 1;
		
			}else if(
					CommonUtils.zhengzeSpace(map.get("Cmd").toString(),new String[]{"display","version"})
					) {

				//正则解析echoCode,解析为我们定义的json,用于写数据库。
				//diguiFunction(map);
				//log.debug(Content);
				//Map<String, Object> content=(Map<String, Object>) map.get("Content");
				JSONArray content=(JSONArray) map.get("Content");
				//diguiFunction(map.get("Content"));
				
				for(int i=0;i<content.size();i++) {
					//log.debug("========================"+i);
					Map<String, Object> xxx=(Map<String, Object>) content.get(i);
					log.debug("------------写机柜------------"+xxx.get("Chassis"));
					log.debug("------------写机柜------------"+xxx.get("product"));
					log.debug("------------写机柜------------"+xxx.get("devIp"));
					log.debug("------------写机柜------------"+xxx.get("version"));
					log.debug("------------写机柜------------"+xxx.get("uptime"));
					DevBasicInfo record=new DevBasicInfo();
					record.setUserId(ll.get(0).getUserId());
					record.setDeviceName(""+xxx.get("product"));
					record.setDeviceVerison(""+xxx.get("version"));
					record.setIpAddress(""+xxx.get("devIp"));
					record.setDeviceRunTime(""+xxx.get("uptime"));
					int recordid=devBasicInfoMapper.insertSelective(record);
				
					DevChassisInfo devChassisInfo =new DevChassisInfo();
					devChassisInfo.setChassisName(""+xxx.get("Chassis"));
					devChassisInfo.setDeviceType(""+map.get("devType"));
					devChassisInfo.setBasicinfoId(record.getId());//设备ID
					int chassid=devChassisInfoMapper.insertSelective(devChassisInfo);//机柜ID		
					List list=(List) xxx.get("boardinfo");
					for(int y=0;y<list.size();y++) {
						Map<String, Object>  xxx1=(Map<String, Object>) list.get(y);
						log.debug("------------写单板------------"+xxx1.get("boardname"));
						DevBoardInfo record_dbi=new DevBoardInfo();
						record_dbi.setBasicInfoId(record.getId());
						record_dbi.setChassisId(devChassisInfo.getId());
						record_dbi.setBoardName(""+xxx1.get("boardname"));
						record_dbi.setBoardPcbVersion(""+xxx1.get("PCB"));
						record_dbi.setBoardUpTime(""+xxx1.get("uptime"));
						record_dbi.setSdram(""+xxx1.get("SDRAMMemorySize"));
						//record_dbi.setBoardType(boardType);
						//record_dbi.setSlot(slot);
						devBoardInfoMapper.insertSelective(record_dbi);
						
						if(xxx1.get("subboardinfo")!=null) {
							List list1=(List)xxx1.get("subboardinfo");
							if(list1.size()>0) {
								for(int a=0;a<list1.size();a++) {
									Map<String, Object>  xxx2=(Map<String, Object>) list1.get(a);
									DevSubboardInfo record_dsi=new DevSubboardInfo();
									record_dsi.setPicVersion(""+xxx2.get("PCB"));
									record_dsi.setPicname(""+xxx2.get("picname"));
									record_dsi.setPicSlot(""+xxx2.get("picslot"));
									record_dsi.setBoardId(record_dbi.getId());
									devSubboardInfoMapper.insertSelective(record_dsi);
									
										log.debug("------------写子卡------------"+xxx2.get("picname"));
										log.debug("------------写子卡------------"+xxx2.get("picslot"));
										log.debug("------------写子卡------------"+xxx2.get("PCB"));
								}
							}
						}
					}

				}
				
			
				return 1;
			
			}
			
			else if(
					CommonUtils.zhengzeSpace(map.get("Cmd").toString(),new String[]{"display","interface","brief"})
					) {

				log.debug("------------interface-brief命令------------");
				String devIp=map.get("devIp").toString();
				
		        DevBasicInfoExample example=new DevBasicInfoExample();
		        example.createCriteria().andIpAddressEqualTo(devIp).andUserIdEqualTo(ll.get(0).getUserId());
		        List<DevBasicInfo> devlist=devBasicInfoMapper.selectByExample(example);
		        String basicinfo_id=devlist.get(0).getId();
				
				JSONArray content=(JSONArray) map.get("Content");
				
				for(int i=0;i<content.size();i++) {
					//log.debug("========================"+i);
					Map<String, Object> xxx=(Map<String, Object>) content.get(i);
					log.debug("------------写接口------------"+xxx.get("interaface"));
					log.debug("------------写接口------------"+xxx.get("PHY"));
					log.debug("------------写接口------------"+xxx.get("Protocol"));
					log.debug("------------写接口------------"+xxx.get("InUti"));
					log.debug("------------写接口------------"+xxx.get("OutUti"));
					log.debug("------------写接口------------"+xxx.get("inErrors"));
					log.debug("------------写接口------------"+xxx.get("outErrors"));
				
					
					DevInterfaceInfo record=new DevInterfaceInfo();
					record.setInterfaceName(""+xxx.get("interaface"));
					//record.setInterfaceSlot(interfaceSlot);
					//record.setInterfaceType(interfaceType);
					record.setInUti(""+xxx.get("InUti"));
					record.setOutUti(""+xxx.get("OutUti"));
					record.setPhyStatus(""+xxx.get("PHY"));
					record.setProtocalStatus(""+xxx.get("Protocol"));
					
					record.setBasicinfoId(basicinfo_id);//设备ID
					int recordid=devInterfaceInfoMapper.insertSelective(record);
				
					List list=(List) xxx.get("infaceInfo");
					for(int y=0;y<list.size();y++) {
						Map<String, Object>  xxx1=(Map<String, Object>) list.get(y);
						log.debug("------------写接口------------"+xxx1.get("interaface"));
						
						DevInterfaceInfo record1=new DevInterfaceInfo();
						record1.setInterfaceName(""+xxx1.get("interaface"));
						//record.setInterfaceSlot(interfaceSlot);
						//record.setInterfaceType(interfaceType);
						record1.setInUti(""+xxx1.get("InUti"));
						record1.setOutUti(""+xxx1.get("OutUti"));
						record1.setPhyStatus(""+xxx1.get("PHY"));
						record1.setProtocalStatus(""+xxx1.get("Protocol"));
						record1.setMasterInterName(""+xxx.get("interaface"));
						record1.setBasicinfoId(basicinfo_id);//设备ID
						int recordid1=devInterfaceInfoMapper.insertSelective(record1);
						
			
					}

				}
				return 1;
			
			}

			else if(
					CommonUtils.zhengzeSpace(map.get("Cmd").toString(),new String[]{"display","memory-usage"})
					) {

				log.debug("------------memory-usage命令------------");
					

				
				
			
				return 1;
			
			}
			else if(
					CommonUtils.zhengzeSpace(map.get("Cmd").toString(),new String[]{"display","cpu-usage"})
					) {

				log.debug("------------cpu-usage命令------------");
					

				
				
			
				return 1;
			
			}
			
			else if(
					CommonUtils.zhengzeSpace(map.get("Cmd").toString(), "init")
					) {
			
				//清空相关数据
				log.debug("------------init初始化------------");
				devManageMapper.delAllTable(ll.get(0).getUserId());
				return 1;
			}else{
				//未知命令，返回1删除该消息
				flag=1;
				log.debug("------------未知命令------------");
				
			}
			
			return flag;		


	}



}
