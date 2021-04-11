package com.ict03.class01;

public class Ex04 {
	
	public int add() { 
		int s1 = 10 + 1;
		return s1;
	}
		
	public int add2(int k) { // 외부에서 정보를 받는데 이 메소드를 시키는 곳에서 정보를 받음
							 // 즉, 호출하는 곳에서 정보를 받아서 계산함.
		int s1 = k + 10;
		return s1;
	}
	
	public int add3(int k1, int k2) {
		int s1 = k1 + k2;
		return s1;
	}
	
	public int add4(int k1, int k2, int k3) {
		int s1 = k1 + k2 + k3;
		return s1;
	}
	
	
	
	
}
