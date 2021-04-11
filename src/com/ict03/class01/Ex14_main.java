package com.ict03.class01;

public class Ex14_main {
	public static void main(String[] args) {
		Ex14 t1 = new Ex14(); // 여기서 기본생성자가 실행됨.
		System.out.println(t1.su1); // 11
		System.out.println(t1.su2); // 11
		System.out.println(Ex14.su2); // static은 이렇게 쓰는게 맞음
		System.out.println();
		
		Ex14 t2 = new Ex14();
		System.out.println(t2.su1); // 11
		System.out.println(t2.su2); // 12 
								// static은 공용이어서 t1이나 t2를 생성할 때 Ex14의 설계도에서 su1은 초기값으로 설계함.
								// su2는 static Ex14의 su2의 주소가 연결되어있는 구조이다.
								// 그래서 Ex14를 실행할 때마다 주소를 찾아가서 su2를 1증가시키고 그 값이
								// static Ex14의 su2로 남는다. 그래서 su1과 달리 값이 계속 남게됨.
		t2.prn();
		System.out.println(Ex14.su2);  // 13
		System.out.println();
		
		
		
	 
		
		
		
		
	}	
}
