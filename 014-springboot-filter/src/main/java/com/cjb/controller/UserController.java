package com.cjb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @RequestMapping(value = "/user/getUser")
    @ResponseBody
    public String gerUser(){
        return "/user/getUser你好你好";
    }
    @RequestMapping(value = "/user/getUser2")
    @ResponseBody
    public Integer gerUser2(){
        return 3;
    }


}
