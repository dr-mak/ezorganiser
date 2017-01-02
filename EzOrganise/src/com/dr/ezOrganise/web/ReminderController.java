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

import com.dr.ezOrganise.model.Reminder;
import com.dr.ezOrganise.service.ReminderService;

/**
 * @author divyarattan
 *
 */
@RestController
public class ReminderController extends EzController{
	
	@Autowired
	ReminderService reminderService;
	
	@RequestMapping(value = "/getReminders", method = RequestMethod.GET)
	public @ResponseBody String getNotes() {
		return getJSONString(reminderService.getReminders("DR"));
	}
	
	@PostMapping(value = "/addReminder")
	boolean addNote(@ModelAttribute Reminder reminder) {
		return reminderService.addReminder(reminder);	
	}
		
	@PostMapping(value = "/deleteReminder")
	boolean deleteNote(@ModelAttribute Reminder reminder) {
		return reminderService.deleteReminder(reminder);	
	}
	
	@PostMapping(value = "/updateReminder")
	boolean updateNote(@ModelAttribute Reminder reminder) {
		return reminderService.updateNote(reminder);	
	}

}
