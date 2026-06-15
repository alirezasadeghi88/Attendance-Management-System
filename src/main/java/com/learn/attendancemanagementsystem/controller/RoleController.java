package com.learn.attendancemanagementsystem.controller;

import com.learn.attendancemanagementsystem.model.Role;
import com.learn.attendancemanagementsystem.repository.RoleRepository;
import com.learn.attendancemanagementsystem.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Role")
public class RoleController {
    private final RoleRepository roleRepository;
    private final RoleService roleService;


    public RoleController(RoleRepository roleRepository, RoleService roleService) {
        this.roleRepository = roleRepository;
        this.roleService = roleService;
    }

    @PostMapping
    public Role save(@RequestBody Role role) {
        return roleRepository.save(role);
    }

    @GetMapping
    public List<Role> roles() {
        return roleRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        roleRepository.deleteById(id);
    }
}
