package com.portal.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portal.project.dto.StudentDao;
import com.portal.project.entities.Image;
import com.portal.project.entities.Student;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StudentController {

	@Autowired
	StudentDao dao;
	
	@PostMapping("sid")
	public Student findBysId(@RequestParam(name="sid") int studentId) {
		return dao.findBysId(studentId);
	}
	
	
	@PostMapping("addstudent")
	public int addStudent(@RequestParam(name="name")String name , @RequestParam(name="email")String email) {
		return dao.addStudent(name , email);
	}
	
	@PostMapping("addstudentbyteacher")
	public int addStudentByTeacher( @RequestBody Student student) {
		return dao.addStudentByTeacher(student);
	}
	
	@PostMapping("updatebysid")
	public String updateByStudentId(@RequestParam(name="sid")int sId , @RequestBody Student updated) {
		return dao.updateStudent(sId, updated);
	}
	
	@GetMapping("deletestudent")
	public List<Student> deleteUser(@RequestParam(name="sid")int studentId) {
		return dao.deleteStudentbyIds(studentId);
	}
	
	@PostMapping("showallstudent")
	public List<Student> showAllStudent() {
		return dao.showAllStudent();
	}
	
	@PostMapping("addprofilepic")
	public String addProfilePicture(@RequestParam(name="imgsid")int sid,@RequestBody Image image){
		return dao.addProfilePicture(sid, image);
	}
	
	@GetMapping("deleteprofilepic")
	public String deleteFile(@RequestParam(name="imgsid")int sid){
		return dao.deleteProfilePicture(sid);
	}
	
	@PostMapping("saveoverallscore")
	public String saveOverallScore(@RequestParam(name="sid")int sid , @RequestParam(name="score")int score) {
		return dao.saveOverallScore(sid, score);
	}
}