/**
 * 
 */
package com.dr.ezOrganise.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dr.ezOrganise.model.Reminder;
import com.dr.ezOrganise.persistance.ReminderOperations;
import com.dr.ezOrganise.persistance.SequenceGenerator;

/**
 * @author divyarattan
 *
 */
@Service
public class ReminderService {

	public List<Reminder> getReminders(String userName) {
		return ReminderOperations.getReminders(userName);
	}

	public boolean addReminder(Reminder reminder) {
		reminder.setReminderId(SequenceGenerator.getNextSequenceId("reminders"));
		
		try {
			ReminderOperations.addReminder(reminder);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean deleteReminder(Reminder reminder){
		try {
			ReminderOperations.deleteReminder(reminder);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateNote(Reminder reminder){
		try {
			ReminderOperations.updateReminder(reminder.getReminderId(), reminder.getReminderText());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
