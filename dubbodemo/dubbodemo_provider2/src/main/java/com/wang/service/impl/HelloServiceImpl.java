package com.wang.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wang.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = HelloService.class)
@Transactional
public class HelloServiceImpl implements HelloService {
    @Override
    public String test(String name) {
        return "hello8083"+name;
    }
}
