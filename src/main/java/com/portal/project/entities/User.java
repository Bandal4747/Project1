package com.portal.project.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(generator = "increment")
	@Column(name = "userid")
	Integer userId;

	@Column(name = "username")
	String username;

	@Column(name = "password")
	String password;

	@Column(name = "phone")
	String phone;

	@Column(name = "role")
	String role;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "tid", referencedColumnName = "tid")
	Teacher tId;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "sid", referencedColumnName = "sid")
	Student sId;

	@Transient
	Integer sID;

	public User() {
	}

	public User(Integer userId, String username, String password, String phone, String role, Teacher tid, Student sId) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.role = role;
		this.tId = tid;
		this.sId = sId;
	}

	public Student getsId() {
		return sId;
	}

	public void setsId(Student sId) {
		this.sId = sId;
	}

	public Teacher gettId() {
		return tId;
	}

	public void settId(Teacher tId) {
		this.tId = tId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
