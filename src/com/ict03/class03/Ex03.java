package com.ict03.class03;

// Ex02(부모)와 Ex03(자식)은 상속관계, 자식은 부모꺼 사용가능 근데 부모는 자식꺼 x
public class Ex03 extends Ex02 {
	String name = "차두리";
	int age = 34;
	static String hobby = "영화보기";
	
	public Ex03() {
		System.out.println("자식클래스 생성자 : " + this);
	}
	
	public void sound() {
		System.out.println("자식클래스 메소드");
	}
	
	public void study() {
		// 객체 생성없이 부모클래스의 멤버필드를 사용한 경우
		System.out.println("공부장소 : " + addr); // Ex02의 addr을 객체 생성없이 그냥 쓸 수 있음.
		
		// 부모와 자식의 변수이름이 같으면 부모의 변수에 super.으로 구별
		System.out.println("name : " + this.name); // 차두리
		System.out.println("name : " + super.name); // 차범근
		
		// 상속관계여도 private는 사용할 수 없다.
		// System.out.println("우리집 애완동물 : " + dog); private여서 쓸 수 없음
	}
	
	// 오버라이딩 : 부모메소드의 겉모양은 그대로 사용하면서 내용만 변경하는 것 (= 재정의)
	
	@Override
	public void eat() {
		System.out.println("아침밥은 생략한다"); // 부모메소드를 그대로 가져왔지만 내용을 바꿈(밥먹 -> 밥안먹)
		// super.eat(); 
	}
	
	/*
	public void walk() { // final로 못고치게 막아서 오류가 발생
		System.out.println("나는 걷기 싫어");
	}
	 */
	
	// 오버라이딩을 할 수 없게 만드는 예약어 : final
	// 부모메소드에 final 있으면 override 할 수 없다.
	
	
}