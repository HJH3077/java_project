package com.ict03.class01;

public class Ex05_main {
	public static void main(String[] args) {
		// static ��ü ������ ������� ��밡��
		// Ŭ�����̸�.����ʵ�, Ŭ�����̸�.����޼ҵ�
		System.out.println(Ex05.s3); // static�� s3, s4������ s4�� private�� ���� �Ұ�
									 // static �̶� private�� ���� �� �� ����.
		
		Ex05 test = new Ex05();
		System.out.println(test.s1); // s1,s2 ������ s2�� private�� ���� �Ұ�.
	
		System.out.println(test.s3); 
		
		// �޼ҵ�鵵 ��������
		test.add();
		// test.add2(); ���پȵ�
		System.out.println(test.s1);
	
		System.out.println(test.s3);
	
		
		test.add3(); // ��ȸ���� ����

		
		
		
		
	}
}
