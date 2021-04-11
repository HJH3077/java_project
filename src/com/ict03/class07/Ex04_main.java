package com.ict03.class07;

import com.ict03.class07.Ex04.Inner03;

public class Ex04_main {
	public static void main(String[] args) {
		// static 내부클래스는 그냥 호출해서 객체 생성 가능,
		// static은 그냥 호출 가능
		System.out.println(Inner03.i3);	// static 붙어있으니 그냥 사용 가능
		System.out.println(Inner03.i4); // static 붙어있으니 그냥 사용 가능
		
		// static 내부클래스 중에 static이 없는 멤버는 객체 생성 후 사용 가능(외부클래스 사용 X)
		Inner03 t1 = new Inner03();
		System.out.println(t1.name);
		System.out.println(t1.i2);
		
		t1.play();
		
		// 여기 까지 3가지의 내부클래스는 거의 쓸 일이 없음. 독립적인 자바 객체 지향에 안맞음 (너무 종속적임)
		// *******  Anonymous가 매우 중요!!!
		
	}
}
