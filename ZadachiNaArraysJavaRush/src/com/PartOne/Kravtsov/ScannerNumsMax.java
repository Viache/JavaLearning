package com.PartOne.Kravtsov;
import java.util.Scanner;

public class ScannerNumsMax {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int [] nums = new int [20];
		System.out.println("Input nums:");
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(i + 1 + " namber: ");
			nums[i] = sc.nextInt();
		}
		
		int max = nums[0];
		for(int j = 0; j < nums.length; j++) {
			if(max < nums[j]) {
				max = nums[j];
			}
		}
		System.out.println("Max num: " + max);
		
	}
}
