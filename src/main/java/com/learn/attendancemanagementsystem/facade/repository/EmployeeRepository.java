package com.learn.attendancemanagementsystem.facade.repository;

import com.learn.attendancemanagementsystem.facade.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
