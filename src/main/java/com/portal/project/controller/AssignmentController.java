package com.portal.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portal.project.dto.AssignmentDao;
import com.portal.project.entities.Assignment;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AssignmentController {

	@Autowired
	AssignmentDao dao;
	
	@PostMapping("addassign")
	public boolean addAssignment(@RequestBody Assignment assign) {
		boolean a = dao.addAssignment(assign);
		if(!a) {
			return false;
		}
		return true;
	}
	
	@GetMapping("showallAssign")
	public List<Assignment> getAllAssign(){
		return dao.showAllAssignment();
	}
	
	@PostMapping("addmarkstoeachstudent")
	public List<Assignment> addMarksToEachStudent(@RequestParam(name="sid")int sid , @RequestParam(name="assignno")int assignNo , @RequestParam(name="marks")int marks ) {
		return dao.addMarksToEachStudent(sid, assignNo, marks);
	}
	
	@PostMapping("geteachstudentmarks")
	public List<Assignment> getEachStudentMarks(@RequestParam(name = "sid")int sid){
		return dao.getEachStudentMarks(sid);
	}
	
	@PostMapping("assignmentscorebysid")
	public float assignmentScoreSid(@RequestParam(name = "sid")int sid){
		
		return dao.assignmentScoreSid(sid);
	}
}