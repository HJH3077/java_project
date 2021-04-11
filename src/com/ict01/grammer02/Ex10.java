package com.ict01.grammer02;

class Ex10{
	public static void main(String[] args){
	// 증감 연산자 : 1만큼 증가하거나 감소시키는 연산자이다.
	//		 char, 정수, 실수 모두 사용 가능
	// ++ 변수 : 먼저 현재 변수값에 1을 증가시키고 나머지 연산을 한다.
	// 변수 ++ : 현재 변수값을 가지고 먼저 연산한 후 나중에 1을 증가시킨다.

	int s1 = 10;
	int s2 = 10;

	System.out.println(++ s1 + 2); // s1을 1증가시키고 +2한 값을 출력
	System.out.println(s2++ + 2); // s2 + 2의 값을 출력하고 s2를 1증가
	System.out.println(); 
	System.out.println("s1 = " + s1); // s1이 1증가했으므로 11
	System.out.println("s2 = " + s2); // s2가 1증가했으므로 11

	// * ++을 붙이든 떨어트리든 별로 차이없음
	}
}