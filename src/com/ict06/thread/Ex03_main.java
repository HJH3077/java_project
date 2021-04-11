package com.ict06.thread;

public class Ex03_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); // 스레드 이름
		Ex03 t1 = new Ex03();
		t1.go(); // go에서 go로 실행하러 갔으니까 main Thread가 처리한 것
		System.out.println("수고하셨습니다."); // 이것도 main Thread가 처리함
		// 메인이 혼자 다 일처리하면 싱글 스레드이다.
		
		System.out.println("=============================================");
		
		// 스레드 처리를 위해서 start()를 실행 하면 run()으로 가야 스레드 처리가 된다.
		// run()으로 가야 하지만 start() 메소드가 있어서 start() 메소드로 감	
		// 이것은 스레드 처리가 아니다.
		// Ex03에 있는 start()를 주석처리하면 start() -> run()으로 가게된다.
		// 이것을 스레드 처리했다고 한다.
		// run() -> run()도 똑같다 같은 이름의 메소드가 존재하면 그냥 메소드가 실행된 것
		System.out.println(Thread.currentThread().getName());
		t1.start();
		// Ex03에 start() 메소드가 있기 때문에 start -> run 이 아닌 start -> start로 감.
		// thread처리가 아니라 그냥 메소드가 실행된 것 = main이 다 했으므로
		System.out.println("수고하셨습니다.");
		System.out.println("=============================================");
		
		// 결과는 main이 먼저 할 수 있는걸 다 실행하고 나중에 스레드가 일을 하고있다.
		// 즉, t1.start() 외의 것을 main이 먼저 다 수행하고 스레드가 t1.start()를 돌리고 있다.
		// 이는 핸드폰에서 백그라운드 앱이 실행하는 것과 비슷하다.
		
		
		
		
		
	}
}
