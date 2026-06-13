package com.learn.attendancemanagementsystem.service;

import com.learn.attendancemanagementsystem.model.Attendnce;
import com.learn.attendancemanagementsystem.repository.AttendnceRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AttendanceService {
    private final AttendnceRepository attendnceRepository;

    public AttendanceService(AttendnceRepository attendnceRepository) {
        this.attendnceRepository = attendnceRepository;
    }

    public Attendnce updateAttendance(Long id, Attendnce newData) {
        Optional<Attendnce> attendnceOpt = attendnceRepository.findById(id);

        Attendnce attendnce = attendnceOpt.get();



        if (newData.getInput() > 0) {
            attendnce.setInput(newData.getInput());
        }

        if (newData.getOutput() > 0) {
            attendnce.setOutput(newData.getOutput());
        }

        return attendnceRepository.save(attendnce);
    }
}
