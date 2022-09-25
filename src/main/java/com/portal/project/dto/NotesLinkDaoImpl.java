package com.portal.project.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.project.entities.NotesLink;
import com.portal.project.repository.NotesLinkRepository;

@Service
public class NotesLinkDaoImpl implements NotesLinkDao {

	@Autowired
	NotesLinkRepository repo;
	
	@Override
	public String addNotesLink(NotesLink link) {
		if(link == null)
			return "operation failed";
		
		repo.save(link);
		return "Link Added Successfully !!";
	}

	@Override
	public List<NotesLink> showNotesLink() {
		return repo.findAll();
	}
}
