package com.ict06.thread;

public class Ex13_main {
	public static void main(String[] args) {
		Ex13 t1 = new Ex13();
		new Thread(t1, "dog").start(); // �ϲ� Thread�� �̸� �ο�
		new Thread(t1, "cat").start();
		new Thread(t1, "tiger").start();
		new Thread(t1, "lion").start();
		// �̷��� 4���� Thread�� ���ÿ� t1�� ���� ��, t1�� �Ӱ迵���� ��.
		// ���� ���ϴ� ���ܼ� dog : 1 ������ dog : 2�� �ƴ� cat : 1�� �Ǵ� ��
		// ����� ������ �߱������̰� ���� 1~50���� �����
		// synchronized�� ����ȭ�ϸ� �ϳ��� ���� 1~50���� �� ���� ������ ���ٺҰ�
		
		
		
		
		
		
		
		
		
	}
}
