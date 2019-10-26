package com.zjm.spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class EchoController {
    @GetMapping("/echo/{string}")
    public String echo(@PathVariable("string") String string) {
        return "Hello Nacos Provider " + string+"sdf";
    }

    @Value("${server.port}")
    private String port;

    @GetMapping("/lb")
    public String lb(){
        return "Your service port is"+ port;
    }
}
