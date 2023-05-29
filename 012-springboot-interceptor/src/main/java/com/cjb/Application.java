package com.cjb;

import com.cjb.model.Tiger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.Resource;

@SpringBootApplication
@PropertySource(value = "classpath:config.properties")
public class Application {


    public static void main(String[] args) {
        ApplicationContext applicationContext =SpringApplication.run(Application.class, args);
        Tiger tiger= (Tiger) applicationContext.getBean("tiger");
        System.out.println(tiger);

    }

}
