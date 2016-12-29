/**
 * 
 */
package com.dr.ezOrganise.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author divyarattan
 *
 */
@Document(collection="notes")
public class Note {

	private String username;
	private String note;

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

}
