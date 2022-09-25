package com.portal.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.portal.project.dto.NotesLinkDao;
import com.portal.project.entities.NotesLink;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class NotesLinkController {

	@Autowired
	NotesLinkDao dao;
	
	@PostMapping("addnoteslink")
	public String addNotesLink(@RequestBody NotesLink link) {
		return  dao.addNotesLink(link);
	}
	
	@GetMapping("showallnoteslink")
	public List<NotesLink> showAllNotesLink() {
		return  dao.showNotesLink();
	}
}
