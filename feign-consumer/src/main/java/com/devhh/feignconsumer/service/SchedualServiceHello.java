package com.devhh.feignconsumer.service;

import com.devhh.feignconsumer.service.impl.SchedualServiceHelloHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author devhh
 * @version 1.0.0
 * @since 2018-11-14 16:11
 */
@FeignClient(value = "service-hello", fallback = SchedualServiceHelloHystric.class)
public interface SchedualServiceHello {

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/sayGoodbye", method = RequestMethod.GET)
    String sayGoodbye(@RequestParam(value = "name") String name);
}
