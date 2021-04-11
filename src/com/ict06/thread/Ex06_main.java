package com.ict06.thread;

public class Ex06_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); // 애는 Thread를 상속받은게 아니기 때문에 Thread.currentThread를 해야함.
															  // 원래는 객체 생성전에 못써야 하지만 currentThread가 static이기 때문에 사용가능.
		Ex04 t1 = new Ex04();
		Ex05 t2 = new Ex05();
		Ex06 t3 = new Ex06();
		
		/*
		// 스레드 처리가 아님 그냥 Ex04 ~ Ex06의 run()을 호출하는 메소드
		// 그래서 t1에 main이 잡혀서 무한루프로 수행을해서 빠져 나오지 못하고 t1만 계속 수행됨.
		t1.run();
		t2.run();
		t3.run();
		*/
		
		// 스레드 처리는 병렬 처리라는 증거
		t1.start();
		t2.start();
		t3.start();
		
		// 원래 Thread처리가 아니라면 t1에서 무한루프에 빠져 나머지 t2, t3는 실행조차 하지 않는다
		// 하지만 스레드처리가 병렬이기 때문에 운영체제가 알아서 우선순위를 조절해서 순서같은거 x (스케줄러가 알아서 우선순위 두고 정함)
		// t1 ~ t3를 번갈아가면서 계속 수행한다. 이런 병렬처리가 가능해야 음악들으면서 웹툰보기 이런 다중으로 일하는게 가능
		
		
	}
}
