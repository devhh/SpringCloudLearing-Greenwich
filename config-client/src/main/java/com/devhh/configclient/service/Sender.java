package com.devhh.configclient.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.amqp.dsl.Amqp;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author devhh
 * @version 1.0.0
 * @since 2018-11-19 17:41
 */
@Component
public class Sender {
    private static final Logger logger = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello " + new Date();
        logger.info("Sender : " + context);
        this.amqpTemplate.convertAndSend("hello", context);
    }

}
