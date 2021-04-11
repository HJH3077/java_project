package com.ict06.thread;

public class Ex09_main {
	public static void main(String[] args) {
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		// t1.start(); 가 안됨. Ex07에도 start가 없고 Runnable에도 start가 없으므로
		
		// 실행 run() 메소드를 가진 클래스 즉, 타겟을 지정해야함.
		// Thread thread1 = new Thread(Runnable target);
		Thread thread1 = new Thread(t1); // 이러면 thread1 은 start를 가지고 있음
		thread1.start();
		
		new Thread(t2).start(); // 이런 방법도 가능은 하지만 이름을 정하지 않아서 다시 호출이 불가능함.
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		// 안드로이드에서 많이 사용하는 방법! (익병 내부 클래스 이용)
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + ":" + "ㅁㅁㅁㅁㅁ");
				}
			}
		}).start(); // 위와 비슷한 건데 new Thread(t2).start() 와 같은 개념
					// new Thread를 하고 t2대신 new Runnable 익명 내부클래스를 인자로 쓴 것이고 인자가 끝날 때 .start()
		
		// 실제로 extends Thread보다 implements Runnable을 더 많이 쓴다. 
		// why? extends Thread를 쓰면 다른 것을 상속받을 수가 없기 때문에
		// 인터페이스는 다중 상속이 가능해서 다른 것이 상속가능한 Runnable이 당연히 더 많이 쓰인다.
		
		
		
		
		
	}
}
