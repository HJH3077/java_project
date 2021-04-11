package com.ict06.thread;

public class Ex09_main {
	public static void main(String[] args) {
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		// t1.start(); �� �ȵ�. Ex07���� start�� ���� Runnable���� start�� �����Ƿ�
		
		// ���� run() �޼ҵ带 ���� Ŭ���� ��, Ÿ���� �����ؾ���.
		// Thread thread1 = new Thread(Runnable target);
		Thread thread1 = new Thread(t1); // �̷��� thread1 �� start�� ������ ����
		thread1.start();
		
		new Thread(t2).start(); // �̷� ����� ������ ������ �̸��� ������ �ʾƼ� �ٽ� ȣ���� �Ұ�����.
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		// �ȵ���̵忡�� ���� ����ϴ� ���! (�ͺ� ���� Ŭ���� �̿�)
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + ":" + "����������");
				}
			}
		}).start(); // ���� ����� �ǵ� new Thread(t2).start() �� ���� ����
					// new Thread�� �ϰ� t2��� new Runnable �͸� ����Ŭ������ ���ڷ� �� ���̰� ���ڰ� ���� �� .start()
		
		// ������ extends Thread���� implements Runnable�� �� ���� ����. 
		// why? extends Thread�� ���� �ٸ� ���� ��ӹ��� ���� ���� ������
		// �������̽��� ���� ����� �����ؼ� �ٸ� ���� ��Ӱ����� Runnable�� �翬�� �� ���� ���δ�.
		
		
		
		
		
	}
}
