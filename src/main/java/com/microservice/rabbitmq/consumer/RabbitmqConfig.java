package com.microservice.rabbitmq.consumer;

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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
 
//@Component
//@Configuration
public class RabbitmqConfig {
 
    // 下单并且派单存队列
    public static final String ORDER_DIC_QUEUE = "order_dic_queue";
    public static final String ORDER_DIC_QUEUE_LOG = "order_dic_queue_log";
    // 补单队列，判断订单是否已经被创建
    public static final String ORDER_CREATE_QUEUE = "order_create_queue";
    // 下单并且派单交换机
    private static final String ORDER_EXCHANGE_NAME = "order_exchange_name";
    private static final String ORDER_EXCHANGE_NAME1 = "order_exchange_name1";
 // -------------------------------------------- Fanout Exchange形式 ------------------------------------------- //

    // 1.定义派单队列
    @Bean(name="OrderDicQueue")
    public Queue OrderDicQueue() {
        return new Queue(ORDER_DIC_QUEUE,false);
    }
    // 1.定义派单log队列
    @Bean(name="OrderDicLogQueue")
    public Queue OrderDicLogQueue() {
        return new Queue(ORDER_DIC_QUEUE_LOG,false);
    }
/*
    // 2.定义补订单队列
    @Bean
    public Queue directCreateOrderQueue() {
        return new Queue(ORDER_CREATE_QUEUE);
    }*/
 
    // 2.定义直连交换机
    @Bean
    DirectExchange directOrderExchange() {
        // 参数1：队列
        // 参数2：是否持久化
        // 参数3：是否自动删除
        return new DirectExchange(ORDER_EXCHANGE_NAME);
    }
    // 2.1定义Fanout交换机
    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(ORDER_EXCHANGE_NAME1);
    }
     
    // 2.1定义topic交换机
    //@Bean
    //TopicExchange topicOrderExchange() {
    //    return new TopicExchange(ORDER_EXCHANGE_NAME);
    //}
    
    // 3.订单队列与直连交换机绑定,bindingExchangeOrderDicQueue0 名称是唯一
    @Bean
    Binding bindingExchangeOrderDicQueue0() {
        return BindingBuilder.bind(OrderDicQueue()).to(directOrderExchange()).with("orderRoutingKey");
    }

    // 3.订单队列与扇形交换机绑定
    @Bean
    Binding bindingExchangeOrderDicQueue1() {
        return BindingBuilder.bind(OrderDicLogQueue()).to(fanoutExchange());
    }    
    
    /*// 3.补单队列与交换机绑定
    @Bean
    Binding bindingExchangeCreateOrder() {
        return BindingBuilder.bind(OrderDicQueue()).to(directOrderExchange()).with("orderRoutingKey");
    }*/
 
}