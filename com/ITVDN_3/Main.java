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
		
		//� ������� ��������� ����� ������ �� ������ ������
		Iterator<Integer> iterator = al.iterator();
		
		//���������� ���� �� �������� ������� � ������
		while (iterator.hasNext()) {
			//��������� � ���������� �������� � ������ � ������� ���
			Integer tmp = iterator.next();
			System.out.println(tmp);
		}
		
		//�� �� ����� ��������, �� ����� ��������������� �������� ��� ������
		ListIterator<Integer> listIterator = al.listIterator();
		
		while(listIterator.hasNext()) {
			Integer tmp = listIterator.next();
			System.out.println(tmp);
		}
	}
}
