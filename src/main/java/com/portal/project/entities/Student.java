package com.portal.project.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(generator = "increment")
	@Column(name = "sid")
	Integer studentId;

	@Column(name = "studentprn")
	Integer studentPrn;

	@Column(name = "studentname")
	String studentName;

	@Column(name = "studentdob")
	String studentDob;

	@Column(name = "studentmail")
	String studentMail;

	@Column(name = "studentphone")
	String studentPhone;

	@Column(name = "studentcourse")
	String studentCourse;

	@Column(name = "studentaddress")
	String studentAddress;

	@Column(name = "studentgender")
	String studentGender;

	@Lob
	@Column(name = "image")
	String image;

	@Column(name = "overallpercentage")
	Integer overallPercentage;

	@OneToMany(mappedBy = "sid", cascade = CascadeType.ALL)
	List<Assignment> listAssign;

	public Student() {
	}

	public Student(Integer studentId, Integer studentPrn, String studentName, String studentDob, String studentMail,
			String studentPhone, String studentCourse, String studentAddress, String studentGender, String image,
			Integer overallPercentage) {
		super();
		this.studentId = studentId;
		this.studentPrn = studentPrn;
		this.studentName = studentName;
		this.studentDob = studentDob;
		this.studentMail = studentMail;
		this.studentPhone = studentPhone;
		this.studentCourse = studentCourse;
		this.studentAddress = studentAddress;
		this.studentGender = studentGender;
		this.image = image;
		this.overallPercentage = overallPercentage;
	}

	public Integer getOverallPercentage() {
		return overallPercentage;
	}

	public void setOverallPercentage(Integer overallPercentage) {
		this.overallPercentage = overallPercentage;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String name) {
		this.image = name;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getStudentPrn() {
		return studentPrn;
	}

	public void setStudentPrn(Integer studentPrn) {
		this.studentPrn = studentPrn;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentDob() {
		return studentDob;
	}

	public void setStudentDob(String studentDob) {
		this.studentDob = studentDob;
	}

	public String getStudentMail() {
		return studentMail;
	}

	public void setStudentMail(String studentMail) {
		this.studentMail = studentMail;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
}
