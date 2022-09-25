package com.portal.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.project.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findByStudentName(String studentName);	
}
