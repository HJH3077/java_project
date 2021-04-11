package com.ict03.class01;

// VO(Value Object)를 만들 때 이렇게 만듬. ***** 나중에 사용하기 때문에 잘 알아두는게 좋음
public class Ex07 {
	private String name = "둘리";
	private int age = 13;
	private double height = 135.15;
	private boolean gender = true;
	private char rank = 'A';
	// getter/setter 호출 => 메뉴 - source - generate getter and setter
	
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public boolean isGender() {
		return gender;
	}
	public char getRank() {
		return rank;
	}
	
	// setter
	public void setName(String name) {
		this.name = name; // this name은 전역변수의 name이고 name은 main의 입력받는 지역변수 name이다. 
	}					  // 지역변수와 전역변수의 이름이 같을 때 구별하기 위해 this 사용.
						  // 지역변수이름과 전역변수이름이 같을 때 우선순위는 지역변수가 높다.
						  // 즉, name = name 일 때 지역변수 이름이 name이면 name = name 둘다 지역변수가됨.
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public void setRank(char rank) {
		this.rank = rank;
	}
	

	
	
	
	
}
