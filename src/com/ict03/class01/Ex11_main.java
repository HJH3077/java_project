package com.ict03.class01;

public class Ex11_main {
	public static void main(String[] args) {
		
		// Ex11의 기본생성자가 아닌 다른 생성자가 있어서 오류남.
		// 그러므로 다른 생성자로 객체 생성을 해야함.
		// Ex11() -> Ex11(String name, int age)
		
		// Ex11 test1 = new Ex11(); // 기본생성자의 명령어가 실행됨.
		Ex11 test1 = new Ex11(17,"임꺽정");
		System.out.println("이름 : " + test1.getName());
		System.out.println("나이 : " + test1.getAge());
		System.out.println("성별 : " + test1.isGender());
		System.out.println();
		
		/*
		Ex11 test2 = new Ex11(); // 위와 똑같은 값이 나옴 즉, 생성자에서 초기값을 지정할 수 있음.
		System.out.println("이름 : " + test2.getName());
		System.out.println("나이 : " + test2.getAge());
		System.out.println("성별 : " + test2.isGender());
		System.out.println();
		
		// setter를 이용해서 멤버필드의 값을 변경할 수 있다.
		test2.setName("일지매");
		System.out.println("이름 : " + test2.getName()); // 나머지는 안바뀌고 이름만 바뀜
		System.out.println("나이 : " + test2.getAge());
		System.out.println("성별 : " + test2.isGender());
		*/
		
		
		
		
		
	}
}
