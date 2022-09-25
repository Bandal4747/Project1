package com.portal.project.dto;

import java.util.List;

import com.portal.project.entities.Image;
import com.portal.project.entities.Student;

public interface StudentDao{

	public int addStudent(String name , String email);
	public Student findBysId(int studentId);
	public String saveOverallScore(int studentId ,int overallScore);
	public String updateStudent(int studentId , Student updated);
	public List<Student> showAllStudent();
	public List<Student> deleteStudentbyIds(int studentId);
	public int addStudentByTeacher(Student student);
	
	public String addProfilePicture(int sId , Image name);
	public String deleteProfilePicture(int sId);
}
