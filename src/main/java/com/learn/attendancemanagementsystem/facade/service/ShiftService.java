package com.learn.attendancemanagementsystem.facade.service;

import com.learn.attendancemanagementsystem.facade.repository.ShiftRepository;
import org.springframework.stereotype.Service;

@Service
public class ShiftService {
    private final ShiftRepository shiftRepository;

    public ShiftService(ShiftRepository shiftRepository) {
        this.shiftRepository = shiftRepository;
    }
}
