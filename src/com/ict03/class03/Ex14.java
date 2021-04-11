package com.ict03.class03;

public class Ex14 {
	String name = "홍길동";
	int age = 27;
	
	
	public Ex14() {
		System.out.println("부모클래스 생성자 : " + this);
		// 자기 자신을 지칭하는 this를 썻으므로 주소값이 나옴
		age = 17;
	}
	
	
	// 다른 생성자
	public Ex14(String name, int age) {
		super(); // 여기의 super()도 부모의 생성자를 호출하는데
				 // 기본적으로 *** 부모생성자 Object를 호출함! (생략가능)
		this.name = name;
		this.age = age;
	}
	
	// 여기의 기본 생성자가 없으면 자식의 생성자들이 오류가 발생
	// whyy? 자식의 생성자들은 super()가 은닉되어있으므로 
	// super()는 부모의 기본생성자를 호출하는 명령어인데 부모의 기본생성자가 없네? = 오류
	// 그래서 super() 가 아닌 super(인자)로 자식의 인자를 맞춰주면 사용가능
	

	
}
