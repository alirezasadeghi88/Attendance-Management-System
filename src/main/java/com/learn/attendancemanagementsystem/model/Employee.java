package com.learn.attendancemanagementsystem.model;

import jakarta.persistence.*;
import lombok.Data;
/**
    This class for Employee
    @author alireza sadeghi
    @since 2026
    @version 0.0.1
 */
@Data
@Entity
//@Table(name = "pro")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String posion;
}
