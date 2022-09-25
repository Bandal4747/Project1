package com.portal.project.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.project.entities.Assignment;
import com.portal.project.repository.AssignmentRepository;

@Service
public class AssignmentDaoImpl implements AssignmentDao {

	@Autowired
	AssignmentRepository repo;

	@Override
	public boolean addAssignment(Assignment assign) {
		repo.save(assign);
		return true;
	}

	@Override
	public List<Assignment> showAllAssignment() {
		return repo.findAll();
	}

	@Override
	public List<Assignment> addMarksToEachStudent(int sid ,int assignNo , int marks) {
		Assignment a = repo.findBySidOfAssign(sid,assignNo);
		
		if (a != null) {
			a.setMarks(marks);
			repo.save(a);
			return repo.findAll();
		}
		return repo.findAll();
	}

	@Override
	public List<Assignment> getEachStudentMarks(int sid) {
		return repo.FindAllAssignmentByEachSid(sid);
	}

	@Override
	public float assignmentScoreSid(int sid) {
		List<Assignment> assign = repo.FindAllAssignmentByEachSid(sid);
		
		float mark=0;
		for (Assignment a : assign) {
			mark += a.getMarks();
		}
		float total = assign.size()*20;
		float percentage = (mark / total );
		
		return percentage*100;
	}
}
