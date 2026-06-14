package com.learn.attendancemanagementsystem.controller;

import com.learn.attendancemanagementsystem.repository.AttendnceRepository;
import com.learn.attendancemanagementsystem.service.AttendanceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Attendance")
public class AttendanceController {
    private final AttendnceRepository attendnceRepository;
    private final AttendanceService attendanceService;

    public AttendanceController(AttendnceRepository attendnceRepository, AttendanceService attendanceService) {
        this.attendnceRepository = attendnceRepository;
        this.attendanceService = attendanceService;
    }
}
