package com.ict03.class01;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
	Ex08 coffee = new Ex08(); // ���� name�� price�� ������ ����.
	coffee.setName("Ŀ������");
	coffee.setPrice(1800);
	
	Ex08 ion = new Ex08();	  // ���� ���赵�� ��������Ƿ� ������ �ִ� ������ �Ȱ���
	ion.setName("�̿�����");
	ion.setPrice(1500);
	
	Ex08 cola = new Ex08();	  // Ŭ������ ����ϴ� ����. ������ �����ؼ� �Ȱ��� ���� �� �ִ�.
	cola.setName("ź������");
	cola.setPrice(2000);
	
	Ex08 juice = new Ex08();
	juice.setName("��������");
	juice.setPrice(2200);
	
	// �迭�� ����
	// �ڷ���[] �̸� = new �ڷ���[����]
	/*
	Ex08[] arr = new Ex08[4];
	arr[0] = coffee;
	arr[1] = ion;
	arr[2] = cola;
	arr[3] = juice;
	*/
	
	Ex08[] arr = {coffee, ion, cola, juice};
	// arr[]�� ������ �ִ� �̸�, ���ݵ��� ����ϴ�.
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i].getName() + ", " + arr[i].getPrice());
	}
	
	
	// �ݾ� ����	
	// 1500�̸��̸� �ݾ� ����(���ϽѰ� 1500)
	// 1500�̻��̸� ���� ����(���ݿ� �´�)
	/*Scanner sc = new Scanner(System.in);
	System.out.print("�ݾ��� �Է��ϼ��� : ");
	int input = sc.nextInt();
	if (input < 1500) 
		System.out.println("�ݾ��� �����մϴ�.");
	else {
		System.out.println("1.Ŀ ��\t2.�� ��\t3.ź ��\t4.�� ��");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getPrice() <= input)
				System.out.print("    O\t"); // �� ������ ���Ǳ⿡ �� ������ ���� ǥ��.
			else
				System.out.print("    X\t");
		}
	}
	System.out.println();*/
	
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int input = sc.nextInt();
		while (true) {
		if (input < 1500) 
			System.out.println("�ݾ��� �����մϴ�.");
		else {
			System.out.println("1.Ŀ ��\t2.�� ��\t3.ź ��\t4.�� ��");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].getPrice() <= input)
					System.out.print("    O\t"); // �� ������ ���Ǳ⿡ �� ������ ���� ǥ��.
				else
					System.out.print("    X\t");
			}
		}
		System.out.println();
		// �޴� ����
		System.out.print("��ȣ�� �����ϼ��� >>  ");
		int drink = sc.nextInt();
		int output = 0;
		if(drink == 1)
			output = input - arr[0].getPrice();
		else if(drink == 2)
			output = input - arr[1].getPrice();
		else if(drink == 3)
			output = input - arr[2].getPrice();
		else if(drink == 4)
			output = input - arr[3].getPrice();
		
		System.out.println("�ܵ� : " + output);
		input = output;
		
		if(input > 1500)
		System.out.print("�� �����Ͻðڽ��ϱ�? (1.yes 2.no) >>>  ");
		int choice = sc.nextInt();
		if(choice == 2) break;
		
	}
	
	
	// �߰� ���� : �ܵ��� ������ �� �ٽ� ��� �� �ֵ��� while�� ���.
	
	
	
	}
}
