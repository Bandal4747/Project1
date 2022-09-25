package com.portal.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {

	@Id
	@GeneratedValue(generator = "increment")
	@Column(name = "tid")
	Integer teacherId;

	@Column(name = "teachername")
	String teacherName;

	@Column(name = "teacherdob")
	String teacherDob;

	@Column(name = "teachermail")
	String teacherMail;

	@Column(name = "teacherphone")
	String teacherPhone;

	@Column(name = "teachersubject")
	String teacherSubject;

	@Column(name = "yrofexp")
	Integer yrOfExp;

	@Column(name = "teacheraddress")
	String teacherAddress;

	@Column(name = "teachergender")
	String teacherGender;

	@Lob
	@Column(name = "image")
	String image;

	public Teacher() {
	}

	public Teacher(Integer teacherId, String teacherName, String teacherDob, String teacherMail, String teacherPhone,
			String teacherSubject, Integer yrOfExp, String teacherAddress, String teacherGender, String image) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherDob = teacherDob;
		this.teacherMail = teacherMail;
		this.teacherPhone = teacherPhone;
		this.teacherSubject = teacherSubject;
		this.yrOfExp = yrOfExp;
		this.teacherAddress = teacherAddress;
		this.teacherGender = teacherGender;
		this.image = image;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTeacherGender() {
		return teacherGender;
	}

	public void setTeacherGender(String teacherGender) {
		this.teacherGender = teacherGender;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherDob() {
		return teacherDob;
	}

	public void setTeacherDob(String teacherDob) {
		this.teacherDob = teacherDob;
	}

	public String getTeacherMail() {
		return teacherMail;
	}

	public void setTeacherMail(String teacherMail) {
		this.teacherMail = teacherMail;
	}

	public String getTeacherPhone() {
		return teacherPhone;
	}

	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}

	public String getTeacherSubject() {
		return teacherSubject;
	}

	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}

	public Integer getYrOfExp() {
		return yrOfExp;
	}

	public void setYrOfExp(Integer yrOfExp) {
		this.yrOfExp = yrOfExp;
	}

	public String getTeacherAddress() {
		return teacherAddress;
	}

	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}
}
