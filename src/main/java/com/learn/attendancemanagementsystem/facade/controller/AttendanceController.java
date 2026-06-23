package com.learn.attendancemanagementsystem.facade.controller;

import com.learn.attendancemanagementsystem.facade.model.AttendanceFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    private final AttendanceFacade attendanceFacade;

    public AttendanceController(AttendanceFacade attendanceFacade) {
        this.attendanceFacade = attendanceFacade;
    }
}
