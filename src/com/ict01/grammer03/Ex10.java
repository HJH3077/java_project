package com.ict01.grammer03;

import java.util.Scanner;
class Ex10{
	public static void main(String[] args){
	// if ~ else ~ : ���ǽ��� ���϶��� �����϶� ���� ������ ó���Ѵ�. ( == ���� �����ڿ� ����.)
	// ���� : if(���ǽ�){
	//		���ǽ��� ���� �� ������ ����;
	//		} else {
	//		���ǽ��� ������ �� ������ ����;
	//		}	��, ������ ������ �� ���̸� { }�� ���� ����!

	// int k1�� 60�̻��̸� �հ� �ƴϸ� ���հ�
	Scanner sc = new Scanner(System.in);
	System.out.print("���� : ");
	int score = sc.nextInt();
	String pass = ""; 

	if(score >= 60) {
		pass = "�հ�";
	} else {
		pass = "���հ�";
	}
	
	System.out.println("����� " + pass + "�Դϴ�.");		
	
	
	// int k2�� Ȧ������ ¦������ �Ǻ�����
	System.out.print("���ڸ� �Է��ϼ��� : ");
	int num = sc.nextInt();
	String number = "";

	if(num % 2 == 0) {
		number = "¦��";
	} else {
		number = "Ȧ��";
	}

	System.out.println(number + "�Դϴ�.");	
	

	// k4�� 1�Ǵ� 3�̸� ���� �ƴϸ� ����
	System.out.print("���ڸ� �Է��ϼ��� : ");
	int k4 = sc.nextInt();
	String gender = "";
	
	if(k4 == 1 || k4 == 3){
		gender = "����";
	} else {
		gender = "����";
	}
	
	System.out.println("������ " + gender + "�Դϴ�.");


	// �ٹ��ð���  8�ð������� �ð��� 8720�̰� 8�ð� �ʰ��� 1.5�� ���� 10�ð� ���� �ݾ���? 
	System.out.print("�ð��� �Է��ϼ��� : ");
	int time = sc.nextInt();
	int dan = 8720;
	int pay = 0;
	
	if (time <= 8){
		pay = time * dan;
	} else {
		pay = (dan * 8) + (int)((time - 8) * 1.5 * dan);
	}

	System.out.print("���� �ݾ� :" + pay + "��");


	}
}