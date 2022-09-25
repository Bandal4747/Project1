package com.portal.project.dto;

import java.util.List;

import com.portal.project.entities.Attendance;

public interface AttendanceDao {

	public String addAttendance(Attendance attend);
	public List<Attendance> displayAttendance();

}
