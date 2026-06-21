package com.learn.attendancemanagementsystem.facade.repository;

import com.learn.attendancemanagementsystem.facade.model.Shift;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface ShiftRepository extends JpaRepository<Shift, Long> {


    Optional<Shift> findByEmployeeIdAndShiftDate(Long employeeId,
                                                 LocalDate shiftDate);
}
