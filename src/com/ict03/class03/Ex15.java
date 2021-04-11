package com.ict03.class03;

public class Ex15 extends Ex14 {
	String name = "홍일점";
	int id = 2410;
	
	public Ex15() {
		super("일지매", 15);
		// super(); 가 생략되어 있어서 자식호출시 부모가 먼저 호출되는 것임.
		System.out.println("자식클래스 생성자 : " + this);
		name = "홍두께"; // 바꾸고 싶어서 바꿈
		id = 1004;		 // 생성자의 목적 : 멤버의 초기값을 초기화(= 원하는 것으로 바꿈)
				
	}

	public Ex15(String name) {
		super("태권브이", 37); // 부모클래스와 인자가 맞는 생성자가 생겨서 오류가 없어짐
		this.name = name; // source에서 생성자 생성
	}
	
	public void prn() {
		String name = "홍시";
		// 지역, 전역, 부모 모두 같은이름의 변수를 가지고 있다. -> 반드시 구분할 것!
		System.out.println("지역변수 이름 : " + name);
		System.out.println("전역변수 이름 : " + this.name);
		System.out.println("부모변수 이름 : " + super.name);
		
		// 부모만 가지고 있는 변수 : 구분하지 않아도 됨.
		System.out.println("지역변수 나이 : " + age); // age는 부모만 가지고 있으므로 구분하지 않아도됨.
		System.out.println("전역변수 나이 : " + age);
		System.out.println("부모변수 나이 : " + age);
		
		// 전역변수만 가지고 있는 변수 (부모 x, 자식 o)
		System.out.println("지역변수 id : " + id);
		System.out.println("전역변수 id : " + this.id);
		// System.out.println("부모변수 id : " + super.id); 자식만 가지고 있는 변수여서 오류
	}
}
