package com.learn.attendancemanagementsystem.service;

import com.learn.attendancemanagementsystem.model.Department;
import com.learn.attendancemanagementsystem.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    public Department update(Long id, Department newData) {
        Optional<Department> departmentOpt = departmentRepository.findById(id);

        Department department = departmentOpt.get();

        if (newData.getName() != null && !newData.getName().isEmpty() && !newData.getName().equals("")) {
            department.setName(newData.getName());
        }

        if (newData.getUsers() != null) {
            department.getUsers().clear();
            department.getUsers().addAll(newData.getUsers());
        }

        return departmentRepository.save(department);
    }
}
