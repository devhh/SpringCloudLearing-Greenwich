package com.devhh.servicezipkinhi.service;

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
 * @since 2018-11-20 14:04
 */
@RestController
public class ZipkinHiService {

    private static final Logger LOG = LoggerFactory.getLogger(ZipkinHiService.class);

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/hi")
    public String callHome(){
        LOG.info("calling trace service-hi");
        return restTemplate.getForObject("http://localhost:8769/miya", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        LOG.info("calling trace service-hi ");
        return "i'm service-hi";
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
