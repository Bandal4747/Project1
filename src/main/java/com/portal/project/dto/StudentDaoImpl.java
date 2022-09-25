package com.portal.project.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.project.entities.Image;
import com.portal.project.entities.Student;
import com.portal.project.repository.StudentRepository;

@Service
public class StudentDaoImpl implements StudentDao {

	@Autowired
	StudentRepository repo;

	@Override
	public int addStudent(String name, String email) {
		System.out.println(name + " " + email);

		Student s = new Student();
		s.setStudentName(name);
		s.setStudentMail(email);
		repo.save(s);

		return s.getStudentId();
	}

	@Override
	public Student findBysId(int studentId) {
		Student s = repo.findById(studentId).get();
		if (s == null) {
			return null;
		} else {
			return s;
		}
	}

	@Override
	public String updateStudent(int studentId, Student updated) {
		Student s = repo.findById(studentId).get();

		if (s != null) {
			repo.save(updated);
			return "Updated Successfully";
		} else {
			return "cant find Student id";
		}
	}

	@Override
	public List<Student> showAllStudent() {
		return repo.findAll();
	}

	@Override
	public List<Student> deleteStudentbyIds(int studentId) {

		Student s1 = repo.findById(studentId).get();
		
		if( s1 != null) {
			repo.deleteById(studentId);
		}
		return repo.findAll();
	}

	@Override
	public int addStudentByTeacher(Student student) {
		repo.save(student);
		return student.getStudentId();
	}

	@Override
	public String addProfilePicture(int sId, Image image) {
		Student s = repo.findById(sId).get();

		if (s != null) {
				s.setImage(image.getFile());
				repo.save(s);
				return s.getImage();
		}
		return "cant find Student id";
	}

	@Override
	public String deleteProfilePicture(int sId) {
		Student s = repo.findById(sId).get();

		if (s != null) {
				s.setImage(null);
				repo.save(s);
				return "Image Successfully Deleted";
		}
		return "cant find Student id";
	}

	@Override
	public String saveOverallScore(int sId, int overallScore) {
		Student s = repo.findById(sId).get();
		if( s!= null) {
			s.setOverallPercentage(overallScore);
			repo.save(s);
			return "Score Update";
		}
		return null;
	}
}