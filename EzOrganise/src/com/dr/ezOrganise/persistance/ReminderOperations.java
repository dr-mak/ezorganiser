/**
 * 
 */
package com.dr.ezOrganise.persistance;

import java.util.List;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.dr.ezOrganise.model.Reminder;

/**
 * @author divyarattan
 *
 */
public class ReminderOperations {

	public static List<Reminder> getReminders(String userName) {
		return MongoConnection.getMongoOperation().findAll(Reminder.class);
	}

	public static void addReminder(Reminder reminder) {
		MongoConnection.getMongoOperation().save(reminder);
	}
	
	public static void deleteReminder(Reminder reminder) {
		MongoConnection.getMongoOperation().remove(reminder);
	}
	
	public static void updateReminder(long reminderId, String remindText) {
		MongoConnection.getMongoOperation().updateFirst(new Query(Criteria.where("_id").is(reminderId)), Update.update("remindText", remindText), Reminder.class);
	}
	
}
