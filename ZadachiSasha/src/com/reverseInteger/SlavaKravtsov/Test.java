package com.reverseInteger.SlavaKravtsov;

public class Test {
	public static void main(String[] args) {
	int num = -234;
	int rev = 0;
	System.out.println("Original: " + num);
	
	while(num != 0) {
		int digit = num % 10;
		rev = rev * 10 + digit;
		num = num / 10;
	}
	System.out.println("Reversed: " + rev);
	
	
		  }
	}
