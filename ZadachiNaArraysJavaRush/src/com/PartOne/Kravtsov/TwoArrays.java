package com.PartOne.Kravtsov;
import java.util.Scanner;

public class TwoArrays {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String [] string = new String [10];
		int [] nums = new int [10];
		
		for(int i = 0; i < string.length; i++) {
			System.out.print(i + 1 + " string: ");
			string[i] = sc.nextLine();
		}
		
		for(int j = 0; j < nums.length; j++) {
			nums[j] = string[j].length();
			System.out.println("В " + (j + 1) + " строке: " + nums[j] + " символов.");
		}
	}
}
