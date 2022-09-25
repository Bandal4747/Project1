package com.portal.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.project.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
	
}

