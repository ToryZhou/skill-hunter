package com.job.controller;

import com.job.entity.User;

import com.job.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public void get() {
        System.out.println("get");
    }
    @PostMapping
    public void save(@RequestBody @Valid User user) {
        userService.save(user);
    }

    @PostMapping("batch")
    public void saveAll(@RequestBody @Valid List<User> userList) {
        userService.saveAll(userList);
    }

}
