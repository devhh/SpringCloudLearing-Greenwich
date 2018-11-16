package com.devhh.ribbonconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * HelloService消费者
 * @author devhh
 * @version 1.0.0
 * @since 2018-11-14 11:43
 */
@Service
public class HelloServiceConsumer {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHello(String name){
        return  restTemplate.getForObject("http://service-hello/sayHello?name="+name,String.class);
    }

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayGoodbye(String name){
        return  restTemplate.getForObject("http://service-hello/sayGoodbye?name="+name,String.class);
    }

    public String hiError(String name){
        return "hi,"+name+",sorry,error!";
    }
}
