package com.learn.attendancemanagementsystem.service;

import com.learn.attendancemanagementsystem.model.AttendanceRecord;
import com.learn.attendancemanagementsystem.repository.AttendanceRecordRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AttendanceRecordService {
    private final AttendanceRecordRepository attendanceRecordRepository;

    public AttendanceRecordService(AttendanceRecordRepository attendanceRecordRepository) {
        this.attendanceRecordRepository = attendanceRecordRepository;
    }

    public AttendanceRecord update(Long id, AttendanceRecord newData) {
       Optional<AttendanceRecord> attendanceRecordOpt = attendanceRecordRepository.findById(id);
       AttendanceRecord attendanceRecord = attendanceRecordOpt.get();



        if (newData.getEntryTime() != null) {
            attendanceRecord.setEntryTime(newData.getEntryTime());
        }

        if (newData.getExitTime() != null) {
            attendanceRecord.setExitTime(newData.getExitTime());
        }

        if (newData.getUser() != null) {
            attendanceRecord.setUser(newData.getUser());
        }

        if (newData.getStatus() != null && !newData.getStatus().isEmpty() && newData.getStatus().equals("")) {
            attendanceRecord.setStatus(newData.getStatus());
        }

        return attendanceRecordRepository.save(attendanceRecord);
    }
}


