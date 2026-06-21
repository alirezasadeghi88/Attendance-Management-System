package com.learn.attendancemanagementsystem.facade.response;

public class AttendanceResponse {

    private String message;
    private long delayMinutes;

    public AttendanceResponse(String message, long delayMinutes) {
        this.message = message;
        this.delayMinutes = delayMinutes;
    }

    public String getMessage() {
        return message;
    }

    public long getDelayMinutes() {
        return delayMinutes;
    }
}
