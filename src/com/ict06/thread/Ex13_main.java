package com.ict06.thread;

public class Ex13_main {
	public static void main(String[] args) {
		Ex13 t1 = new Ex13();
		new Thread(t1, "dog").start(); // 일꾼 Thread에 이름 부여
		new Thread(t1, "cat").start();
		new Thread(t1, "tiger").start();
		new Thread(t1, "lion").start();
		// 이러면 4개의 Thread가 동시에 t1에 접근 즉, t1이 임계영역이 됨.
		// 각자 일하다 뺏겨서 dog : 1 다음이 dog : 2가 아닌 cat : 1이 되는 등
		// 결과가 순서가 중구난방이고 각자 1~50까지 출력함
		// synchronized로 동기화하면 하나가 들어가면 1~50까지 일 끝날 때까지 접근불가
		
		
		
		
		
		
		
		
		
	}
}
