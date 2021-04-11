package com.ict06.thread;

// 스레드는 start() => run() 이동해야 스레드로 처리가 됨.
//			start() => start() 스레드가 아님 그냥 메소드임
//			run() => run() 또한 스레드가 아님

// 스레드 실행은 Thread 클래스를 상속, Runnable 인터페이스 상속
// 스레드 클래스는 start(), run() 모두 가지고 있다.
// Runnable 인터페이스는 run()만 가지고 있다. (인터페이스는 상수와 추상메소드만 가지고 있음)

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
	public void run() { // 부모 메소드를 가져다 쓰기 = 오버라이딩
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			}
	}
	
	
	
}
