package com.ict01.grammer03;

import java.util.Scanner;
class Ex08{
	public static void main(String[] args){
	// ���ڸ� �޾Ƽ� Ȧ��, ¦���� ��������
	Scanner sc = new Scanner(System.in);
	System.out.print("���ڸ� �Է��ϼ��� : ");
	int a = sc.nextInt();	
	String A = (a % 2 == 0)? "¦��" : "Ȧ��";
	System.out.println(a + "�� " + A + "�Դϴ�.");


	// ����, ����, ���� ������ �޾Ƽ� ������ ����� 60�̻��̰�, ������ ������ 40�� �̻��� �� �հ�, �ƴϸ� ���հ�
	System.out.print("�������� : ");
	int kor = sc.nextInt();

	System.out.print("�������� : ");
	int eng = sc.nextInt();
	
	System.out.print("�������� : ");
	int math = sc.nextInt();

	double avg = (int)(((kor + eng + math) / 3.0) * 10) / 10.0;
	System.out.println("��������� " + avg + "�Դϴ�.");
	String pass = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60)? "�հ�" : "���հ�";
	System.out.println("����� " + pass + "�Դϴ�.");

	// �ñ��� 8720�� �˹� �� �˹ٽð��� �Է� �޾Ƽ� 8�ð��� �ʰ��ϸ� �ʰ��� �ð���ŭ 1.5���� ��� ���� �ݾ���?
	int pay = 8720;
	System.out.print("���� �ð� : ");
	int time = sc.nextInt();

	int money = (time <= 8)? (pay * time) : ((pay * 8) + (int)((time - 8) * pay * 1.5));
	System.out.print("���� �ݾ� : " + money); 

	


	}
}