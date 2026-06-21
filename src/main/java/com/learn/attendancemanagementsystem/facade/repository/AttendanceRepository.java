package com.learn.attendancemanagementsystem.facade.repository;

import com.learn.attendancemanagementsystem.facade.model.AttendanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface AttendanceRepository extends JpaRepository<AttendanceRecord, Long> {


    Optional<AttendanceRecord> findByEmployeeIdAndAttendanceDate(Long employeeId,
                                                                 LocalDate attendanceDate);

    boolean existsByEmployeeIdAndAttendanceDate(Long employeeId,
                                                LocalDate attendanceDate);
}
