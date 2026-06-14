package com.learn.attendancemanagementsystem.controller;

import com.learn.attendancemanagementsystem.model.Attendnce;
import com.learn.attendancemanagementsystem.repository.AttendnceRepository;
import com.learn.attendancemanagementsystem.service.AttendanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Attendance")
public class AttendanceController {
    private final AttendnceRepository attendnceRepository;
    private final AttendanceService attendanceService;

    public AttendanceController(AttendnceRepository attendnceRepository, AttendanceService attendanceService) {
        this.attendnceRepository = attendnceRepository;
        this.attendanceService = attendanceService;
    }

    @PostMapping
    public Attendnce save(@RequestBody Attendnce attendnce) {
        return attendnceRepository.save(attendnce);
    }

    @GetMapping
    public List<Attendnce> attendnces() {
        return attendnceRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
       attendnceRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Attendnce update(@RequestBody Attendnce attendnce, @PathVariable("id")Long id) {
        return attendanceService.updateAttendance(id, attendnce);
    }

}
