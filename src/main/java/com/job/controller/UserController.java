package com.job.controller;

import com.job.entity.User;

import com.job.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        return ResponseEntity.ok().body(userService.findById(id));
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
