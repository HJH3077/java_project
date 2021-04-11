package com.ict03.class07;

interface Remote{
	void on();
	void off();
}

class Radio{
	public void radioWork() {
		Remote radio = new Remote() {
			@Override
			public void on() {	
				System.out.println("Radio�� �մϴ�.");
			}
			@Override
			public void off() {
				System.out.println("Radio�� ���ϴ�.");
			}
		};
		radio.on();
		radio.off();
	}
	public void machineWork(Remote remte) {
		remte.on();
		remte.off();
	}
}


public class Ex07 {
	public static void main(String[] args) {
		Radio radio = new Radio();
		radio.machineWork(new Remote() {
			@Override
			public void on() {
				
			}
			@Override
			public void off() {
				
			}
			
		});
	}
}
