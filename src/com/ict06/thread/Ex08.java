package com.ict06.thread;

public class Ex08 implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + ":" + "11111");
		}
	}
}
