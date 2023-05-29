package com.cjb.controller;

import com.cjb.model.SchoolInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HelloController {
    //    @Value("${server.port}")
    private String port;
    @Value("${school.name}")
    private String name;
    //    @Value("${site}")
    private String site;
    @Resource
    //自动注入，先按名字 后按类型
    private SchoolInfo schoolInfo;

    @RequestMapping("/hello")
    @ResponseBody
    public String doHello() {
        return port + name + site;
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public SchoolInfo doHello2() {
        return schoolInfo;
    }
}
