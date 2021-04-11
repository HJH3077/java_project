package com.ict06.thread;

public class Ex14 implements Runnable{
	// ����ȭ ó���� �� ���� ���� �����带 ������ ��� ���·� ���� ��Ű�� 
	// �޼ҵ带 wait() ("���� ����" ��� ǥ����)��� �Ѵ�.
	// �ѹ� wait()�� ������� Ǯ������ ������ �״�� ��� ���¿��� ���α׷��� ����ȴ�.
	// wait()�� �����带 Ǯ���ִ� �޼ҵ带 notify()(1���� "�����" ��� ǥ��), notifyAll() (��� ����)�̶�� �Ѵ�.
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
			if(x == 25) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				notify();
			}
		} 
	}
	
	

}