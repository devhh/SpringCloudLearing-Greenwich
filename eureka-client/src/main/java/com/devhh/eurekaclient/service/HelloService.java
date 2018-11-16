package com.devhh.eurekaclient.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author devhh
 * @version 1.0.0
 * @since 2018-11-16 10:02
 */
public interface HelloService {

    @RequestMapping("/sayHello")
    String sayHello(@RequestParam(value = "name") String name);

    @RequestMapping("/sayGoodbye")
    String sayGoodbye(@RequestParam(value = "name") String name);

}
