package com.portal.project.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.project.entities.Image;
import com.portal.project.entities.Teacher;
import com.portal.project.repository.TeacherRepository;

@Service
public class TeacherDaoImpl implements TeacherDao {

	@Autowired
	TeacherRepository repo;

	@Override
	public Teacher findById(int teacherId) {
		Teacher t = repo.findById(teacherId).get();
		if (t == null) {
			return null;
		} else {
			return t;
		}
	}

	@Override
	public String updateTeacher(int teacherId, Teacher updated) {
		Teacher t = repo.findById(teacherId).get();

		if (t != null) {
			repo.save(updated);
			return "Updated Successfully";
		} else {
			return "cant find teacher id";
		}
	}

	@Override
	public int addTeacher(String name, String email) {
		
		Teacher s = new Teacher();
		s.setTeacherName(name);
		s.setTeacherMail(email);
		repo.save(s);

		return s.getTeacherId();
	}
	
	@Override
	public String addProfilePicture(int tId, Image image) {
		Teacher s = repo.findById(tId).get();

		if (s != null) {
				s.setImage(image.getFile());
				repo.save(s);
				return s.getImage();
		}
		return "cant find Teacher id";
	}

	@Override
	public String deleteProfilePicture(int tId) {
		Teacher s = repo.findById(tId).get();

		if (s != null) {
				s.setImage(null);
				repo.save(s);
				return "Image Successfully Deleted";
		}
		return "cant find Student id";
	}

	@Override
	public List<Teacher> showExpertise() {
		return repo.findAll();
	}
}