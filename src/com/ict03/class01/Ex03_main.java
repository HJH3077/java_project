package com.ict03.class01;

public class Ex03_main {
	public static void main(String[] args) {
		// Ex03 Ŭ������ ��ü�� ������
		Ex03 test = new Ex03(); // �����ڸ� �ȸ�������� �⺻������
		
		// plus01 �� void�̹Ƿ� ���� �����Ͱ� ����.
		System.out.println(1);
		test.plus01(); // ���Ⱑ ������ result�� �ʱⰪ�� 0�� ���´�.
					   // �޼ҵ�� ȣ���ؾ� �����ϱ� ������. ��� ȣ���� �̰����� �ᱹ �ٽ� ���ƿ�.
		System.out.println(3);
		System.out.println(test.result);
		
		// sub01 �� ��ȯ���� int�̹Ƿ� ���� ������ int������ ������ �Ѵ�.
		int sub = test.sub01();
		System.out.println(sub);
		
	}
}
