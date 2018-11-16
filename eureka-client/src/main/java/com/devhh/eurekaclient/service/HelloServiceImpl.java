package com.devhh.eurekaclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author devhh
 * @version 1.0.0
 * @since 2018-11-16 10:03
 */
@Service
@RestController
public class HelloServiceImpl implements HelloService {

    @Value("${server.port}")
    String port;

    public String sayHello(String name){
        return "hello "+ name +" ,i am form port:"+port;
    }

    public String sayGoodbye(String name){
        return "hello "+ name +" ,i am form port:"+port;
    }
}
