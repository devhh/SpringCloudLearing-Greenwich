package com.devhh.configclient.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author devhh
 * @version 1.0.0
 * @since 2018-11-19 17:46
 */
@Component
@RabbitListener
public class Receiver {
    private static final Logger log = LoggerFactory.getLogger(Receiver.class);

    @RabbitHandler
    public void process(String hello) {
        log.info("Receiver : " + hello);
    }
}
