package com.learn.attendancemanagementsystem.repository;

import com.learn.attendancemanagementsystem.model.Attendnce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendnceRepository extends JpaRepository<Attendnce, Long> {
}
