package com.cjb.config;

import com.cjb.web.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyAppConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String path[] ={"/user/*"};
        String exclude[]={"/user/login"};
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(path).excludePathPatterns(exclude);
    }
}
