package com.ict01.grammer02;

class Ex05{
	public static void main(String[] args){
	// �ڷ��� : DataType : �ڹٿ��� ���� ������ ó���� �� �����ϴ� ����
	// 1.�⺻�ڷ��� : �����Ϸ��� ���ؼ� �ؼ��Ǵ� �ڷ��� - boolean, char, byte, short, int, long, float, double
	// 2.�����ڷ��� : Ŭ������ �ڷ������� ����, �޸𸮿� ���� �����Ͱ� ���ִ°� �ƴ� �ٸ����� �ְ� �ּҸ� ���� - ����)String 
	// String(ù���ڰ� �빮���̹Ƿ� Ŭ����) : �����ڷ��������� �⺻�ڷ���ó�� ���
	
	String str = "Hello Java"; // " "(�ֵ���ǥ) ������ �ؾ���. ���ڿ��̹Ƿ� / �����ڷ��������� �⺻�ڷ���ó�� ����� ���
	System.out.println(str);

	// String + ���� : ���� ���� ������ �ϴ°� �ƴ� ���ڿ����� ������ ������. 
	//		   String���� + ������ �ϸ� ����� ������ String�̴�. ��, String�� -, * �̷��� ����.

	String k1 = "1000";
	int k2 = 1000;
	System.out.println(k1 + 10);
	System.out.println(k2 + 10);

	int s1 = 20;
	int s2 = 4;
	System.out.println(s1 + s2);
	System.out.println("��� : " + s1 + s2); // ���� ����� �ٸ�. ���� : ���ʺ��� �����ϹǷ� String�� ���� ����
	System.out.println("��� : " + (s1 + s2)); // ( ) �� �켱���� �������� �ذ���.
	}
}