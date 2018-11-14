package com.devhh.feignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author devhh
 * @version 1.0.0
 * @since 2018-11-14 16:11
 */
@FeignClient(value = "service-hello")
public interface SchedualServiceHello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);
}
