package com.ict03.class03;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����ϼ��� (1. ����� 2. ������) >>>  ");
		int s1 = scan.nextInt();
		/*
		if(s1 == 1) {
			Ex10_Cat cat = new Ex10_Cat();
			cat.sound(); // ����ȭ�� �θ��� �����Ҹ��� �������� �ڽ��� ������� �߿��� ��µ�.
			cat.hobby();
			cat.like();
			cat.sleep();
		} else if (s1 == 2) {
			Ex11_dog dog = new Ex11_dog();
			dog.sound();
			dog.hobby();
			dog.like();
			dog.sleep();
		}
		*/
		
		Ex09_Animal animal = null; // �̸� ����
		if (s1 == 1) {
			animal = new Ex10_Cat(); // ���ڿ� �°� ���� ��ü ����.
		} else if (s1 == 2) {
			animal = new Ex11_dog();
		}
		
		// �θ� Ŭ������ ���� �޼ҵ�� ��� �Ұ�.
		// animal.hobby(); �ڽ�(�����, ��)�� ������ �ִ� �޼ҵ�
		animal.sound();
		animal.like();
		animal.sleep();
		// �������� �͸� ������ ��� �̷��� ���°� ª�� �����ؼ� ����.
	
		
		
		
		
		
	}
}
