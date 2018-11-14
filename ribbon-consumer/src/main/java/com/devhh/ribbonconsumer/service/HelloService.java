package com.devhh.ribbonconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author devhh
 * @version 1.0.0
 * @since 2018-11-14 11:43
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String name){
        return  restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }

    public String sayHello(String name){
        return  restTemplate.getForObject("http://service-hello/hello?name="+name,String.class);
    }

    public String hiError(String name){
        return "hi,"+name+",sorry,error!";
    }
}
