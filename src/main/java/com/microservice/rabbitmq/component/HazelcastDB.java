package com.microservice.rabbitmq.component;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.hazelcast.config.ClasspathXmlConfig;
import com.hazelcast.config.Config;
import com.hazelcast.config.FileSystemXmlConfig;
import com.hazelcast.config.UrlXmlConfig;
import com.hazelcast.config.XmlConfigBuilder;
import com.hazelcast.core.*;
import com.microservice.rabbitmq.service.impl.EchoDbServiceImp;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
public class HazelcastDB {
	public HazelcastDB() throws FileNotFoundException {
		super();
    	configureCluster();
	}

	@Autowired
    private ConfigurableApplicationContext ioc;
	
	private HazelcastInstance hazelcastInstance;//分布式内存数据库产品
    private boolean configureCluster() throws FileNotFoundException {
        log.info("Configuring embedded Hazelcast instance");

        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        
        context.setValidating(false);
        String hzConfigPath = "hazelcast.xml";
        boolean isHzConfigOnClasspath = this.getClass().getClassLoader().getResource(hzConfigPath) != null;
        if (isHzConfigOnClasspath) {
            Config hzconfig = null;
			hzconfig = new ClasspathXmlConfig(hzConfigPath);
            
            log.info("=========Starting Hazelcast instance. ConfigurationFile={}", hzconfig);
            hazelcastInstance = Hazelcast.newHazelcastInstance(hzconfig);
        } else {
        	log.info("Starting Hazelcast instance with default configuration");
            hazelcastInstance = Hazelcast.newHazelcastInstance();
        }


        String nodeIdStr = "1";
        ISet<Integer> nodeIdSet = hazelcastInstance.getSet("node_ids");
        int nodeId=0;
        try {
            nodeId = Integer.parseInt(nodeIdStr);
        }catch (Exception e){
            throw new IllegalArgumentException("nodeId error: " + nodeIdStr);
        }
        if (nodeIdSet != null && nodeIdSet.contains(nodeId)){
        	log.error("只允许一个实例运行，多个实例会引起冲突，进程终止");
            System.exit(-1);
        }

        ShardingUtil.setNodeId(nodeId);
        nodeIdSet.add(nodeId);

        //hazelcastInstance.getCluster().getLocalMember().setStringAttribute(HZ_Cluster_Node_External_Long_Port, longPort);//放到内存数据库里
        //hazelcastInstance.getCluster().getLocalMember().setStringAttribute(HZ_Cluster_Node_External_Short_Port, shortPort);
       // hazelcastInstance.getCluster().getLocalMember().setIntAttribute(HZ_Cluster_Node_ID, nodeId);
        //hazelcastInstance.getCluster().getLocalMember().setStringAttribute(HZ_Cluster_Node_External_IP, serverIp);

        return true;
    }
    
    public HazelcastInstance getHazelcastInstance() throws FileNotFoundException {

        return hazelcastInstance;
    }
}
