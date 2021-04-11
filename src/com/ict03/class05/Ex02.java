package com.ict03.class05;

public class Ex02 {
	public static void main(String[] args) {
		// Ex01 멤버필드들이 static 이라는 증거 
		// 객체 생성없이 클래스 이름으로 접근 할 수 있다.
		System.out.println(Ex01.su); // 마우스만 대봐도 S,F로 static, final임
		System.out.println(Ex01.su2);
		System.out.println(Ex01.su3);
		System.out.println(Ex01.su4);
		
		// 값 변경이 안된다. => final 이라는 증거
		/*
		System.out.println(Ex01.su++);
		System.out.println(Ex01.su2++);
		System.out.println(Ex01.su3++);
		System.out.println(Ex01.su4++);
		*/
		
		// Ex01 ctrl + space 에서 C는 클래스, I는 인터페이스
		
		
	}
}
