package com.pateluday07.amazon.mq.consumer.component;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class Consumer {

    @Value("${activemq.queue.demo}")
    private String queueName;

    @JmsListener(destination = "${activemq.queue.demo}")
    public void consumeMessage(String message) {
        log.info("{} received from {}", message, queueName);
    }
}
