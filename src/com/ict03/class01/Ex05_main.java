package com.ict03.class01;

public class Ex05_main {
	public static void main(String[] args) {
		// static 객체 생성과 상관없이 사용가능
		// 클래스이름.멤버필드, 클래스이름.멤버메소드
		System.out.println(Ex05.s3); // static은 s3, s4이지만 s4는 private라 접근 불가
									 // static 이라도 private는 접근 할 수 없다.
		
		Ex05 test = new Ex05();
		System.out.println(test.s1); // s1,s2 이지만 s2는 private라 접근 불가.
	
		System.out.println(test.s3); 
		
		// 메소드들도 마찬가지
		test.add();
		// test.add2(); 접근안됨
		System.out.println(test.s1);
	
		System.out.println(test.s3);
	
		
		test.add3(); // 우회접근 성공

		
		
		
		
	}
}
