package com.cjb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringBootController {
    @RequestMapping("/springboot/jsp")
    public String jsp(Model model){
        model.addAttribute("data","springboot 使用 jsp");
        return "index";
    }
}
