package com.zjm.spring.cloud.alibaba.consumer.service;

import com.zjm.spring.cloud.alibaba.consumer.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "service-provider",fallback = EchoServiceFallback.class)
public interface EchoService {
    @GetMapping("/echo/{string}")
    public String echo(@PathVariable("string") String string);

    @GetMapping("/lb")
    public String lb();
}
