package com.ict06.thread;

public class Ex14_main {
	public static void main(String[] args) {
		Ex14 t1 = new Ex14();
		// x�� 0���� �ʱ�ȭ ���� �����Ƿ� �� �� ���� �����ؼ� 3���ϱ� 150���� ���
		new Thread(t1, "dog").start();
		new Thread(t1, "cat").start();
		new Thread(t1, "tiger").start();
		
		// 25���� wait()���� ����� dog�� 25���� ���� ��� ���°� ��.
		// ���� �ٸ� Thread�� ���� 26���� �����ϴµ� 125���� ���� ���α׷��� �����
		// ��, �̹� ��� dog�� �ٸ� ��ɾ� ���� ����� ����.
		
		// notify()�� ������ 25���� dog�ϰ� 26���� �ٸ� �����尡 ���
		//���߿� ������ 25���� ��� dog�� ������ �ᱹ 150���� ����
		
		
	}
}
