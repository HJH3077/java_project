package com.ict01.grammer03;

import java.util.Scanner;
class Ex07{
	public static void main(String[] args){
	// Scanner Ŭ���� �˾ƺ���
	// Scanner �� �Ҽ��� java.util.Scanner�̴�.
	// java.lang �� �Ҽӵ� Ŭ������ ������� ��������� �̿��� Ŭ������ �Ҽ��� ǥ���ؾ���(import�� �Ҽ�ǥ��)
	// Ŭ���� �ȿ��� Constructor(������), Method(�޼���), Field(�ʵ�)�� ����
	// Method => ����, ���, �� �� �۵��ϴ� ��
	// �ڷ����� �ȸ´°� ������ �ٷ� ������ ��!

	Scanner scan = new Scanner(System.in); // " Ű���忡 �Էµ� ������ scan�� ����ȴ�. " ��� �ǹ�

	// scan�� ����� ������ �������� (������ �� ������ String���� ������)	
	System.out.print("����� �̸� : ");	
	String name = scan.next(); // ���ǻ��� : ����� x 

	// ����� ������ �������� (������ �� ������ int�� ������)	
	System.out.print("���� ���� : ");
	int kor = scan.nextInt();

	System.out.print("���� ���� : ");
	int eng = scan.nextInt();

	System.out.print("���� ���� : ");
	int math = scan.nextInt();

	int sum = kor + eng + math;
	System.out.println("���� : " + sum);
	
	// char�� ����. ���߿� String���� ���.

	System.out.print("����� Ű : ");
	double height = scan.nextDouble();
	System.out.println(height);

	// ���� ������ boolean������ ���
	System.out.print("����� �����Դϱ�? (true/false)");
	boolean gender = scan.nextBoolean();
	String str = gender? "�����Դϴ�." : "�����Դϴ�.";
	System.out.println(str);

	}
}