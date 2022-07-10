package com.wang.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wang.service.HelloService;
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String test(String name) {
        return "hello8081"+name;
    }
}
