package com.ITVDN_1.Iterator;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
	public static void main (String [] args) {
		Collection<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.add(1));
		System.out.println(list.size());
		System.out.println(list);
		
		Collection<Integer> list2 = new ArrayList<>();
		list2.addAll(list);
		System.out.println(list2);
		System.out.println(list2.isEmpty());
//		list2.clear();
//		System.out.println(list2 + " " + list.size());
//		System.out.println(list2.isEmpty());
		
		Object[] arr = list2.toArray();//toArray пробегает по каждому элементу массива
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
		//было пройдено: add, addAll, clear, size, toArray, isEmpty
		//интерфейс Iterator: forEachRemaining(), hasNext(), next(), remove()
	}
}
