package com.devhh.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RefreshScope
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    //刷新消息总线配置
    // http://localhost:8881/actuator/bus-refresh 需要用post请求
    //springcloud G.M1版本，通过post请求，会报错，springcloud已确认是bug，在后续版本会修复

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/foo")
    public String getFoo() {
        return foo;
    }
}
