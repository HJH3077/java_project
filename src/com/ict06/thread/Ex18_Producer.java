package com.ict06.thread;

public class Ex18_Producer implements Runnable {
	private Ex17_Car car;
	
	public Ex18_Producer(Ex17_Car car) {
		this.car = car;
	}
	
	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.getCar();
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random() * 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
