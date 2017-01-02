/**
 * 
 */
package com.dr.ezOrganise.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dr.ezOrganise.model.Note;
import com.dr.ezOrganise.service.NotesService;

/**
 * @author divyarattan
 *
 */
@RestController
public class NotesController extends EzController{
	
	@Autowired
	NotesService notesService;
	
	@RequestMapping(value = "/getNotes", method = RequestMethod.GET)
	public @ResponseBody String getNotes() {
		return getJSONString(notesService.getNotes("DR"));
	}
	
	@PostMapping(value = "/addNote")
	boolean addNote(@ModelAttribute Note note) {
		return notesService.addNote(note);	
	}
		
	@PostMapping(value = "/deleteNote")
	boolean deleteNote(@ModelAttribute Note note) {
		return notesService.deleteNote(note);	
	}
	
	@PostMapping(value = "/updateNote")
	boolean updateNote(@ModelAttribute Note note) {
		return notesService.updateNote(note);	
	}
}
