package com.ict01.grammer03;

import java.util.Scanner;
class Ex11{
	public static void main(String[] args){
	// ���� if�� : ���ǽ��� �����϶� �ٽ� ���ǽ��� ����Ѵ�.
	// ���� : if(���ǽ�1){
	//		���ǽ�1�� ���϶� ����;
	//	} else if(���ǽ�2) {
	//		���ǽ�1�� �����̸鼭 ���ǽ�2�� ���϶� ����;
	//	} else if(���ǽ�3) {
	//		���ǽ�1,2�� �����̸鼭 ���ǽ�3�� ���϶� ����;
	//	} else {
	//		���ǽ�1,2,3 ��� �����϶� ��, ������ ���;
	//	}

	// k1�� ������ 90�̻��̸� A, 80�̻��̸� B, 70�̻��̸� C, ������ F
	Scanner sc = new Scanner(System.in);
	System.out.print("������ �Է��ϼ��� : ");
	int k1 = sc.nextInt();
	String score = "";

	if(k1 >= 90)
		score = "A";
	else if(k1 >= 80)
		score = "B";
	else if(k1 >= 70)	
		score = "C";
	else
		score = "F";

	System.out.println("������ " + score);

	// k2�� �빮������, �ҹ�������, ��������, ��Ÿ��������, �Ǻ�
	char k2 = 'd';
	String str = "";
	
	if(k2 >= 'A' && k2 <= 'Z')
		str = "�빮��";
	else if(k2 >= 'a' && k2 <= 'z')
		str = "�ҹ���";
	else if(k2 >= 0 && k2 <= 9)
		str = "����";
	else
		str = "��Ÿ����";

	System.out.println(str + "�Դϴ�.");

	
	// k3�� A,a �̸� ������ī B,b�̸� ����� C,c�̸� ĳ���� ������ �ѱ�
	char k3 = 'A';
	String world = "";

	if(k3 == 'A' || k3 == 'a')
		world = "������ī";
	else if(k3 == 'B' || k3 == 'b')
		world = "�����";
	else if(k3 == 'C' || k3 == 'c')
		world = "ĳ����";
	else
		world = "�ѱ�";

	System.out.println("����� : " + world);




	// menu�� 1�̸� ī���ī 3500, 2�̸� ī��� 4000, 3�̸� �Ƹ޸�ī�� 3000, 4�̸� �����꽺 3500�̴�.
	// ģ���� 2���� 10000���� �Ծ���. �ܵ��� ���ΰ�? (��, �ΰ��� 10% ����.)
	System.out.print("�޴��� �����ϼ��� : ");
	int menu = sc.nextInt();
	System.out.print("�� ���̽Ű���? : ");
	int su = sc.nextInt();
	System.out.print("�����ݾ� : ");
	int pay = sc.nextInt();
	
	int moka = 3500;
	int latte = 4000;
	int ame = 3000;
	int juice = 3500;
	int money = 0;

	if(menu == 1)
		money += moka;
	else if(menu == 2)
		money += latte;
	else if(menu == 3)
		money += ame;
	else if(menu == 4)
		money += juice;

	money = pay - (int)(money * 1.1 * su);
	System.out.println("�ܵ� : " + money); 	
	
	}
}