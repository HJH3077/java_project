package com.ict06.thread;

public class Ex15_main {
	public static void main(String[] args) {
		Ex15 t1 = new Ex15();
		new Thread(t1, "1¹ø").start(); 
		new Thread(t1, "2¹ø").start(); 
		
		
	}
}
