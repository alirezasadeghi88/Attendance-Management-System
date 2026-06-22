package com.learn.attendancemanagementsystem.facade.service;

import com.learn.attendancemanagementsystem.facade.repository.AttendanceRepository;
import org.springframework.stereotype.Service;

@Service
public class AttendanceService {
    private final AttendanceRepository attendanceRepository;

    public AttendanceService(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }
}
