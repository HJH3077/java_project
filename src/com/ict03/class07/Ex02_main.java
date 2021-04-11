package com.ict03.class07;

public class Ex02_main {
	public static void main(String[] args) {
		// Member 내부클래스는 별도로 객체 생성 못함
		// Inner01 t1 = new Inner01();
		// 그래서 외부클래스를 통해서 내부클래스를 사용한다.
		Ex02 t1 = new Ex02();
		// 외부클래스를 통해서 내부클래스 생성
		// 내부클래스의 주소에는 '$'가 존재한다.
		Ex02.Inner01 t2 = t1.new Inner01();
		System.out.println(t2.name);
		System.out.println(t2.i2); 
		System.out.println(t2.i4); // 내부클래스의 내용
		System.out.println();
		t2.play(); 	// 외부의 age를 가져오는데 성공함
					// 내부의 메소드에서 sound()를 이용하여 외부클래스의 메소드를 호출해서 외부의 자료를 가져옴
		
		
		
		
	}
}
