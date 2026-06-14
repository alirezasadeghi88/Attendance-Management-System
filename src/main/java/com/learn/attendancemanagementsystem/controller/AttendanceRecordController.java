package com.learn.attendancemanagementsystem.controller;

import com.learn.attendancemanagementsystem.model.AttendanceRecord;
import com.learn.attendancemanagementsystem.repository.AttendanceRecordRepository;
import com.learn.attendancemanagementsystem.service.AttendanceRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("attendacerecord")
public class AttendanceRecordController {
    private final AttendanceRecordRepository attendanceRecordRepository;
    private final AttendanceRecordService attendanceRecordService;

    public AttendanceRecordController(AttendanceRecordRepository attendanceRecordRepository
            , AttendanceRecordService attendanceRecordService) {
        this.attendanceRecordRepository = attendanceRecordRepository;
        this.attendanceRecordService = attendanceRecordService;
    }

    @PostMapping
    public AttendanceRecord save(@RequestBody AttendanceRecord attendanceRecord) {
        return attendanceRecordRepository.save(attendanceRecord);
    }

    @GetMapping
    public List<AttendanceRecord> attendanceRecords() {
        return attendanceRecordRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        attendanceRecordRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public AttendanceRecord attendanceRecord(@RequestBody AttendanceRecord attendanceRecord
        ,@PathVariable("id") Long id) {
        return attendanceRecordService.update(id, attendanceRecord);
    }
}
