package com.zjm.spring.cloud.alibaba.consumer.service.fallback;

import com.zjm.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.stereotype.Component;

@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String string) {
        return "Echo 调用失败";
    }

    @Override
    public String lb() {
        return "Echo 不好意思没有这个服务";
    }
}
