package com.portal.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portal.project.dto.UserDao;
import com.portal.project.entities.User;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {
	
	@Autowired
	UserDao dao;
	
	@PostMapping("login")
	public User login(@RequestParam(name="username")String username , @RequestParam(name="password")String password) {
		User user = dao.login(username, password);
		
		if(user == null) {
			return null;			
		}
		return user;
	}
	
	@PostMapping("register")
	public String addUser(@RequestBody User objUser) {
		
	     dao.register(objUser);
	     return "User Added Successfully";
 	}
	
	@PostMapping("find")
	public String findByUserName(@RequestParam(name="username")String username) {
		User user = dao.findByUserName(username);

		if(user == null)
			return "";
		return user.getUsername();
	}
	
	@GetMapping("getstudentbysid")
	public int chanegPass(@RequestParam(name="sid")int sId) {
		return dao.getUserIdForStudent(sId);
	}
	
	@GetMapping("deletestudentbyuserId")
	public boolean deleteStudentByUserId(@RequestParam(name="userId")int userId) {
		return dao.deleteUserbySids(userId);
	}
}
