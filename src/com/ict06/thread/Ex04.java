package com.ict06.thread;

public class Ex04 extends Thread{
	@Override
	public void run() {
		while (true) { 
			System.out.println(currentThread().getName() + ":" + "aaaaa"); // 상속 받았기 때문에 Thread.currntThread 이렇게 쓸필요가 없음
		}
	}
}
