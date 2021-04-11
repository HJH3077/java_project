package com.ict06.thread;

public class Ex19_Customer implements Runnable {
	private Ex17_Car car;

	public Ex19_Customer(Ex17_Car car) {
		this.car = car;
	}

	
	@Override
		public void run() {
			String carName = null;
			for(int i = 0; i < 20; i++) {
				carName = car.pop(); // 의문 : 왜 반환형을 void로 하지 않앗나?
				try {
					Thread.sleep((int)(Math.random() * 500));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				
		}
	
	
	
}
