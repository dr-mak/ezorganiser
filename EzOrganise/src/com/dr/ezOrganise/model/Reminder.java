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
@Document(collection = "reminders")
@Component
public class Reminder {
	@Id
	private long reminderId;
	
	private String username;
	private String remindText;
	private long time;
	
	/**
	 * @param reminderId
	 * @param username
	 * @param reminderText
	 */
	public Reminder(long reminderId, String username, String reminderText,long time) {
		super();
		this.reminderId = reminderId;
		this.username = username;
		this.remindText = reminderText;
		this.time=time;
	}

	/**
	 * 
	 */
	public Reminder() {
		super();
	}

	/**
	 * @return the reminderId
	 */
	public long getReminderId() {
		return reminderId;
	}

	/**
	 * @param reminderId
	 *            the reminderId to set
	 */
	public void setReminderId(long reminderId) {
		this.reminderId = reminderId;
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
	 * @return the reminderText
	 */
	public String getReminderText() {
		return remindText;
	}

	/**
	 * @param reminderText
	 *            the reminderText to set
	 */
	public void setReminderText(String reminderText) {
		this.remindText = reminderText;
	}

	/**
	 * @return the remindText
	 */
	public String getRemindText() {
		return remindText;
	}

	/**
	 * @param remindText the remindText to set
	 */
	public void setRemindText(String remindText) {
		this.remindText = remindText;
	}

	/**
	 * @return the time
	 */
	public long getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(long time) {
		this.time = time;
	}

}
