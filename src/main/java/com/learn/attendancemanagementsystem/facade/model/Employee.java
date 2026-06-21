package com.learn.attendancemanagementsystem.facade.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String FullName;
    private boolean active;

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return FullName;
    }

    public boolean isActive() {
        return active;
    }
}
