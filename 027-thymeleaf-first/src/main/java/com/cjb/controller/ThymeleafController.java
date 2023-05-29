package com.cjb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ThymeleafController {
    @RequestMapping("/demo")
    public String demo(HttpServletRequest  request){
        request.setAttribute("data","hello thymeleaf");
        return "main";
    }
}
