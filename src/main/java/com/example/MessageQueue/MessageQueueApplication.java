package com.example.MessageQueue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;

@SpringBootApplication
public class MessageQueueApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageQueueApplication.class, args);
    }

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("badguy.queu");
    }
}
