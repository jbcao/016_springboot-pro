package com.cjb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootController {
    @RequestMapping("/user/account")
    @ResponseBody
    public String queryAccount(){
        return "/user/account";
    }
    @RequestMapping("/user/login")
    @ResponseBody
    public String queryUser(){
        return "/user/login";
    }
}
