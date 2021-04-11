package com.ict03.class03;

public class Ex10_Cat extends Ex09_Animal {
	String name = "다홍이";
	int age = 1;
	
	public void hobby() {
		System.out.println("쥐잡이");
	}
	
	@Override
	public void sound() { // 부모의 메소드인데 내가 가져다 변형시켜서 사용 = 오버라이딩
		System.out.println("야옹~ 야옹~");
	}
	
	
}
