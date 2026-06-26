package com.learn.attendancemanagementsystem.facade.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void send(Long employeeId, String message) {
        System.out.println("Notification to employee " + employeeId + ": " + message);
    }
}
