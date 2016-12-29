/**
 * 
 */
package com.dr.ezOrganise.persistance;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import com.dr.ezOrganise.config.SpringMongoConfig;
import com.dr.ezOrganise.model.Note;

/**
 * @author divyarattan
 *
 */
public class NoteOperations {	
	
	public static List<Note> getNote(String userName){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
		
		return mongoOperation.findAll(Note.class);
	}
	
}
