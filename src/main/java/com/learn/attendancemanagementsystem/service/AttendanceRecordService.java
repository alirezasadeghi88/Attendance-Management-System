package com.learn.attendancemanagementsystem.service;

import com.learn.attendancemanagementsystem.repository.AttendanceRecordRepository;
import org.springframework.stereotype.Service;

@Service
public class AttendanceRecordService {
    private final AttendanceRecordRepository attendanceRecordRepository;

    public AttendanceRecordService(AttendanceRecordRepository attendanceRecordRepository) {
        this.attendanceRecordRepository = attendanceRecordRepository;
    }


}
