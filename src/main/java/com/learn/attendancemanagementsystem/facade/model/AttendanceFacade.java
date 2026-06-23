package com.learn.attendancemanagementsystem.facade.model;

import com.learn.attendancemanagementsystem.facade.service.*;
import org.springframework.stereotype.Component;

@Component
public class AttendanceFacade {
    private final EmployeeService employeeService;
    private final ShiftService shiftService;
    private final AttendanceService attendanceService;
    private final DelayCalculator delayCalculator;
    private final NotificationService notificationService;
    private final LogService logService;

    public AttendanceFacade(EmployeeService employeeService, ShiftService shiftService, AttendanceService attendanceService, DelayCalculator delayCalculator, NotificationService notificationService, LogService logService) {
        this.employeeService = employeeService;
        this.shiftService = shiftService;
        this.attendanceService = attendanceService;
        this.delayCalculator = delayCalculator;
        this.notificationService = notificationService;
        this.logService = logService;
    }
}
