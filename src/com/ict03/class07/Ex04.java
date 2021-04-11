package com.ict03.class07;

// 3. static 내부클래스
public class Ex04 {
	static String name = "홍길동";
	private static int age = 24;
	static String addr = "제주도";
	
	
	public Ex04() {
		System.out.println("외부클래스 생성자 : " + this);
	}
	
	public static void sound() {
		int money = 1000;
		final int time = 2;
		// static int number = 12; 지역변수는 static 사용 불가!(메소드가 호출되야 생기는 것이므로)
		// static final int number2 = 12;
		System.out.println("외부클래스 메소드 : " + name + ", money : " + money); // 지역,전역변수 모두 가져다씀
	}
	
	// Member 내부클래스
	public static class Inner03 {
		String name = "홍일점";
		final int i2 = 10;
		// 내부클래스에서는 static 사용 불가! (단, 꼭 붙여야 한다면 static 내부클래스 사용)
		// 강제로 static을 사용하고자 하려면 내부클래스에도 static을 붙여라.
		static int i3 = 20; 
		static final int i4 = 30;
		
		public Inner03() {
			System.out.println("내부클래스 생성자 : " + this); // ** 주소값에 $가 존재하면 내부클래스이다.
		}
		
		// 내부클래스 메소드
		// 내부클래스는 외부클래스의 메소드와 필드를 마음대로 사용가능
		public void play() {
			// 외부클래스의 메소드와 똑같은데 사용이 가능함?
			int money = 50000;
			System.out.println("이름 : " + name);
			System.out.println("금액 : " + money);
			//	System.out.println("나이 : " + age); static 내부클래스이므로 오류발생
			// 외부클래스의 멤버에도 static을 붙여야 사용 가능
			System.out.println("나이 : " + age); 
			// 외부클래스의 메소드도 static을 붙여야 사용 가능
			sound(); // 외부클래스의 메소드 sound()
		}
		
	}
	
	
}
