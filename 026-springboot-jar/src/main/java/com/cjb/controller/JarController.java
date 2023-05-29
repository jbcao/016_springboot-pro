package com.cjb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JarController {
    @GetMapping("/getPage")
    public ModelAndView getView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data","springboot jar");
        modelAndView.setViewName("main");
        return modelAndView;
    }
}
