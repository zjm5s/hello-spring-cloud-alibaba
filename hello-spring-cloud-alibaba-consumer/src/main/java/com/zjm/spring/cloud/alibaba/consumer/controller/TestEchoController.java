package com.zjm.spring.cloud.alibaba.consumer.controller;

import com.zjm.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestEchoController {

    @Autowired
    private EchoService echoService;

    @Value("${user.name}")
    private String username;

    @GetMapping("/feign/echo/{string}")
    public String echo(@PathVariable("string") String string){
        return echoService.echo(username);
    }

    @GetMapping("/lb")
    public String lb(){
        return echoService.lb();
    }
}
