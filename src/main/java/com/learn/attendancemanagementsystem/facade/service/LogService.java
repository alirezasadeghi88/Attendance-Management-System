package com.learn.attendancemanagementsystem.facade.service;

import org.springframework.stereotype.Service;

@Service
public class LogService {
    public void addLog(String message) {
        System.out.println("LOG: " + message);
    }
}
