package com.portal.project.dto;

import com.portal.project.entities.User;

public interface UserDao {

	public User login(String Username , String password);
	public boolean register(User objUser);
	public User findByUserName(String Username);
	public int getUserIdForStudent(int sID);
	public boolean deleteUserbySids(int userId);
}
