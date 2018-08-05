package com.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Predicate;
import java.util.stream.Stream;

//Displays all the friday on 13th in the 20th century
public class listAllFridays {
	public static void main(String args[]) {
		
		final LocalDate startDate = LocalDate.of(1900, 1, 13);
		final LocalDate endDate = LocalDate.of(2000, 1, 13);
		
		//Checks if the date is before the end date
		Predicate<LocalDate> check = date -> date.isBefore(endDate);
		Stream.iterate(startDate, date -> date.plusMonths(1L)).filter(check)
				.filter(date -> date.getDayOfWeek().equals(DayOfWeek.FRIDAY))
			.forEach(System.out::println);
	}
}
