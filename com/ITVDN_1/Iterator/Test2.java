package com.ITVDN_1.Iterator;

public class Test2 {
	public static void main(String [] args) {
		int [] x = {2, 5, 6, 8, 9, 3};
		//����� �� ����� ��������� ������� x ��� ������ ����� for
		for(int i = 0; i < x.length; i++) {
			System.out.print((x[i] + " "));
		}
		System.out.println();
		
		//����� �� ����� ��������� ������� x ��� ������ ����� foreach
		for (int tmp : x) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		//��������� �������� ���� ������
		for(int tmp : x) {
			++tmp;
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		//
		
		
		
	}
}
