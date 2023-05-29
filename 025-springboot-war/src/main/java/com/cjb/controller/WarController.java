package com.cjb.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WarController {
    @RequestMapping("/getView")
    public ModelAndView getWar() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", "springboot war");
        modelAndView.setViewName("main");
        return modelAndView;
    }
}
