package com.devhh.feignconsumer.web;

import com.devhh.feignconsumer.service.SchedualServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author devhh
 * @version 1.0.0
 * @since 2018-11-14 16:01
 */
@RestController
public class FeignController {

    @Autowired
    SchedualServiceHello schedualServiceHello;//编译器报错，无视。 因为这个Bean是在程序启动的时候注入容器，编译器感知不到，所以报错。

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam String name){
        return  schedualServiceHello.sayHello(name);
    }

    @RequestMapping(value = "/goodbye")
    public  String sayGoodbye(@RequestParam String name){
        return  schedualServiceHello.sayGoodbye(name);
    }
}
