package com.learn.attendancemanagementsystem.facade.model;

import com.learn.attendancemanagementsystem.facade.response.AttendanceResponse;
import com.learn.attendancemanagementsystem.facade.service.*;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

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

    @Transactional
    public AttendanceResponse checkIn(Long employeeId) {
        employeeService.getActive(employeeId);

        Shift shift = shiftService.getTodayShift(employeeId);

        LocalDateTime now = LocalDateTime.now();

        attendanceService.registerCheckIn(employeeId, now);

        long delayMinutes = delayCalculator.calculateDelayMinutes(
                now.toLocalTime(), shift.getStartTime()
        );

        logService.addLog("Employee" + employeeId +  " was late by "
                + delayMinutes + " minutes");

        notificationService.send(employeeId,"Check-in registered successfully");

        return new AttendanceResponse("Check-in registered successfully", delayMinutes);


    }

    @Transactional
    public AttendanceResponse checkOut(Long employeeId) {
        employeeService.getActive(employeeId);

        LocalDateTime now = LocalDateTime.now();

        attendanceService.registerCheckIn(employeeId, now);

        logService.addLog("Employee " + employeeId + " checked out at " + now);

        notificationService.send(employeeId, "Check-out registered successfully");

        return new AttendanceResponse("Check-out registered successfully", 0);
    }
}
