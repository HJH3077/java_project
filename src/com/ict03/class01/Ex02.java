package com.ict03.class01;

public class Ex02 {
	// 클래스 안에는 3가지가 존재한다.
	// 멤버필드, 멤버메소드, 생성자
	// 멤버필드 : 상수와 변수, static과 instance로 나눠진다.
	// final이 있으면 상수, static이 없으면 인스턴스(객체 생성할 때 같이 만들어짐.)
	// static 이란 객체 생성과 상관없이 미리 만들어진다.
	
	
	// 전역변수는 파란색
	int k1 = 80; 				// instance(static이없으므로) 변수 = 일반변수
	static int k2 = 90; 		// static 변수 
	final int K3 = 85;			// 인스턴스 상수(final이 붙어서 상수)
	static final int K4 = 95;	// static 상수 = API에서 제공하는 상수형태
	// System.out.println() 사용 불가. 메소드 안이 아니라서
	
	// 멤버메소드 : 동작, 기능
	// 메소드는 자기를 호출한 곳으로 되돌아간다.
	// 소문자( ) 가 있으면 무조건 메소드임
	
	public void prn01() { // 인스턴스, 반환형이 없다
		// 값 변경이 가능하므로 변수
		k1 = k1 + 20;
		k2 = k2 + 10;
		System.out.println("k1 = " + k1);
		System.out.println("k2 = " + k2);
		
		/*
		final이 붙으면 상수, 상수는 값 변경을 할 수 없다. 그래서 오류발생
		k3 = k3 + 15;  
		k4 = k4 + 5;   
		*/ 
		
		// 지역변수 : 메소드 안에서 만들어진 변수
		// 			  메소드 안에서 만들어진 변수는 메소드를 호출할 때 생성된다.
		//			  메소드가 끝나면 메모리에서 자동으로 사라진다.
		// 			  현재 메소드가 인스턴스라서 호출해야 나오는데 static인 변수를 사용할 수가 없음.
		//			  지역변수는 static을 사용할 수가 없다.
		int s1 = 10;
		// static int s2 = 90; 지역변수는 static불가능
		final int s3 = 85;
		// static final int s4 = 95;
		
		System.out.println();
	
	}
	
	public static void prn02() { // static, 반환형이 없다. return 써도되는데 의미는 없음
		// k1 = k1 + 20; static이 없어서 오류
		k2 = k2 + 10;
		// K3 = K3 + 15;  
		// K4 = K4 + 5; 상수를 변경하려고 해서 오류  
		System.out.println("k2 = " + k2);
		System.out.println("K4 = " + K4);
	
		// 지역변수는 static 사용 불가 static 메소드여도.
		int s1 = 10;
		// static int s2 = 90; 
		final int s3 =85;
		// static final int s4 = 95;
		
		System.out.println();
	}
	
	public int prn03() { // 인스턴스, 반환형이 있음, 마지막 줄 return '보낼데이터'
		return 14; // return 사용하니 오류가 없어짐, 반환형이랑 같은 자료형
		// return 'c'; 도 가능 (작은 자료형은 가능) 
	}
	
	public static double prn04() { // static, 반환형이 있음
		System.out.println("K4 = " + K4);
		return 3.14;
		// return 114; (작은 자료형 가능)
	}
	
	
}
