package com.learn.attendancemanagementsystem.facade.controller;

import com.learn.attendancemanagementsystem.facade.model.AttendanceFacade;
import com.learn.attendancemanagementsystem.facade.response.AttendanceResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    private final AttendanceFacade attendanceFacade;

    public AttendanceController(AttendanceFacade attendanceFacade) {
        this.attendanceFacade = attendanceFacade;
    }

    @PostMapping("/check-in/{employeeId}")
    public AttendanceResponse checkIn(@PathVariable Long employeeId) {
        return attendanceFacade.checkIn(employeeId);
    }
}
