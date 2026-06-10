package com.learn.attendancemanagementsystem.service;

import com.learn.attendancemanagementsystem.model.AttendanceRecord;
import com.learn.attendancemanagementsystem.repository.AttendanceRecordRepository;
import org.springframework.stereotype.Service;

@Service
public class AttendanceRecordService {
    private final AttendanceRecordRepository attendanceRecordRepository;

    public AttendanceRecordService(AttendanceRecordRepository attendanceRecordRepository) {
        this.attendanceRecordRepository = attendanceRecordRepository;
    }

    public AttendanceRecord update(Long id, AttendanceRecord newData) {
        AttendanceRecord attendanceRecord = attendanceRecordRepository.findById(id).get();

        if (attendanceRecord == null) {
            throw new RuntimeException("AttendanceRecord not found");
        }

        if (newData.getEntryTime() != null) {
            attendanceRecord.setEntryTime(newData.getEntryTime());
        }

        if (newData.getExitTime() != null) {
            attendanceRecord.setExitTime(newData.getExitTime());
        }

        if (newData.getUser() != null) {
            attendanceRecord.setUser(newData.getUser());
        }

        if (newData.getStatus() != null) {
            attendanceRecord.setStatus(newData.getStatus());
        }

        return attendanceRecordRepository.save(attendanceRecord);
    }
}
