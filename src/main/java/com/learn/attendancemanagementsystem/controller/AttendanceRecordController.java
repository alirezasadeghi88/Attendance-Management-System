package com.learn.attendancemanagementsystem.controller;

import com.learn.attendancemanagementsystem.repository.AttendanceRecordRepository;
import com.learn.attendancemanagementsystem.service.AttendanceRecordService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("attendacerecord")
public class AttendanceRecordController {
    private final AttendanceRecordRepository attendanceRecordRepository;
    private final AttendanceRecordService attendanceRecordService;

    public AttendanceRecordController(AttendanceRecordRepository attendanceRecordRepository, AttendanceRecordService attendanceRecordService) {
        this.attendanceRecordRepository = attendanceRecordRepository;
        this.attendanceRecordService = attendanceRecordService;
    }
}
