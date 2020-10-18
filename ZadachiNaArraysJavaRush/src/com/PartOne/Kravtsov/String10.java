package com.PartOne.Kravtsov;
import java.util.Scanner;

public class String10 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		String [] string = new String[10];
		
		for(int i = 2; i < string.length; i++) {
			System.out.print(i - 1 + " string: ");
			string[i] = sc.nextLine();
		}
		
		for(int j = string.length - 1; j >= 0; j--) {
			System.out.println(string[j]);
		}
	}
}
