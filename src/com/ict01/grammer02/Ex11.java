package com.ict01.grammer02;

class Ex11{
	public static void main(String[] args){
	// 비교 연산자 : 변수나 상수의 값을 비교하는 연산자로 결과가 항상 (true or false) 이다.
	// 		 boolean 형은 조건식에 사용된다.  * 자료형이 String인 경우에는 사용하지 말기!(문자를 비교가능? x)

	int s1 = 90;
	int s2 = 80;
	boolean res = s1 >= s2;
	System.out.println("결과 : " + res);
	
	char s3 = 'c';
	char s4 = 'a';
	res = s3 > s4; // char는 비교가 가능 왜냐? char는 숫자로 저장되니까
	System.out.println("결과 : " + res);

	// char 와 int 비교
	res = 'a' >= 97;
	System.out.println("결과 : " + res);

	// int 와 double 비교 : 비교가 가능. 저장하는게 아니니까
	res = 97 == 97.0;
	System.out.println("결과 : " + res);

	res = 97 == 97.0000001;
	System.out.println("결과 : " + res);

	String str1 = "대한민국";
	String str2 = "대한민국";
	/*
	res = str1 > str2;
	System.out.println("결과 : " + res); // 부등호는 오류가 발생함! 글자를 비교하는건 불가능 하니까
	res = str1 >= str2;
	System.out.println("결과 : " + res);
	*/ 
	
	res = str1 == str2; // 결과는 나오지만 쓰지말 것! 이유: String의 값이 같은게 아니라 주소값이 같은 것임
			    // class의 비교 기준으로는 답이 틀림. 그렇기 때문에 String에는 사용 x 
			    // String에는 비교하는 메소드가 따로 존재함. 나중에 배움

	System.out.println("결과 : " + res);

	}
}