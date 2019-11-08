package com.microservice.rabbitmq.analysis.impl;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.microservice.rabbitmq.component.DecryptionHelper;
import com.microservice.rabbitmq.component.XORCrypto;
import com.microservice.rabbitmq.component.XORUtils;
import com.microservice.rabbitmq.consumer.DispatchConsumer;

import lombok.extern.slf4j.Slf4j;
//消息通信安全基类
@Slf4j
public class DeviceBase {

	//
	public JSONObject converMsg(Message message) throws Exception {
        String messageId = message.getMessageProperties().getMessageId();
        String msg = new String(message.getBody(), "UTF-8");
        //System.out.println("消息转换:" + msg + ",消息id:" + messageId);
        JSONObject jsonObject = JSONObject.parseObject(msg);
        String msgId = jsonObject.getString("msgId");
        //String devType = jsonObject.getString("devType");
        //String echoType = jsonObject.getString("echoType");
        String uploadCode = jsonObject.getString("uploadCode");
        if (StringUtils.isEmpty(msgId)||!msgId.equals(messageId)) {
            // 日志记录
            throw new Exception("消息id为空或消息ID对比失败");
            //return null;
        }
        if (StringUtils.isEmpty(uploadCode)) {
            // 日志记录
            throw new Exception("上传消息为空");
            //return null;
        }        
        //base64解码
        String base64decode = new String(Base64.getDecoder().decode(uploadCode), StandardCharsets.UTF_8);
        log.debug("base64解码后："+base64decode);
       
        //异或解密
        String decryptionXOR = DecryptionHelper.decryption(base64decode);
       
        // 解密数据, 返回明文
        //byte[] plainBytes = XORUtils.encrypt(decode.getBytes(), key.getBytes());
        
        //String uploadCodeXor=new String(plainBytes);
        log.debug("异或解码后："+decryptionXOR);
        jsonObject.put("uploadCodeD", decryptionXOR);
        return jsonObject;
	}
	
	public static JSONObject converMsgDirect(Message message) throws Exception {
        String msg = new String(message.getBody(), "UTF-8");
        //base64解码
        String base64decode = new String(Base64.getDecoder().decode(msg), StandardCharsets.UTF_8);
        //log.debug("base64解码后："+base64decode);
        //异或解密
        String decryptionXOR = DecryptionHelper.decryption(base64decode);
       
        // 解密数据, 返回明文
        //byte[] plainBytes = XORUtils.encrypt(decode.getBytes(), key.getBytes());
        
        //String uploadCodeXor=new String(plainBytes);
        //log.debug("异或解码后："+decryptionXOR);
        JSONObject jsonObject = JSONObject.parseObject(decryptionXOR);
        return jsonObject;
	}
	
}
