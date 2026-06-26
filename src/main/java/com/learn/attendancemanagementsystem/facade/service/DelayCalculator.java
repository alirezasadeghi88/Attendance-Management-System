package com.learn.attendancemanagementsystem.facade.service;

import org.springframework.stereotype.Service;

import javax.xml.datatype.Duration;
import java.time.LocalTime;

import static javax.xml.datatype.Duration.*;

@Service
public class DelayCalculator {

    public long calculateDelayMinutes(LocalTime actualCheckIn, LocalTime shiftStartTime) {
        if (!actualCheckIn.isAfter(shiftStartTime)) {
            return 0;
        }

        return Duration.between(shiftStartTime, actualCheckIn).toMinutes();

    }
}
