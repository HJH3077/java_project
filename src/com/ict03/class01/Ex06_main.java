package com.ict03.class01;

public class Ex06_main {
	public static void main(String[] args) {
		Ex06 t = new Ex06(); // ��ü ����
		
		String s1 = t.k1(); // k1�� �����ϸ��� name�� �������� �޼ҵ带 �����Ѵ�.
		System.out.println("�̸� : " + s1);
		
		int s2 = t.k2();
		System.out.println("���� : " + s2);

		double s3 = t.k3();
		System.out.println(" Ű  : " + s3);

		char s4 = t.k4();
		System.out.println("rank : " + s4);
		
		System.out.println("=============================================");
		
		t.m1("��浿");
		System.out.println("�̸� : " + t.k1());
		t.m1(37);
		System.out.println("���� : " + t.k2());
		t.m1(170.4);
		System.out.println(" Ű  : " + t.k3());
		t.m1('B');
		System.out.println("rank : " + t.k4());
		
	}
}
