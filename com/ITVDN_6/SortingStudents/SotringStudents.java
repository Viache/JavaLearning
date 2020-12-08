package com.ITVDN_6.SortingStudents;
import java.util.Arrays;

public class SotringStudents {
	public static void main(String[] args) {
		int[] marks = {7, 8, 9, 3, 0, 11};
		String[] students = {"Yevhenii", "Alex", "Andrew", "Karina"};
		
		Arrays.sort(marks);
		Arrays.sort(students);
		
		for(int tmp : marks) {
			System.out.println(tmp + " ");
		}
		System.out.println();
		
		for(String tmp : students) {
			System.out.println(tmp + " ");
		}
		
		
	}
}
