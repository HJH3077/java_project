package com.ict06.thread;

// ���� ������ : �Ϲ� �������� �۾��� ���� �������� ������ �����ϴ� ������
//				 �Ϲ� �����尡 ����Ǹ� ���� ������� ���������� �����.
//				 ��, ���ν����尡 ���� ������ ���� ������鵵 ����.
public class Ex11_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : ����");
		Ex10 t1 = new Ex10();
		Ex11 t2 = new Ex11();
		
		Thread thread1 = new Thread(t1, "dog");
		thread1.setDaemon(true);
		thread1.start();
		
		// new Thread(t2).start(); ���� ������� �� ����� �ȵ�.
		Thread thread2 = new Thread(t2, "cat");
		thread2.setDaemon(true);
		thread2.start();
		
		for (int i = 1; i < 51; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		System.out.println(Thread.currentThread().getName() + " : ��");
	}
}
