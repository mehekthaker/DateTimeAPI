package com.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatChange {
	public static void main(String args[]) {
		
		
		//Format of the current date is changed to day of week, month name day, year format
		LocalDate date = LocalDate.now();
		System.out.println(date.format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy")));
	}
}
