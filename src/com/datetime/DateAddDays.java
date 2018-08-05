package com.datetime;

import java.time.LocalDate;

public class DateAddDays {

	LocalDate date;

	//parameterized constructor
	public DateAddDays(int day, int month, int year) {
		date = LocalDate.of(year, month, day);
	}
	
	//Adds the number of days to the existing date
	public LocalDate AddDays(int days) {
		LocalDate updatedDate = date.plusDays(days);
		return updatedDate;
	}
	
	
	
}
