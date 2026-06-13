package com.learn.attendancemanagementsystem.service;

import com.learn.attendancemanagementsystem.model.Role;
import com.learn.attendancemanagementsystem.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role update(Long id, Role newData) {
        Optional<Role> roleOpt = roleRepository.findById(id);

        Role role = roleOpt.get();


        if (newData.getName() != null && newData.getName().isEmpty() && newData.getName().equals("")) {
            role.setName(newData.getName());
        }

        if (newData.getUsers() != null) {
            role.getUsers().clear();
            role.getUsers().addAll(newData.getUsers());
        }

        return roleRepository.save(role);
    }
}
