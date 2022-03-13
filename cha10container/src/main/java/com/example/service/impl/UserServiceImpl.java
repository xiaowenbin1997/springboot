package com.example.service.impl;

import com.example.service.UserService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("sayHello" + name);
    }
}
