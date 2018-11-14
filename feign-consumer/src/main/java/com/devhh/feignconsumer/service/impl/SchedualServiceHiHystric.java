package com.devhh.feignconsumer.service.impl;

import com.devhh.feignconsumer.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author devhh
 * @version 1.0.0
 * @since 2018-11-14 16:47
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHi(String name) {
        return "sorry "+name;
    }
}
