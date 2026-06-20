package com.learn.attendancemanagementsystem.composite.model;

import com.learn.attendancemanagementsystem.composite.interfaces.AttendanceEntity;

public class Employee implements AttendanceEntity {
    private String name;
    private double hours;

    public Employee(String name, double hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getTotalHoursWorked() {
        return hours;
    }
}
