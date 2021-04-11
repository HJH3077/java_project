package com.ict03.class03;

public class Ex08_main {
	public static void main(String[] args) {
		// 일반적인 객체 생성
		Ex06_MP3 mp3 = new Ex06_MP3();
		mp3.call(); // call은 부모인 Ex05의 메소드인데 사용이 가능해짐.
		
		System.out.println("실행전 : " + mp3.s_sms); // null 아무것도 없음 s_sms에 아무것도 안넣고 선언해서
		mp3.sms();
		System.out.println("실행후 : " + mp3.s_sms);
		
		mp3.sound();
		System.out.println();
		
		Ex07_DCa dca = new Ex07_DCa();
		dca.call();
		
		System.out.println("실행전 : " + dca.s_sms);  // null 값
		dca.sms();
		System.out.println("실행후 : " + dca.s_sms); // 문자기능
		
		dca.picture();
		
		System.out.println("======================================");
		
		// 상속관계에서는 부모클래스를 가지고 선언할 수 있다.
		// 단, 이러한 경우 자식클래스의 메소드를 사용할 수 없다.
		Ex05 p1 = new Ex06_MP3(); // Ex05로 선언을 부모의 것으로 함
								  // 이 경우 p1은 자식인 Ex06의 메소드인 sound()는 실행할 수 없다.
		p1.call();
		p1.sms();
		System.out.println(p1.s_sms);
		// p1.sound(); 오류발생
		
		
	}	
}
