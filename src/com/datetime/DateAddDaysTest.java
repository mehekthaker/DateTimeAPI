package com.datetime;

import java.time.LocalDate;
import java.util.Scanner;

//Displays the valid date after adding the number of days
public class DateAddDaysTest {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the date as DD/MM/YYYY");
		String string = scanner.nextLine();
		
		String[] date = string.split("/");
		
		DateAddDays day = new DateAddDays(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
		
		System.out.println("Enter the number of days to be added");
		int days = scanner.nextInt();
		
		LocalDate newDate = day.AddDays(days);
		System.out.println(newDate.getDayOfMonth()+"/"+newDate.getMonthValue()+"/"+newDate.getYear());
	}
	
}
