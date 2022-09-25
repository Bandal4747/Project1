package com.portal.project.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.project.entities.User;
import com.portal.project.repository.UserRepository;

@Service
public class UserImpl implements UserDao {

	@Autowired
	UserRepository repo;

	@Override
	public User login(String Username, String password) {
		User user = repo.findByUsername(Username);

		if (user != null && password.equals(user.getPassword())) {
			return user;
		} else {
			return null;
		}
	}

	@Override
	public boolean register(User objUser) {
		repo.save(objUser);
		return true;
	}

	@Override
	public User findByUserName(String Username) {
		User user = repo.findByUsername(Username);

		if (user != null) {
			return user;
		} else {
			return null;
		}
	}

	@Override
	public int getUserIdForStudent(int sID) {
		User u = repo.findBySid(sID);
		return u.getUserId();
	}

	@Override
	public boolean deleteUserbySids(int userId) {

		User s1 = repo.findById(userId).get();
		if (s1 != null) {

			repo.deleteById(userId);
			return true;
		}
		return false;
	}

}
