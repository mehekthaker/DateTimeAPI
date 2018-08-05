package com.datetime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Creates an array list of assignments adds and removes the assignments and also sorts and displays the assignment with the earliest due date.
public class AssignmentTest {

	public static void main(String args[]) {
		
		ArrayList<Assignment> arrayList = new ArrayList<>() ;
		
		Assignment[] assignment = new Assignment[5];
		
		LocalDate date;
		
		date = LocalDate.of(2018, 8, 10);
		assignment[0] = new Assignment("ML", date);
		
		date = LocalDate.of(2018, 8, 15);
		assignment[1] = new Assignment("SPM", date);
		
		date = LocalDate.of(2018, 8, 30);
		assignment[2] = new Assignment("J2EE", date);
		
		date = LocalDate.of(2018, 9, 23);
		assignment[3] = new Assignment("CSM", date);
		
		date = LocalDate.of(2018, 9, 11);
		assignment[4] = new Assignment("CC", date);
	
		for(int i=0; i<5; i++) 
			arrayList.add(assignment[i]);
	
		arrayList.stream().forEach(System.out::println);
		
		System.out.println("--------------------------------------------");
		arrayList.remove(assignment[1]);
		System.out.println("New list after removing some assignments");
		arrayList.stream().forEach(System.out::println);
		System.out.println("--------------------------------------------");
		
		System.out.println("Assignment with earliest due date: ");
		Comparator<Assignment> comparator = (arg0, arg1) -> arg0.getDueDate().compareTo(arg1.getDueDate());
		Collections.sort(arrayList, comparator);
		System.out.println(arrayList.get(0));
	
	}
}
