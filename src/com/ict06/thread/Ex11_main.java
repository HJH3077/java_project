package com.ict06.thread;

// 데몬 스레드 : 일반 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
//				 일반 스레드가 종료되면 데몬 스레드는 강제적으로 종료됨.
//				 즉, 메인스레드가 일을 끝내면 데몬 스레드들도 끝남.
public class Ex11_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : 시작");
		Ex10 t1 = new Ex10();
		Ex11 t2 = new Ex11();
		
		Thread thread1 = new Thread(t1, "dog");
		thread1.setDaemon(true);
		thread1.start();
		
		// new Thread(t2).start(); 데몬 스레드는 이 방법이 안됨.
		Thread thread2 = new Thread(t2, "cat");
		thread2.setDaemon(true);
		thread2.start();
		
		for (int i = 1; i < 51; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		System.out.println(Thread.currentThread().getName() + " : 끝");
	}
}
