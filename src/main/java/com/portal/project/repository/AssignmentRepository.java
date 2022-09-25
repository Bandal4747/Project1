package com.portal.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.portal.project.entities.Assignment;

public interface AssignmentRepository extends JpaRepository<Assignment, Integer> {

	@Query("FROM Assignment where sID =?1 and assignNo = ?2")
	Assignment findBySidOfAssign(int sID , int assignNo);
	
	@Query("FROM Assignment where sID =?1 ")
	List<Assignment> FindAllAssignmentByEachSid(int sID);
}
