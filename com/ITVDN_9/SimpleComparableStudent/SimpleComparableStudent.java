package com.ITVDN_9.SimpleComparableStudent;

import java.util.Arrays;

public class SimpleComparableStudent {
	private String firstName;
	private int group;
	
	public SimpleComparableStudent(String firstName, int group) {
		this.firstName = firstName;
		this.group = group;
	}
	
	@Override
	public String toString() {
		return firstName + " " + group;
	}
}


class Main {
	public static void main(String[] args) {
		SimpleComparableStudent[] myStudents = {
				new SimpleComparableStudent("Yevhenii, 333"),
				new SimpleComparableStudent("Andrew, 336"),
				new SimpleComparableStudent("Igor, 339")
		};
		Arrays.sort(myStudents);
		
		for(SimpleComprableStudent myStudent : myStudents) {
			System.out.println(myStudent);
		}
		
		
		
		
	}
	
}