package com.portal.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.portal.project.dto.AttendanceDao;
import com.portal.project.entities.Attendance;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AttendanceController {

	@Autowired
	AttendanceDao dao;
	
	@PostMapping("addattendance")
	public String addAttenDance(@RequestBody Attendance attend) {
		return dao.addAttendance(attend);
	}
	
	@GetMapping("showallattendance")
	public List<Attendance> showAllAttenDance() {
		return dao.displayAttendance();
	}
}
