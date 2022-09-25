  package com.portal.project.dto;

import java.util.List;

import com.portal.project.entities.NotesLink;

public interface NotesLinkDao {

	public String addNotesLink(NotesLink link);
	public List<NotesLink> showNotesLink();
	
}
