package com.ict03.class07;

interface Remote1{
	void on();
	void off();
}

class Radio1{
	public void machineWork1(Remote1 remte1) {
		remte1.on();
		remte1.off();
	}
}


public class Ex07_add {
	public static void main(String[] args) {
		Radio1 radio = new Radio1();
		radio.machineWork1(new Remote1() {
			@Override
			public void on() {
				System.out.println("ÄÑ±â");
			}
			@Override
			public void off() {
				System.out.println("²ô±â");
			}
			
		});
	}
}
