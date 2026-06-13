package com.learn.attendancemanagementsystem.service;

import com.learn.attendancemanagementsystem.model.Attendnce;
import com.learn.attendancemanagementsystem.model.Department;
import org.springframework.stereotype.Service;

@Service
public class DepartmentRepository {
    private final DepartmentRepository departmentRepository;

    public DepartmentRepository(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


}
