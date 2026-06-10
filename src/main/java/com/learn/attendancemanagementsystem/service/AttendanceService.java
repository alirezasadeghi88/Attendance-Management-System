package com.learn.attendancemanagementsystem.service;

import com.learn.attendancemanagementsystem.model.Attendnce;
import com.learn.attendancemanagementsystem.repository.AttendnceRepository;
import org.springframework.stereotype.Service;

@Service
public class AttendanceService {
    private final AttendnceRepository attendnceRepository;

    public AttendanceService(AttendnceRepository attendnceRepository) {
        this.attendnceRepository = attendnceRepository;
    }

    public Attendnce updateAttendance(Long id, Attendnce newData) {
        Attendnce attendnce = attendnceRepository.findById(id).get();


    }
}
