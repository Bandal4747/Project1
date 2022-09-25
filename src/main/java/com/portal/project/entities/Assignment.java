package com.portal.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="assignment")
public class Assignment {

	@Id
	@GeneratedValue(generator = "increment")
	@Column(name="assignid")
	Integer assignId;
	
	@Column(name="assignno")
	Integer assignNo;
	
	@Column(name="subjectname")
	String subjectName;	
	
	@Column(name="startdate")
	String startDate;		
	
	@Column(name="enddate")
	String endDate;			
	
	@Lob
	@Column(name = "question")
	String question;
	
	@Column(name="marks")
	Integer marks;
	
	@ManyToOne
	@JoinColumn( name ="sid" )
	public Student sid;
	
	@Transient
	int sID;
    
	public Assignment(Integer assignId, Integer assignNo, String subjectName, String startDate, String endDate,
			String question, Integer marks, Student sid) {
		super();
		this.assignId = assignId;
		this.assignNo = assignNo;
		this.subjectName = subjectName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.question = question;
		this.marks = marks;
		this.sid = sid;
	}

	public Assignment() {
	}
	
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Integer getAssignNo() {
		return assignNo;
	}


	public void setAssignNo(Integer assignNo) {
		this.assignNo = assignNo;
	}


	public Integer getAssignId() {
		return assignId;
	}

	public void setAssignId(Integer assignId) {
		this.assignId = assignId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public Student getSid() {
		return sid;
	}

	public void setSid(Student sid) {
		this.sid = sid;
	}
}
