package com.portal.project.dto;

import java.util.List;

import com.portal.project.entities.Image;
import com.portal.project.entities.Teacher;

public interface TeacherDao {

	public int addTeacher(String name ,String email);
	public Teacher findById(int teacherId);
	public String updateTeacher(int teacherId , Teacher updated);
	public String addProfilePicture(int sId , Image name);
	public String deleteProfilePicture(int sId);
	public List<Teacher> showExpertise();
}