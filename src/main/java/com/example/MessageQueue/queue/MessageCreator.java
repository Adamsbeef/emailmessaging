package com.example.MessageQueue.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class MessageCreator  implements CommandLineRunner {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @Override
    public void run(String... args) throws Exception {
        this.jmsMessagingTemplate.convertAndSend(this.queue, "Damn this is so cool if this shit actually works");
        System.out.println("Message has been put to queue by sender");

    }
}
