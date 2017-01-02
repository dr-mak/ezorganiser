/**
 * 
 */
package com.dr.ezOrganise.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dr.ezOrganise.model.Note;
import com.dr.ezOrganise.persistance.NoteOperations;
import com.dr.ezOrganise.persistance.SequenceGenerator;

/**
 * @author divyarattan
 *
 */
@Service
public class NotesService {
	
	

	public List<Note> getNotes(String userName) {
		return NoteOperations.getNote(userName);
	}

	public boolean addNote(Note note) {
		note.setNoteId(SequenceGenerator.getNextSequenceId("notes"));
		
		try {
			NoteOperations.addNote(note);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean deleteNote(Note note){
		try {
			NoteOperations.deleteNote(note);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateNote(Note note){
		try {
			NoteOperations.updateNote(note.getNoteId(), note.getNote());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
