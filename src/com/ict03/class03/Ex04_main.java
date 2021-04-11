package com.ict03.class03;

public class Ex04_main {
	public static void main(String[] args) {
	// 자식에 객체 생성하는게 유리함 
	// why? 자식은 부모의 것을 가져다 쓰니까 자식은 자기의 것, 부모의 것 모두 사용
		Ex03 t1 = new Ex03(); // 호출 시 객체 생성 순서가 부모가 먼저 생성되고 자식이 생성됨(Ex02 -> Ex03)
							  // Ex03() 의 생성자에 super() 가 숨어있음 
							  // super() 는 부모의 생성자를 호출하는 명령어
		
		// 부모와 자식이 같이 가지고 있으면 자식의 것을 먼저 사용. 
		// 지역변수 먼저 탐색!, 그래서 자식먼저 찾고 부모한테감
		System.out.println(t1); // ****** 부모와 자식과 t1의 주소가 같음.
		System.out.println(t1.name);
		
		// 자식한테 없는 멤버는 부모의 멤버를 사용
		System.out.println(t1.addr);
		
		// 메소드도 마찬가지
		t1.sound();
		t1.prn();
		System.out.println("=================");
		
		// static은 객체 생성과 상관 x 즉, "Ex03 t1 = new Ex03();" 이런거 안해도됨.
		System.out.println(Ex03.hobby);
		System.out.println(Ex02.car);
		
		// 자식과 부모가 같은 메소드를 가지고 있으면 자식메소드를 실행한다.
		// 부모의 것이 없어짐 (= 은닉화)
		t1.eat(); // super()를 생략하면 부모도 호출하므로 부모도 출력함. 
				  // (단, super의 위치에 따라 수행순서가 정해짐, 맨 위에 있으면 super먼저 수행)
		
		// 요약 1. 부모걸 맘대로 가져다 쓰는게 상속
		//		2. 부모와 자식의 변수가 같으면 자식의 변수를 사용
		//		3. 부모메소드와 자식메소드가 같으면 자식의 메소드를 사용 (오버라이딩)
		
		
	}
}
