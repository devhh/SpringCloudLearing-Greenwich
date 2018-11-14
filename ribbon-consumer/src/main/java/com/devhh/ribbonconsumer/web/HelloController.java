package com.devhh.ribbonconsumer.web;

import com.devhh.ribbonconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author devhh
 * @version 1.0.0
 * @since 2018-11-14 11:48
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name){
        return helloService.sayHi(name);
    }

    @GetMapping("/hello")
    public  String sayHello(@RequestParam String name){
        return helloService.sayHello(name);
    }
}
