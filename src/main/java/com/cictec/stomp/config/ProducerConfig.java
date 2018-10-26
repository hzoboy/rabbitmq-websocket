//package com.cictec.stomp.config;
//
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.Queue;
//import org.springframework.amqp.core.TopicExchange;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author :zoboy
// * @Description:
// * @ Date: Created in 2018-10-25 09:43
// */
//@Configuration
//public class ProducerConfig {
//
//    @Bean(name="message")
//    public Queue queueMessage() {
//        return new Queue("message");
//    }
//
//    @Bean
//    public TopicExchange exchange() {
//        return new TopicExchange("exchange");
//    }
//
//    @Bean
//    Binding bindingExchangeMessage(@Qualifier("message") Queue queueMessage, TopicExchange exchange) {
//        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
//    }
//}
