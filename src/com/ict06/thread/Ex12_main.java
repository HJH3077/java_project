package com.ict06.thread;

public class Ex12_main {
	public static void main(String[] args) {
		System.out.println("main 시작");
		Ex12 t1 = new Ex12();
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		// join() : 현재 스레드는 join()을 호출한 스레드가 끝날 때까지 
		//			대기 상태에 빠져 있다가 join()을 호출한 스레드가 끝나면 다시 실행한다.
		//          즉, join()을 호출한 스레드가 끝날 때까지 실행 안함.
		try {
			thread1.join();
		/*	for(int i = 1; i < 51; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}
			System.out.println("main 끝");*/
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("끝");
		
		// 원래는 main이 먼저 빠르게 끝나고 thread1이 start를 수행하고 있었는데 이젠
		// thread1이 끝날 때까지 main이 안끝나고 기다리다가 thread1이 끝나면 같이 끝남
		
	}
}
