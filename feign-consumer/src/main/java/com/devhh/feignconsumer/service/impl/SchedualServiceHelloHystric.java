package com.devhh.feignconsumer.service.impl;

import com.devhh.feignconsumer.service.SchedualServiceHello;
import org.springframework.stereotype.Component;

/**
 * Hystric断路器容错处理类
 * @author devhh
 * @version 1.0.0
 * @since 2018-11-14 16:47
 */
@Component
public class SchedualServiceHelloHystric implements SchedualServiceHello {

    @Override
    public String sayHello(String name) {
        return "sorry "+name;
    }

    @Override
    public String sayGoodbye(String name) {
        return "sorry "+name;
    }
}
