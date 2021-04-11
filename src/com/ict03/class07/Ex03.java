package com.ict03.class07;

public class Ex03 {
	String name = "둘리";
	int height = 160;
	public Ex03() {
		System.out.println("외부생성자 : " + this);
	}
	
	public void sound() {
		String addr = "서울";
		System.out.println("호이~ 호이~");
	}
	
	// 내부클래스를 담은 외부메소드
	public void play() {
		int age = 24;
		class Inner02 { // public 사용 불가 = 공용이 아니니까
			String name = "희동이";
			int time = 36;
			public Inner02() {
				System.out.println("내부생성자 : " + this);
			}
			public void hobby() {
				System.out.println(name);
				System.out.println(height);
				// System.out.println(addr); 자기가 속한 메소드가 아니므로 지역변수 사용 불가
				System.out.println(age); // 속해있는 age는 사용가능
				System.out.println(time);
				
			} // 내부메소드 끝
		} // 내부클래스끝
		Inner02 in02 = new Inner02();
		// 외부 멤버
		System.out.println(name);
		// 외부 메소드
		sound();
		// 내부 메소드
		in02.hobby();
	} // 외부 메소드 끝
	
}
