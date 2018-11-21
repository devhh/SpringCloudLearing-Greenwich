package com.devhh.servicezipkinmiya.service;

import brave.sampler.Sampler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author devhh
 * @version 1.0.0
 * @since 2018-11-20 14:52
 */
@RestController
public class ZipkinMiyaService {

    private static  final Logger logger = LoggerFactory.getLogger(ZipkinMiyaService.class);

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public Sampler deaultSampler(){
        return  Sampler.ALWAYS_SAMPLE;
    }

    @RequestMapping(value = "/hi")
    public String home(){
        logger.info("hi is being called");
        return "hi i'm miya!";
    }

    @RequestMapping("/miya")
    public String info(){
        logger.info("info is being called");
        return restTemplate.getForObject("http://localhost:8768/info",String.class);
    }

}
