package com.portal.project.entities;

import javax.persistence.Lob;

public class Image {

	@Lob
	public
	String file;

	public Image(String file) {
		super();
		this.file = file;
	}
	
	public Image() {
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}
}
