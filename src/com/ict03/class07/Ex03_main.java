package com.ict03.class07;

public class Ex03_main {
	public static void main(String[] args) {
		// 별도로 객체 생성 못함
		// Inner02 t1 = new Inner02(); 당연히 안됨. 내부클래스는 객체 생성 불가
		
		// Member 내부클래스처럼 객체 생성하는 방법도 안됨.
		// 메소드 안에있기 때문에 해당 메소드를 실행해야 생성되는 것이기 때문에
		// Ex03 t1 = new Ex03();
		// Ex03.Inner02 t2 = t1.new Inner02();
		
		// 외부클래스 객체 생성
		Ex03 t1 = new Ex03();
		
		// 내부클래스를 가지고 있는 메소드를 실행해야 내부클래스 만들 조건이 된다.
		// 내부클래스의 끝과 내부클래스를 가진 외부 메소드의 끝 사이에서
		// 객체를 생성과 실행을 해야 한다.
		t1.play();
		
		
		
		
	}
}
