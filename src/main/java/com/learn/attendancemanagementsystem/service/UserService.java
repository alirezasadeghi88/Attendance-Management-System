package com.learn.attendancemanagementsystem.service;

import com.learn.attendancemanagementsystem.model.User;
import com.learn.attendancemanagementsystem.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User update(Long id, User newData) {
        Optional<User> userOpt = userRepository.findById(id);
        User user = userOpt.get();

        if (newData.getFirstName() != null && !newData.getFirstName().isEmpty()
                && !newData.getFirstName().equals("")) {
            user.setFirstName(newData.getFirstName());
        }

        if (newData.getLastName() != null && !newData.getLastName().isEmpty()
                && !newData.getLastName().equals("")) {
            user.setLastName(newData.getLastName());
        }

        if (newData.getEmployeeId() != null && !newData.getEmployeeId().isEmpty()
                && !newData.getEmployeeId().equals("")) {
            user.setEmployeeId(newData.getEmployeeId());
        }

        if (newData.getUsername() != null && !newData.getUsername().isEmpty()
                && !newData.getUsername().equals("")) {
            user.setUsername(newData.getUsername());
        }

        if (newData.getPassword() != null && !newData.getPassword().isEmpty()
                && !newData.getPassword().equals("")) {
            user.setPassword(newData.getPassword());
        }

        if (newData.getDepartment() != null) {
            user.setDepartment(newData.getDepartment());
        }

        if (newData.getRole() != null) {
            user.setRole(newData.getRole());
        }

        return userRepository.save(user);
    }
}
