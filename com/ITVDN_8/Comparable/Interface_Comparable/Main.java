package com.ITVDN_8.Comparable.Interface_Comparable;

import java.util.Arrays;

public class Main {
	public static void main (String[] args) {
		Animal cat = new Animal("Oriental", 7, 25, 5000);
		Animal dog = new Animal("Labrador", 30, 17, 40);
		Animal bird = new Animal("King Penguin", 15, 8, 50000);
		
		Animal[] c = {cat, dog, bird};
		
		Arrays.sort(c);
		
		for(Animal tmp : c) {
			System.out.println(tmp);
		}
	}
}
