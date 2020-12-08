package com.ITVDN_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(2);
		al.add(5);
		al.add(8);
		
		//с помощью итератора можно бегать по нашему списку
		Iterator<Integer> iterator = al.iterator();
		
		//спрашиваем есть ли следуюий элемент в списке
		while (iterator.hasNext()) {
			//переходим к следующиму элементу в списке и выводим его
			Integer tmp = iterator.next();
			System.out.println(tmp);
		}
		
		//то же самое действие, но через оптимизационный итератор под списки
		ListIterator<Integer> listIterator = al.listIterator();
		
		while(listIterator.hasNext()) {
			Integer tmp = listIterator.next();
			System.out.println(tmp);
		}
	}
}
