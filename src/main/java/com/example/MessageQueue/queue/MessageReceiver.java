package com.example.MessageQueue.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    private String ME = "blakesmike12@gmail.com";
    private String SUBJECT = "Just Testing My Spring boot app";
    @Autowired
    private EmailServiceImpl emailService;

    @JmsListener(destination = "badguy.queu")
    public void receiveQueue(String text) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        emailService.sendSimpleMessage(ME,SUBJECT,
                text);
        emailService.sendMessageWithAttachment(ME,SUBJECT,text,"/home/mike/cummins");
        System.out.println("Queue Message Received: "+text);
    }

    @JmsListener(destination = "email.queue")
    public void receiveEmailQueue(String text) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        emailService.sendSimpleMessage(ME,SUBJECT,
//                text);
//        emailService.sendMessageWithAttachment(ME,SUBJECT,text,"/home/mike/cummins");
        System.out.println("Queue Message Received: "+text);
    }
}
