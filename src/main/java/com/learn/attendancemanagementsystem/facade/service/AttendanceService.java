package com.learn.attendancemanagementsystem.facade.service;

import com.learn.attendancemanagementsystem.facade.model.AttendanceRecord;
import com.learn.attendancemanagementsystem.facade.repository.AttendanceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class AttendanceService {
    private final AttendanceRepository attendanceRepository;

    public AttendanceService(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    public AttendanceRecord registerCheckIn(Long employeeId, LocalDateTime checkInTime) {
        LocalDate today = checkInTime.toLocalDate();

        if (attendanceRepository.existsByEmployeeIdAndAttendanceDate(employeeId,
                today)) {
            throw new RuntimeException("Employee already checked in today ");
        }

        AttendanceRecord record = attendanceRepository
                .findByEmployeeIdAndAttendanceDate(employeeId, today)
                .orElseThrow(() -> new RuntimeException("Employee has not checked in today"));

        if (record.getCheckOutTime() != null) {
            throw new RuntimeException("Employee already checked out today");
        }

        record.setCheckOutTime(checkInTime);
    }
    }
