package com.cjb;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cjb.service.UserService;

import javax.annotation.Resource;

@SpringBootApplication
public class Application implements CommandLineRunner,ApplicationRunner {
    @Resource
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("容器创建好了");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("执行commandlinerunner");
        userService.sayHello("zhangsan");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("执行applicationrunner");
    }
}
