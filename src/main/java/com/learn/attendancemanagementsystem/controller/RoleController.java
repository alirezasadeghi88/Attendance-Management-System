package com.learn.attendancemanagementsystem.controller;

import com.learn.attendancemanagementsystem.repository.RoleRepository;
import com.learn.attendancemanagementsystem.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Role")
public class RoleController {
    private final RoleRepository roleRepository;
    private final RoleService roleService;


    public RoleController(RoleRepository roleRepository, RoleService roleService) {
        this.roleRepository = roleRepository;
        this.roleService = roleService;
    }
}
