package com.portal.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portal.project.dto.TeacherDao;
import com.portal.project.entities.Image;
import com.portal.project.entities.Teacher;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TeacherController {

	@Autowired
	TeacherDao dao;
	
	@PostMapping("tid")
	public Teacher findById(@RequestParam(name="tid") int teacherId) {
		return dao.findById(teacherId);
	}
	
	@PostMapping("updatebytid")
	public String updateByTeacherId(@RequestParam(name="tid")int tId , @RequestBody Teacher updated) {
		return dao.updateTeacher(tId, updated);
	}
	
	@PostMapping("addteacher")
	public int addTeacher(@RequestParam(name="name") String  name , @RequestParam(name="email")String email) {
		return dao.addTeacher(name , email);
	}
	
	@PostMapping("addprofilepicteacher")
	public String addProfilePicture(@RequestParam(name="imgtid")int tid,@RequestBody Image image){
		return dao.addProfilePicture(tid, image);
	}
	
	@GetMapping("deleteprofilepicteacher")
	public String deleteFile(@RequestParam(name="imgtid")int tid){
		return dao.deleteProfilePicture(tid);
	}
	
	@GetMapping("showexpertise")
	public List<Teacher> showExpertise() {
		return dao.showExpertise();
	}
}
