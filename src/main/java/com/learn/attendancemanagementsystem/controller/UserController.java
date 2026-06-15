package com.learn.attendancemanagementsystem.controller;

import com.learn.attendancemanagementsystem.model.User;
import com.learn.attendancemanagementsystem.repository.UserRepository;
import com.learn.attendancemanagementsystem.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    private final UserRepository userRepository;
    private final UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }
}
