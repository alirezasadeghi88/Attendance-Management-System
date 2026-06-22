package com.learn.attendancemanagementsystem.facade.service;

import com.learn.attendancemanagementsystem.facade.model.Employee;
import com.learn.attendancemanagementsystem.facade.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee getActive(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(() ->
        new RuntimeException("Employee not found "));

        if (!employee.isActive()) {
            throw new RuntimeException("Employee is not active");
        }

        return employee;
    }
}
