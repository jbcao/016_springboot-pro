package com.cjb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootController {
    @RequestMapping("/hello")
    @ResponseBody
    public String doSth(){
        return "hello springboot";
    }
}
