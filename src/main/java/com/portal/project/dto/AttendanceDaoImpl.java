package com.portal.project.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.project.entities.Attendance;
import com.portal.project.repository.AttendanceRepository;

@Service
public class AttendanceDaoImpl implements AttendanceDao {

	@Autowired
	AttendanceRepository repo;
	
	@Override
	public String addAttendance(Attendance attend) {
		if(attend != null) {
			repo.save(attend);
			return "Attendance is addedd";			
		}
		return "attendance is not saved";
	}

	@Override
	public List<Attendance> displayAttendance() {
		return repo.findAll();
	}

}
