package com.ict03.class03;

public class Ex01 /* extends Object 가 숨어있음 */{
	public static void main(String[] args) {
		//	상속관계 : 클래스와 클래스와의 관계("is a 관계" 라고함.)
		//			   자식클래스가 부모클래스의 멤버필드, 멤버메소드를 객체 생성없이
		//			   즉, 아무 제약없이 사용할 수 있도록 하는 관계
		//	형식 : 자식클래스 extends 부모클래스
		//	특징 : 자바에서는 다중 상속을 할 수 없다. (단, 인터페이스는 예외) (인터페이스는 클래스가 아니라서 이런말 안하는 경우도있음)
		//		   부모클래스가 하나만 존재한다!
		//		   모든 클래스는 Object라는 클래스를 상속받고 있다. 부모의 부모의 클래스는 결국 Object
		//	부모클래스 : super, 자식클래스 : sub
		
		//	오버라이딩 : 부모클래스의 메소드를 그대로 가져와 
		//				 자식클래스가 마음대로 변경해서 사용하는 것을 의미한다.
		//				 오버라이딩을 하면 부모메소드가 숨겨진다.(은닉화)
		//				 * 오버로딩 : 클래스의 같은 모양의 인자가 다른 여러 메소드를 만드는 것 
		
		//	final 메소드 : 부모클래스가 가진 메소드를 자식클래스가 오버라이딩을 못하게 하는 예약어
		
		//	final 클래스 : 상속금지 (자식클래스를 만들 수 없음)
		//	final 메소드 : 오버라이딩 방지 (메소드내용 변경금지)  
		//	final 변수 : 상수 (데이터 변경금지)	
		
		// 
		
		
		
	}
}
