package com.learn.attendancemanagementsystem.service;

import com.learn.attendancemanagementsystem.model.Role;
import com.learn.attendancemanagementsystem.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role update(Long id, Role newData) {
        Role role = roleRepository.findById(id).get();

        if (role == null) {
            throw new RuntimeException("Role not found");
        }

        if (newData.getName() != null) {
            role.setName(newData.getName());
        }

        if (newData.getUsers() != null) {
            role.setUsers(newData.getUsers());
        }

        return roleRepository.save(role);
    }
}
