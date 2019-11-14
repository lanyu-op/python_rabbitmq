package com.microservice.rabbitmq.consumer;

import java.util.HashMap;
import java.util.Map;

/*
概念：
生产者 消息的产生方，负责将消息推送到消息队列
消费者 消息的最终接受方，负责监听队列中的对应消息，消费消息
队列 消息的寄存器，负责存放生产者发送的消息
交换机 负责根据一定规则分发生产者产生的消息
绑定 完成交换机和队列之间的绑定

性能排序：fanout > direct >> topic。比例大约为11：10：6
模式：
direct：直连模式，用于实例间的任务分发
topic：话题模式，通过可配置的规则分发给绑定在该exchange上的队列
headers：适用规则复杂的分发，用headers里的参数表达规则
fanout：分发给所有绑定到该exchange上的队列，忽略routing key
*/

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
 
//@Component
@Configuration
public class RabbitmqConfig2 {
 
	//@RabbitListener(queues = {RabbitConfig.QUEUE},containerFactory = "customContainerFactory")
	@Bean("customContainerFactory")
    public SimpleRabbitListenerContainerFactory containerFactory
    (SimpleRabbitListenerContainerFactoryConfigurer configurer, ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        // 10是并发数量，即支持的同时处理的线程数量
        factory.setConcurrentConsumers(10);
        factory.setMaxConcurrentConsumers(10);
        configurer.configure(factory, connectionFactory);
        return factory;
    }
	
    // 采集主队列-路由
    public static final String COLLECTOR_QUEUE = "collector_queue";

    public static final String COLLECTOR_QUEUE0 = "collector_queue0";
    
    public static final String COLLECTOR_QUEUE1 = "collector_queue1";
    
    // 采集子队列-短信报警
    public static final String NOTICE_QUEUE_MSG = "notice_queue_msg";
    
    // 采集子队列-邮件报警
    public static final String NOTICE_QUEUE_MAIL = "notice_queue_mail";    
 
    // 死信队列
    public static final String DX_NOTICE_QUEUE = "dx_queue";  
    
    //广播交换机
    private static final String NOTICE_EXCHANGE = "notice_exchange";
    //死信交换机
    private static final String DX_EXCHANGE = "dx_exchange";
    //采集直连交换机
    private static final String DIRECT_EXCHANGE0 = "direct_exchange0";
    private static final String DIRECT_EXCHANGE1 = "direct_exchange1";
    //广播交换机
    private static final String COLLECTOR_EXCHANGE = "collector_exchange";
 
 // -------------------------------------------- Fanout Exchange形式 ------------------------------------------- //
    // 是否持久化
    boolean durable = true;
    // 仅创建者可以使用的私有队列，断开后自动删除
    boolean exclusive = false;
    // 当所有消费客户端连接断开后，是否自动删除队列
    boolean autoDelete = false;
    
    private Queue createBufferedQueue(String queueName, String topic, String routeKey, int bufferedTime) {
    	Map<String, Object> args = new HashMap<>();
    	args.put("x-dead-letter-exchange", topic);
    	args.put("x-dead-letter-routing-key", routeKey);
    	args.put("x-message-ttl", bufferedTime);
    	args.put("x-max-priority", 10);
    	// 是否持久化
    	boolean durable = true;
    	// 仅创建者可以使用的私有队列，断开后自动删除
    	boolean exclusive = false;
    	// 当所有消费客户端连接断开后，是否自动删除队列
    	boolean autoDelete = false;
    	 
    	return new Queue(queueName, durable, exclusive, autoDelete, args);
    	}
    
    // 1.定义采集主队列
    @Bean(name="CollectorQueue")
    public Queue CollectorQueue() {
        return new Queue(COLLECTOR_QUEUE,true);
    }
    
    @Bean
    public DirectExchange directExchange0() {
        return new DirectExchange(DIRECT_EXCHANGE0);
    }
    @Bean
    public DirectExchange directExchange1() {
        return new DirectExchange(DIRECT_EXCHANGE1);
    }    
    @Bean(name="CollectorQueue0")
    public Queue CollectorQueue0() {
    	int bufferedTime = 1000*60*60*24;//消息保存一天，一天后不消费转入死信队列
        return createBufferedQueue(COLLECTOR_QUEUE0,DX_EXCHANGE,"dxRoutingKey", bufferedTime);
    }
    @Bean
    Binding bindingExchangeCollectorQueue0() {
        return BindingBuilder.bind(CollectorQueue0()).to(directExchange0()).with("collectRoutingKey");
    }
    @Bean(name="CollectorQueue1")
    public Queue CollectorQueue1() {
    	int bufferedTime = 1000*60*60*24;//消息保存一天，一天后不消费转入死信队列
        return createBufferedQueue(COLLECTOR_QUEUE1,DX_EXCHANGE,"dxRoutingKey", bufferedTime);
    }
    @Bean
    Binding bindingExchangeCollectorQueue1() {
        return BindingBuilder.bind(CollectorQueue1()).to(directExchange1()).with("collectRoutingKey");
    }   
    // 1.定义采集子队列-短信报警
    @Bean(name="NoticeQueueMsg")
    public Queue NoticeQueueMsg() {
        return new Queue(NOTICE_QUEUE_MSG,true);
    }
    // 1.定义采集子队列-邮件报警
    @Bean(name="NoticeQueueMail")
    public Queue NoticeQueueMail() {
        return new Queue(NOTICE_QUEUE_MAIL,true);
    }
    // 1.定义死信队列
    @Bean(name="DxQueue")
    public Queue DxQueue() {
    	 return new Queue(DX_NOTICE_QUEUE,true);
    }   
    /*定义死信交换机
    @Bean(autowire = Autowire.BY_NAME, value = "springdfHighTopic")
    TopicExchange springdfHighTopic() {
    return new TopicExchange(springdfHighTopic);
    }
    @Bean
    Binding springHighdf(Queue springdfHighQueue, TopicExchange springdfHighTopic) {
    return BindingBuilder.bind(springdfHighQueue).to(springdfHighTopic).with(springdfHighRouteKey);
    }
     */
    // 2.1定义死信交换机
    @Bean
    public TopicExchange dxExchange() {
        return new TopicExchange(DX_EXCHANGE);
    }
    
    // 2.1定义Fanout交换机
    @Bean
    public FanoutExchange noticeExchange() {
        return new FanoutExchange(NOTICE_EXCHANGE);
    }
    // 2.1定义Fanout交换机
    @Bean
    public FanoutExchange collectorExchange() {
        return new FanoutExchange(COLLECTOR_EXCHANGE);
    }     
    // 2.1定义topic交换机
    //@Bean
    //TopicExchange topicOrderExchange() {
    //    return new TopicExchange(ORDER_EXCHANGE_NAME);
    //}
    
    // 3.订单队列与直连交换机绑定,bindingExchangeOrderDicQueue0 名称是唯一
    //@Bean
    //Binding bindingExchange0() {
    //    return BindingBuilder.bind(OrderDicQueue()).to(directOrderExchange()).with("orderRoutingKey");
    //}

    // 3.短信队列与扇形交换机绑定
    @Bean
    Binding bindingExchange0() {
        return BindingBuilder.bind(NoticeQueueMsg()).to(noticeExchange());
    }    
    // 3.邮件队列与扇形交换机绑定
    @Bean
    Binding bindingExchange1() {
        return BindingBuilder.bind(NoticeQueueMail()).to(noticeExchange());
    }  
    // 3.采集队列与扇形交换机绑定
    @Bean
    Binding bindingExchange2() {
        return BindingBuilder.bind(CollectorQueue()).to(collectorExchange());
    }       

    // 4.死信绑定
    @Bean
    Binding bindingExchange_dx() {
        return BindingBuilder.bind(DxQueue()).to(dxExchange()).with("dxRoutingKey");
    }     
    /*// 3.补单队列与交换机绑定
    @Bean
    Binding bindingExchangeCreateOrder() {
        return BindingBuilder.bind(OrderDicQueue()).to(directOrderExchange()).with("orderRoutingKey");
    }*/
 
}