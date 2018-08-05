package com.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

//Displays the days from birth date until today's date using date time API
public class Alive {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		LocalDate birthday = LocalDate.of(1996, Month.SEPTEMBER, 11);
		
		long p = birthday.until(today, ChronoUnit.DAYS);
		
		System.out.println("I am alive since, "+p+" Days ");
		
	}

}
