/**
 * 
 */
package com.dr.ezOrganise.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

/**
 * @author divyarattan
 *
 */
@Document(collection="notes")
@Component
public class Note {

	private String username;
	private String note;
	@Id
	private long noteId;
	
	
	public  Note() {

	}

	/**
	 * @param username
	 * @param note
	 * @param noteId
	 */
	public Note(String username, String note, long noteId) {
		super();
		this.username = username;
		this.note = note;
		this.noteId = noteId;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note
	 *            the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the noteId
	 */
	public long getNoteId() {
		return noteId;
	}

	/**
	 * @param noteId the noteId to set
	 */
	public void setNoteId(long noteId) {
		this.noteId = noteId;
	}
	
	

}
