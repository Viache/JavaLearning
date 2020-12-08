package com.ITVDN_4;

public class Animal {
	String breed;
	int price;
	
	Animal (String breed, int price) {
		this.breed = breed;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return breed + " = " + price;
	}
}

//class Animal {
//	
//}
