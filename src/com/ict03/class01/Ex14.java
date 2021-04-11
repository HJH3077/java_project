package com.ict03.class01;

public class Ex14 {
	// static : 객체 생성과 상관없이 미리 만들어지는 필드와 메소드
	//			클래스와 지역변수에서는 static사용 불가
	//			공유 개념(모든 객체가 사용할 수 있다.)
	//			단, 접근제한자가 private이면 static이라도 접근할 수 없다.

	int su1 = 10;
	static int su2 = 10;
	
	// 기본생성자
	public Ex14() {
		su1++;
		su2++;
	}
	
	public void prn() {
		int su3 = 10;
		su2++;
		// static int su4 = 1; // 지역변수에서는 static 사용불가여서 오류
	}
	
	// static 메소드는 인스턴스 변수 사용 불가, static 변수와 참조할 수 있다.
	public static void prn2() { // 해당 메소드를 호출(실행)할 때 변수가 만들어지는 것이므로 미리 만들어 지는 static 사용 불가
		// System.out.println(su1);
		System.out.println(su2);
		int su4 = 10;
		// static int su5 = 10; // static 메소드여도 지역변수에는 static 불가능
	}
	
}
