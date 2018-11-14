package com.devhh.feignconsumer.web;

import com.devhh.feignconsumer.service.SchedualServiceHello;
import com.devhh.feignconsumer.service.SchedualServiceHi;
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
    SchedualServiceHi schedualServiceHi;//编译器报错，无视。 因为这个Bean是在程序启动的时候注入容器，编译器感知不到，所以报错。
    @Autowired
    SchedualServiceHello schedualServiceHello;

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHi(name);
    }

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam String name){
        return  schedualServiceHello.sayHello(name);
    }
}
