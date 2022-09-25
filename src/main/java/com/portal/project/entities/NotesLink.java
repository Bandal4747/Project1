package com.portal.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="noteslink")
public class NotesLink {

	@Id
	@GeneratedValue(generator =  "increment")
	@Column(name = "subid")
	Integer subId;
	
	@Column(name = "subname")
	String subName;
	
	@Column(name = "sublink")
	String subLink;

	public NotesLink() {
	}
	
	public NotesLink(Integer subId, String subName, String subLink) {
		super();
		this.subId = subId;
		this.subName = subName;
		this.subLink = subLink;
	}

	public Integer getSubId() {
		return subId;
	}

	public void setSubId(Integer subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getSubLink() {
		return subLink;
	}

	public void setSubLink(String subLink) {
		this.subLink = subLink;
	}
}
