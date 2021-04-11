package com.ict03.class01;

public class Ex11 {
	// 생성자 : 클래스를 객체로 만들 때 자동으로 한번 호출된다.
	// 목적 : 멤버필드(변수와 상수)의 초기화
	// 특징 : 클래스이름과 생성자이름은 같다. 클래스이름([인자 = 매개변수]);
	//		  반환형이 없는 메소드라고도 한다.
	//		  생성자를 만들지 않으면 자동으로 기본생성자로 객체를 생성한다. 
	//		  기본생성자 : 인자가 없는 생성자 예) class();
	//		  생성자도 오버로딩이 가능
	//		  오버로딩 : 하나의 클래스에 여러개의 생성자가 존재할 수 있다. 
	//		  			 단, 인자의 종류나 갯수나 순서가 달라야 한다.
	//				     클래스 안에서 생성자를 만들었으면 만들어진 생성자를 사용해야 한다.
	
	private String name = "둘리"; // 즉, 여기 변수는 setter로 바꾸든가 생성자로 바꿔야함.
	private int age = 24;
	private boolean gender = true;
	
	// 생성자 오버로딩 (2개 이상이면 오버로딩)
	// 기본생성자
	public Ex11() { // 위의 초기값이고 뭐고 이 기본생성자의 값으로 무조건 초기화됨.
		System.out.println("기본생성자");
		name = "태권브이";
		age = 43;
	}
	
	
	// 기본생성자가 아닌 다른 생성자 (인자가 있는 생성자를 만듬)
	public Ex11(String name, int age) {
		System.out.println(1);
		this.name = name;
		this.age = age;
		
	}
	
	public Ex11(int age, String name) { // 위와 똑같지만 순서가 달라서 오류가 안남. 서로 다른걸로 인식
		System.out.println(2);			// 하나의 클래스에 여러 생성자를 만드는 "오버로딩" !
		this.name = name;
		this.age = age;
		
	}  // 실제로 출력해보면 이름, 나이 순이면 1이 출력 나이, 이름 순이면 2가 출력이됨. 
	   // 두 생성자가 다르다는걸 알 수 있음.
	
	
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public boolean isGender() {
		return gender;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	

	
	
}
