package com.ict06.thread;

public class Ex14_main {
	public static void main(String[] args) {
		Ex14 t1 = new Ex14();
		// x가 0으로 초기화 되지 않으므로 들어갈 때 마다 증가해서 3개니까 150까지 출력
		new Thread(t1, "dog").start();
		new Thread(t1, "cat").start();
		new Thread(t1, "tiger").start();
		
		// 25에서 wait()으로 재워서 dog이 25까지 가고 대기 상태가 됨.
		// 이후 다른 Thread가 들어가서 26부터 시작하는데 125까지 가고 프로그램이 종료됨
		// 즉, 이미 재운 dog는 다른 명령어 없이 깨어나지 않음.
		
		// notify()로 깨워서 25까지 dog하고 26부터 다른 스레드가 담당
		//나중에 부족한 25번은 깨어난 dog이 수행함 결국 150까지 다함
		
		
	}
}
