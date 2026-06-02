package com.learn.attendancemanagementsystem.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 This class for Attendnce
 @author alireza sadeghi
 @since 2026
 @version 0.0.1
 */
@Entity
@Data
public class Attendnce {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double input;
    private double output;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
