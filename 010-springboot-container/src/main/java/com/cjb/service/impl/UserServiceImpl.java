package com.cjb.service.impl;

import com.cjb.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("hello"+name);
    }
}
