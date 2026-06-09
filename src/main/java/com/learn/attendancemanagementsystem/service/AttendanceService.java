package com.learn.attendancemanagementsystem.service;

import com.learn.attendancemanagementsystem.repository.AttendnceRepository;
import org.springframework.stereotype.Service;

@Service
public class AttendanceService {
    private final AttendnceRepository attendnceRepository;

    public AttendanceService(AttendnceRepository attendnceRepository) {
        this.attendnceRepository = attendnceRepository;
    }
}
