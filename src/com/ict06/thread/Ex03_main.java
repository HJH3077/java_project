package com.ict06.thread;

public class Ex03_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); // ������ �̸�
		Ex03 t1 = new Ex03();
		t1.go(); // go���� go�� �����Ϸ� �����ϱ� main Thread�� ó���� ��
		System.out.println("�����ϼ̽��ϴ�."); // �̰͵� main Thread�� ó����
		// ������ ȥ�� �� ��ó���ϸ� �̱� �������̴�.
		
		System.out.println("=============================================");
		
		// ������ ó���� ���ؼ� start()�� ���� �ϸ� run()���� ���� ������ ó���� �ȴ�.
		// run()���� ���� ������ start() �޼ҵ尡 �־ start() �޼ҵ�� ��	
		// �̰��� ������ ó���� �ƴϴ�.
		// Ex03�� �ִ� start()�� �ּ�ó���ϸ� start() -> run()���� ���Եȴ�.
		// �̰��� ������ ó���ߴٰ� �Ѵ�.
		// run() -> run()�� �Ȱ��� ���� �̸��� �޼ҵ尡 �����ϸ� �׳� �޼ҵ尡 ����� ��
		System.out.println(Thread.currentThread().getName());
		t1.start();
		// Ex03�� start() �޼ҵ尡 �ֱ� ������ start -> run �� �ƴ� start -> start�� ��.
		// threadó���� �ƴ϶� �׳� �޼ҵ尡 ����� �� = main�� �� �����Ƿ�
		System.out.println("�����ϼ̽��ϴ�.");
		System.out.println("=============================================");
		
		// ����� main�� ���� �� �� �ִ°� �� �����ϰ� ���߿� �����尡 ���� �ϰ��ִ�.
		// ��, t1.start() ���� ���� main�� ���� �� �����ϰ� �����尡 t1.start()�� ������ �ִ�.
		// �̴� �ڵ������� ��׶��� ���� �����ϴ� �Ͱ� ����ϴ�.
		
		
		
		
		
	}
}
