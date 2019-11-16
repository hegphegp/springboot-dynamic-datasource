package com.hegp.controller;

import com.hegp.entity.User;
import com.hegp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RequestMapping("/v1")
@RestController
public class TestController {
    @Autowired
    private UserService userService;
    @GetMapping("/test")
    public List<User> queryUsers() {
//        User user = new User();
//        user.setUsername("username"+ UUID.randomUUID().toString());
//        user.setPassword("password"+ UUID.randomUUID().toString());
//        userService.save(user);
        return userService.list();
    }
}
