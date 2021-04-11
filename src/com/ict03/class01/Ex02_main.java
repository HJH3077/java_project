package com.ict03.class01;

public class Ex02_main {
	public static void main(String[] args) {
		// static은 객체 생성과 상관없이 미리 만들어진다.
		// 호출은 클래스이름.메소드, 클래스이름.변수 
		/*  
		System.out.println(test.k1); test생성 전에 쓰면 당연히 오류
		System.out.println(test.k2);
		System.out.println(test.K3);
		System.out.println(test.K4);
		*/
		 
		// System.out.println(Ex02.k1); // 인스턴스
		System.out.println(Ex02.k2); // static이므로 객체 생성전에 이미 만들어져있음. static그림(객체)이 이미 그려져있음
									 // test로 객체를 만들면 static은 원래 만들어진 static의 주소를 가져오는 것임. 인스턴스는 만들고
		// System.out.println(Ex02.K3); // 인스턴스
		System.out.println(Ex02.K4); 
		
		// 반환형에 따라서 받는 방법이 달라진다.
		// void는 정보가 넘어오지 않는다. 
		// Ex. 으로 확인 시 S써있는게 static, F가 final
		Ex02.prn02(); // prn02 에 있는 내용들이 실행됨.
		
		// void가 아니면 반드시 반환형에 맞춰서 저장하자.
		double su1 = Ex02.prn04(); // prn04에 있는 내용들이 실행되고 반환한 값도 su1에 저장됨.
		System.out.println(su1);
		
		System.out.println("============ 객체 생성 전후 ============");
		
		// *********** 인스턴스는 new로 객체가 만들어져야 가져다 쓸 수 있는 것 ***************
		// 내가 만든 Ex02 class를 가져다 쓸 예정
		// 1. Ex02 클래스를 사용하기 위해서 클래스를 객체로 만들자
		// 방법 : 클래스 참조변수 = new 생성자; .
		// Ex02에 생성자를 만들지 않아서 기본생성자로 객체 생성한다. (기본 생성자란 인수( = 매개변수)가 없는 생성자) 
		Ex02 test = new Ex02(); // 이걸 보면 그림의 형태가 떠올라야함 공부할 것
		
		System.out.println(test); // 객체의 주소가 나옴
		System.out.println(test.k1); // 객체에 존재하는 k1
		System.out.println(test.k2);
		System.out.println(test.K3);
		System.out.println(test.K4);
		System.out.println();
		
		// 메소드 실행
		test.prn01();
		// test.prn02(); 
		Ex02.prn02(); // 위와 같은데 static은 이렇게 쓰는게 나음.
		System.out.println(test.k1);
		System.out.println(test.k2);
		System.out.println();
		
		int su2 = test.prn03();
		System.out.println(su2);
		double su3 = test.prn04();
		System.out.println(su3);
		double su4 = Ex02.prn04(); // 위와 같은데 static은 이렇게 쓰는게 맞다고 본다고 하셨음
		System.out.println(su4);
	}

}
