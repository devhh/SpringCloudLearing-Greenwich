package com.devhh.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam(value = "name", defaultValue = "eureka-client") String name){
        return "hi "+ name +" ,i am form port:"+port;
    }

    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "eureka-client") String name){
        return "hello "+ name +" ,i am form port:"+port;
    }
}
