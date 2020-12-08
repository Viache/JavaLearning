package com.ITVDN_8.Comparable.Interface_Comparable;

/**
 * Investigate class Comparator
 * @author SL
 *
 */
public class Animal implements Comparable{
	String breed;
	int weight;
	int speed;
	int price;
	
	Animal(String breed, int weight, int speed, int price){
		this.breed = breed;
		this.weight = weight;
		this.speed = speed;
		this.price = price;
	}
	
	public String toString() {
		return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
	}
	
	//Сортируем по скорости/цене
	public int compareTo(Object o) {
		int tmp = this.speed - ((Animal)o).speed;
		
		if(tmp == 0) {
			return this.price - ((Animal)o).price;
		} else {
			return tmp;
		}
	}
}
