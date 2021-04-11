package com.ict06.thread;

public class Ex01 {
	public static void main(String[] args) {
		// Thread ������
		// - Thread() : �⺻������
		// - Thread(Runnable target) : Runnable �������̽��� ���ڷ� �޾Ƽ� ó��
		//							   (�͸� ����Ŭ������ ����� �� �ִ�.)
		// - Thread(String name) : Thread�� �̸��� ������ �� �ִ�.
		// - Thread(Runnable target, String name) : Thread�� �̸��� ������ �� �ִ�.
		//											Runnable �������̽��� ���ڷ� �޾Ƽ� ó��.
		
		// �ֿ�޼ҵ�
		// - join() : ���� ������� join() �޼ҵ带 ȣ���� �����尡 ���� ������
		//			  �����·� �����ִٰ� join()�� ȣ���� �����尡 ������ �ٽ� �����Ѵ�.
		//			  ��, join()�� ȣ���� �����尡 ���� ������ ������ �� ����.
		// - start() : start()�� �����ϸ� run()�� ȣ���Ѵ�.
		//	 		  (���� start()�� ������ start()�� ����. = �� �� �����尡�ƴ�, �׳� �޼ҵ� ����)
		// - run() : start()�� ȣ���ؼ� run()�� ����Ǹ� �� �� ������ ó���� �ߴٰ� �Ѵ�.
		// - sleep(long millis) : 1000�� 1�ʸ� �ǹ��ϰ�, ��� ��� ���·� �����ִ� ���¸� ����.
		//						  ��, 1�ʵ��� ��� ���� ����
		// - yield() (�ߵ�) : ���� ���� ������ �� �켱������ ���� �ٸ� �����忡�� ������� �ѱ��.
		// - getName() : ������ �̸� ���ϱ�
		// - setName(String name) : ������ �̸� ����
		// - currentThread() : ���� ����Ǵ� ������ ��ü�� �����Ѵ�.(static)
		
		// �տ��� ���� ��� ó���� main�����尡 ȥ�ڼ� �� ó���ߴ�.
		// �̷��� ���� �̱� �������� �Ѵ�.
		// �����带 ��ó���ϴ� �ϲ��̶�� ��������
		
		// static�̱� ������ ��ü �������� ȣ���� ����
		// JVM�� main�޼ҵ带 ȣ���ϸ� ������ main�����尡 ��ó���� �Ѵ�.
		System.out.println(Thread.currentThread().getName()); // ������ �̸��� Ȯ������
		
		Ex02 test = new Ex02();
		System.out.println("1" + Thread.currentThread().getName());
		test.add(5, 8);
		System.out.println("4" + Thread.currentThread().getName());
		
		int result = test.sub(8, 5); // int�� ��ȯ�Ǳ� ������ ���� �־����.
		System.out.println("7" + Thread.currentThread().getName());
		System.out.println(result);
	}
}
