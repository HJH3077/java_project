package com.ict06.thread;

public class Ex16_main {
	public static void main(String[] args) {
		Ex16 t1 = new Ex16();
		
		Thread thread1 = new Thread(t1, "1¹ø");
		thread1.start();
		
		new Thread(t1, "2¹ø").start();
		
	}
}
