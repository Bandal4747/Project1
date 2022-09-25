package com.portal.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.project.entities.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {

}
