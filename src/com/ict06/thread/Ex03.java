package com.ict06.thread;

// ������� start() => run() �̵��ؾ� ������� ó���� ��.
//			start() => start() �����尡 �ƴ� �׳� �޼ҵ���
//			run() => run() ���� �����尡 �ƴ�

// ������ ������ Thread Ŭ������ ���, Runnable �������̽� ���
// ������ Ŭ������ start(), run() ��� ������ �ִ�.
// Runnable �������̽��� run()�� ������ �ִ�. (�������̽��� ����� �߻�޼ҵ常 ������ ����)

public class Ex03 extends Thread {	
	public void go() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
	/*
	@Override
	public void start() {
		for (int i = 11; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
	*/
	@Override
	public void run() { // �θ� �޼ҵ带 ������ ���� = �������̵�
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			}
	}
	
	
	
}
