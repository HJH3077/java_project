package com.ict03.class01;

public class Ex06 {
	// 저장하는 곳으로 본 클래스. 각종 자료형을 저장 가능.
	private String name = "홍길동"; // public이라고 다른곳에서 값을 바꿀 수 있는 것은 아님
	private int age = 24;			// 그래서 setter가 필요함!
	private double height = 180.3;
	private char rank = 'A';
	
	// 외부에서 private 변수에 접근하기 위해서는 메소드를 사용해야 한다.
	// 이것을 "getter() 메소드" 라고한다.
	// 이름 돌려주기
	public String k1() {
		return name;
	}
	// 나이 돌려주기
	public int k2() {
		return age;
	}
	// 키 돌려주기
	public double k3() {
		return height;
	}
	// rank 돌려주기
	public char k4() {
		return rank;
	}
	
	// 변수에 접근해서 해당 변수의 데이터를 변경할 때 사용
	// 이것을 "setter() 메소드" 라고한다.
	// 이름 바꾸기
	public void m1(String t1) {
		name = t1;
	}
	// 나이 바꾸기
	public void m1(int t1) {
		age = t1;
	}
	// 키 바꾸기
	public void m1(double t1) {
		height = t1;
	}
	// rank 바꾸기
	public void m1(char t1) {
		rank = t1;
	}
	
	
	
}
