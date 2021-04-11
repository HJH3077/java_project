package com.ict03.class03;

// phone의 기능을 갖는 클래식
public class Ex05 {
	String s_sms;
	public void call() {
		System.out.println("전화기능");
	}
	
	public String sms() { // void가 아닐 때 저장하려면 전역변수 필요 (return값이 필요해서)
		s_sms = "문자기능";
		return s_sms;
	}	
	
	
	
}
