package com.ict03.class01;

public class Ex13 {
	private String name = "희동이";
	private int age = 3;
	private String addr = "서울";
	
	// 생성자
	// 기본생성자 : ctrl + space

	
	
	
	public Ex13() {
		// this : 객체 내부에서 객체 자신을 지정하는 예약어
		// this.변수 : 전역변수
		// this() : 생성자가 다른 생성자를 호출할 때 사용하는 예약어
		// 단, 반드시 생성자 첫 줄에만 사용이 가능하다.

		this("공실이", 21, "남극"); // 이 부분이 본인이 해당하는 생성자(4번째 생성자가 있는 부분)로 가서 실행하게됨.
									// 반드시 맨 위에 있어야함!
		System.out.println("기본생성자 " + this);
		// System.out.println(this.name);
		// System.out.println(this.getName());
	}
	
	// 다른 생성자 만드는법 : Source 메뉴 - generate constructor using fields
	public Ex13(String name, int age) {
		this(name, age, "남극");
		
	}
	
	public Ex13( int age, String name) { 
		// super();
		this.name = name;
		this.age = age;
	}
	
	public Ex13(String name, int age, String addr) {
		// super(); 아직 안배움
		this.name = name;
		this.age = age;
		this.addr = addr;
		System.out.println("4번째 생성자");
	}
	


	
	
	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
	
}
