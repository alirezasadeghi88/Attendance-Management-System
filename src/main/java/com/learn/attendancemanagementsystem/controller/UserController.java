package com.learn.attendancemanagementsystem.controller;

import com.learn.attendancemanagementsystem.model.User;
import com.learn.attendancemanagementsystem.repository.UserRepository;
import com.learn.attendancemanagementsystem.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<User> userList() {
        return userRepository.findAll();
    }
}
