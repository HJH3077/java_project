package com.ict03.class05;

public interface Ex01 {
	// 인터페이스 : 서비스를 제공하는 목록과 같은 것
	// 				상수와 추상메소드들로 이루어져 있다.
	//				생성자가 없다.(= 객체 생성 불가) => 실제로 사용은 불가 => 다중상속 가능
	//				실제 사용하기 위해서는 인터페이스를 상속받은 클래스가 있고 상속븓은 클래스를 사용하는 것!
	//		* '인터페이스'가 같다라는 말은 대체(호환)이 가능하다라는 의미이다. 예) usb 어디에나 꽂는 곳이 같음
	
	// 인터페이스는 상수와 추상메소드만 가지고 있다.
	final int su = 10;
	static final int su2 = 10;
	int su3 = 30;
	static int su4 = 40;
	// 위의 멤버 필드들은 모두 static final임. 인터페이스는 상수만 쓸 수 있다!
	// 즉, 인터페이스를 선언한 순간 안에 들어오는 멤버필드는 모두 static final이다.
	
	// public void play() {}; body가 있는 순간 바로 오류 = 추상메소드가 아니기 때문에	
	// 일반적인 추상메소드 형태
	public abstract void like(); 
	// 인터페이스 안에서는 abstract 예약어 안써도됨
	public void sound(); 
	
	
	
	
	
}
