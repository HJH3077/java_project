package com.ict01.grammer03;

class Ex02{
	public static void main(String[] args){
	// || (OR, 논리합)
	// - 주어진 조건 중 하나라도 true 이면 결과는 true;
	// - 조건 중 true 를 만나면 이후 연산은 실행 x
	int s1 = 10;
	int s2 = 7;
		
	boolean result = false || false;
	System.out.println("결과 : " + result);

	result = (s1 >= 15) || (s2 <= 5);
	System.out.println("결과 : " + result); // false
		
	result = true || false;
	System.out.println("결과 : " + result); // true
	
	result = (s1 >= 15) || (s2 >= 5);
	System.out.println("결과 : " + result); // true

	// OR 는 true 를 만나면 이후 연산은 하지 않는다.
	result = ((s1 = s1 + 2) < 20) || (s1 == (s2 = s2 + 5));
	System.out.println("결과 : " + result);	
	System.out.println("s1 : " + s1);
	System.out.println("s2 : " + s2);

	
	// ! (NOT, 논리부정)
	// - 주어진 논리값을 반대로 만듦. (true면 false, false면 true)
	result = true;
	System.out.println(!result);
	System.out.println(!!result);
	System.out.println(!!!result);

	}
}