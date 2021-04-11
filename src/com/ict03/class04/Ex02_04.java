package com.ict03.class04;

// 일반적인 클래스가 추상클래스를 상속하면 반드시 추상클래스의 추상메소드를 오버라이딩해야한다.
// why? 추상메소드는 완성된게 아니므로 오버라이딩해서 완성시켜야 한다!!
// = 구체화를 해야한다.
class Ex02_04 extends Ex01{
	// 무조건 해야하므로 ctrl + space 하면 가장 상단에 있다.
	@Override
	public void sound() { // 부모가 완성하지 않은 메소드를 자식이 완성해야 오류발생 x 
		
		
	}
}

// 오버라이딩을 하지 않는 방법 : 자식클래스를 추상클래스로 만들어 버리면 오류 x
// 물론 이 자식을 상속받는 클래스는 결국 오버라이딩을 하던가 또 추상클래스로 해야함. 
// 부모의 추상메소드를 구체화 하지 않았음
abstract class Ex03 extends Ex01{
	public void song() {
		System.out.println("노래하기");
	}
	
}

// 부모의 추상메소드를 구체화 하지 않았음 + 자기가 또 추상메소드를 추가했음
abstract class Ex04 extends Ex01{
	public void Music() {
		System.out.println("음악");
	}
	public abstract void pop();
	
}