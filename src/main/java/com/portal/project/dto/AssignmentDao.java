package com.portal.project.dto;

import java.util.List;

import com.portal.project.entities.Assignment;

public interface AssignmentDao {

	public boolean addAssignment(Assignment assign);
	public List<Assignment> showAllAssignment();
	
	public List<Assignment> addMarksToEachStudent(int sid ,int assignNo ,int marks);
	public List<Assignment> getEachStudentMarks(int sid);
	public float assignmentScoreSid(int sid);
}
