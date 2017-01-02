/**
 * 
 */
package com.dr.ezOrganise.persistance;

import java.util.List;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.dr.ezOrganise.model.Note;

/**
 * @author divyarattan
 *
 */
public class NoteOperations {

	public static List<Note> getNote(String userName) {
		return MongoConnection.getMongoOperation().findAll(Note.class);
	}

	public static void addNote(Note note) {
		MongoConnection.getMongoOperation().save(note);
	}
	
	public static void deleteNote(Note note) {
		MongoConnection.getMongoOperation().remove(note);
	}
	
	public static void updateNote(long noteId, String note) {
		MongoConnection.getMongoOperation().updateFirst(new Query(Criteria.where("_id").is(noteId)), Update.update("note", note), Note.class);
	}

}
