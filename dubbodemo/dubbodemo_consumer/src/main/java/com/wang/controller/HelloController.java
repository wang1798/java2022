package com.wang.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wang.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloController {
    @Reference
    HelloService helloService;
    @RequestMapping("/hello")
    public String test11(String name){
        String test = helloService.test(name);
        return test;
    }
}
