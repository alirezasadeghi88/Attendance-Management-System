package com.learn.attendancemanagementsystem.facade.service;

import com.learn.attendancemanagementsystem.facade.model.Shift;
import com.learn.attendancemanagementsystem.facade.repository.ShiftRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ShiftService {
    private final ShiftRepository shiftRepository;

    public ShiftService(ShiftRepository shiftRepository) {
        this.shiftRepository = shiftRepository;
    }

    public Shift getTodayShift(Long employeeId) {
        return
                shiftRepository.findByEmployeeIdAndShiftDate(employeeId,
                        LocalDate.now())
                        .orElseThrow(() -> new RuntimeException("No shift found for today"));
    }
}
