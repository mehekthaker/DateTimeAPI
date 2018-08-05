package com.datetime;

import java.time.LocalDate;

//Provides getters and setters for the private fields and also has a parameterized constructor and a toString() method
public class Assignment {

	private String subject;
	private LocalDate dueDate;
	
	
	public Assignment(String subject, LocalDate dueDate) {
		super();
		this.subject = subject;
		this.dueDate = dueDate;
	}
	
	
	
	public String getSubject() {
		return subject;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}



	@Override
	public String toString() {
		return "Assignment [subject=" + subject + ", dueDate=" + dueDate + "]";
	}
	
	
	
	
}
