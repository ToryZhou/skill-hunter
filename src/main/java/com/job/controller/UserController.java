package com.job.controller;

import com.job.entity.User;

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

    @GetMapping
    public void get() {
        System.out.println("get");
    }

    @PostMapping
    public void post(@RequestBody @Valid List<User> userList) {
        System.out.println(userList.size());
    }

}
