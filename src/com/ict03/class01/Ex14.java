package com.ict03.class01;

public class Ex14 {
	// static : ��ü ������ ������� �̸� ��������� �ʵ�� �޼ҵ�
	//			Ŭ������ �������������� static��� �Ұ�
	//			���� ����(��� ��ü�� ����� �� �ִ�.)
	//			��, ���������ڰ� private�̸� static�̶� ������ �� ����.

	int su1 = 10;
	static int su2 = 10;
	
	// �⺻������
	public Ex14() {
		su1++;
		su2++;
	}
	
	public void prn() {
		int su3 = 10;
		su2++;
		// static int su4 = 1; // �������������� static ���Ұ����� ����
	}
	
	// static �޼ҵ�� �ν��Ͻ� ���� ��� �Ұ�, static ������ ������ �� �ִ�.
	public static void prn2() { // �ش� �޼ҵ带 ȣ��(����)�� �� ������ ��������� ���̹Ƿ� �̸� ����� ���� static ��� �Ұ�
		// System.out.println(su1);
		System.out.println(su2);
		int su4 = 10;
		// static int su5 = 10; // static �޼ҵ忩�� ������������ static �Ұ���
	}
	
}
