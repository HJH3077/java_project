package com.ict03.class01;

public class Ex15 {
	int s1 = 100;
	// 초기화 전 데이터는 초기화를 만나면 없어진다.
	static int s2 = 200;
	
	// static 초기화
	static { 
		s2 = 2000;
		s3 = 3000; // 인스턴스에서 s3과 s4는 선언이 아래에 되어있어서 오류가 발생해야함. 
		s4 = 4000; // 하지만 static은 데이터 입력 이후 선언해도 오류 발생 안함.
		// s5 = 5000; // 나중에라도 선언 안하면 오류
	}
	public Ex15() {	}
	
	// 초기화 이후 선언
	static int s3 = 300;
	static int s4; 
	
	public static void main(String[] args) {
		// main 메소드도 static이므로 전역변수가 인스턴스이면 사용불가!
		Ex15 t1 = new Ex15();
		System.out.println(t1.s1);
		// System.out.println(s1); // 인스턴스라 오류
		System.out.println(s2); // 2000  초기화 때문에 기존의 값이 무시됨.
		System.out.println(s3); // 300 ,초기화 이후 선언으로 초기화 값이 바뀜
		System.out.println(s4); // 4000
	}
	
}
