package com.learn.attendancemanagementsystem.controller;

import com.learn.attendancemanagementsystem.model.Department;
import com.learn.attendancemanagementsystem.repository.DepartmentRepository;
import com.learn.attendancemanagementsystem.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentController {
    private final DepartmentRepository departmentRepository;
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentRepository departmentRepository, DepartmentService departmentService) {
        this.departmentRepository = departmentRepository;
        this.departmentService = departmentService;
    }

    @PostMapping
    public Department save(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

    @GetMapping
    public List<Department> departments() {
        return departmentRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        departmentRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Department update(@RequestBody Department department
        , @PathVariable Long id) {
        return departmentService.update(id, department);
    }
}
