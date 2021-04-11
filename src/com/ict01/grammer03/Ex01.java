package com.ict01.grammer03;

class Ex01{
	public static void main(String[] args){
	// 논리연산자 : &&(AND, 논리곱, ||(OR, 논리합), !(NOT, 논리부정)
	// 사용되는 자원 : boolean형, 비교연산(결과적으로 true,false가 나오므로), 논리연산
	// 결과는 boolean형 ==> 조건식에 사용된다.

	// && (AND, 논리곱, 교집합)
	// - 주어진 조건이 모두 true 일때만 결과가 true 
	// - 주어진 조건들 중에 false를 만나는 순간 결과가 false가됨. 그리고 이후에 있는 연산은 실행 x

	int s1 = 10;
	int s2 = 7;
	boolean result = true && true;
	System.out.println(result);	

	result = (s1 >= 7) && (s2 >= 5);
	System.out.println(result);

	result = false && true;
	System.out.println(result);
	
	result = (s1 <= 7) && (s2 >= 5);
	System.out.println(result);
	
	// false를 만나면 이후 연산은 하지 않는다.
	result = ((s1 = s1 + 2) > s2) && (s1 == (s2 = s2 + 5));
	System.out.println("결과 : " + result);
	System.out.println("s1 : " + s1); // 12
	System.out.println("s2 : " + s2); // 12

	result = ((s1 = s1 + 2) < s2) && (s1 == (s2 = s2 + 5));
	System.out.println("결과 : " + result);
	System.out.println("s1 : " + s1); // 14
	System.out.println("s2 : " + s2); // 12 (앞이 false여서 연산이 수행되지 않았음)
	
	// && 는 숫자의 겨우 범위를 지정할 수 있다.
	// a >= 10 && a <= 20; ==> a는 10 ~ 20 까지의 범위를 의미함.
	s1 = 24;
	result = (s1 >= 20) && (s1 <= 30);
	System.out.println("결과 : " + result);

	// char c1이 소문자 인가?
	char c1 = 'D'; // D = 68
	//result = (c1 >= 97) && (c1 <= 122); // 97 ~ 122사이에 있으면 소문자임(아스키코드기반)
	result = (c1 >= 'a') && (c1 <= 'z'); // 이런 방법으로 해도 문제가 없음.
	System.out.println("결과 : " + result);

	}
}