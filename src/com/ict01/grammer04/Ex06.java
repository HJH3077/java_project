package com.ict01.grammer04;

import java.util.Scanner;
class Ex06
{
	public static void main(String[] args) 
	{
	// do ~ while�� : while���� ���� �ݺ���������, ���� ���� �� ���߿� ���Ѵ�.
	// ���� : �ʱ��;
	//		  do{
	//			������ ����;
	//			������;
	//		  } while(���ǽ�);

	// 0 ~ 10���� ���
	int i = 0;
	do
	{
		System.out.print(i + " ");
		i++;
	}
	while (i < 11);
	System.out.println();

	// �ݺ�Ƚ���� �޾Ƽ� ó������
	Scanner sc = new Scanner(System.in);
	System.out.print("�ݺ�Ƚ�� : ");
	int a = sc.nextInt();
	int j = 0;
	do
	{
		System.out.println("Hello Java");
		j++;
	}
	while (j < a);
	

	// �ݺ�Ƚ���� �Ǻ� ���ڸ� �޾Ƽ� Ȧ��, ¦���� ���
	System.out.print("�ݺ�Ƚ���� �Է��ϼ��� : ");
	int su = sc.nextInt();
	int k = 0;
	String msg = "";
	do
	{
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if(num % 2 == 0)
			msg = "¦��";
		else
			msg = "Ȧ��";
		System.out.println("�Է��� ���� " + msg + "�Դϴ�.");
		k++;
	}
	while (k < su);	
	

	
		


	}
}
