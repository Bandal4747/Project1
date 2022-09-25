package com.portal.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attendance")
public class Attendance {
	
	@Id
	@Column(name = "attendid")
	@GeneratedValue(generator = "increment")
	Integer attendId;
	
	@Column(name ="currdate")
	String currDate;
	
	@Column(name = "prn")
	Integer prn;
	
	@Column(name = "studentname")
	String studentName;
	
	public Attendance() {
	}

	
	
	public Attendance(Integer attendId, String currDate, Integer prn, String studentName) {
		super();
		this.attendId = attendId;
		this.currDate = currDate;
		this.prn = prn;
		this.studentName = studentName;
	}
	
	public Integer getAttendId() {
		return attendId;
	}

	public void setAttendId(Integer attendId) {
		this.attendId = attendId;
	}



	public String getCurrDate() {
		return currDate;
	}

	public void setCurrDate(String currDate) {
		this.currDate = currDate;
	}

	public Integer getPrn() {
		return prn;
	}

	public void setPrn(Integer prn) {
		this.prn = prn;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
