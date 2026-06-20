package com.learn.attendancemanagementsystem.composite.model;

import com.learn.attendancemanagementsystem.composite.interfaces.AttendanceEntity;

import java.util.ArrayList;
import java.util.List;

public class Department implements AttendanceEntity {
    private String name;
    private List<AttendanceEntity>members = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(AttendanceEntity member) {
        members.add(member);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getTotalHoursWorked() {
        return members.stream().mapToDouble(AttendanceEntity::getTotalHoursWorked).sum();
    }
}
