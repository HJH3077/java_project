package com.ict01.grammer02;

class Ex05{
	public static void main(String[] args){
	// 자료형 : DataType : 자바에서 들어온 정보를 처리할 때 구분하는 형태
	// 1.기본자료형 : 컴파일러에 의해서 해석되는 자료형 - boolean, char, byte, short, int, long, float, double
	// 2.참조자료형 : 클래스를 자료형으로 선언, 메모리에 직접 데이터가 들어가있는게 아닌 다른곳에 있고 주소를 저장 - 예시)String 
	// String(첫글자가 대문자이므로 클래스) : 참조자료형이지만 기본자료형처럼 사용
	
	String str = "Hello Java"; // " "(쌍따옴표) 무조건 해야함. 문자열이므로 / 참조자료형이지만 기본자료형처럼 사용한 경우
	System.out.println(str);

	// String + 연산 : 실제 덧셈 연산을 하는게 아닌 문자연결자 역할을 수행함. 
	//		   String에서 + 연산을 하면 결과는 무조건 String이다. 단, String은 -, * 이런건 없음.

	String k1 = "1000";
	int k2 = 1000;
	System.out.println(k1 + 10);
	System.out.println(k2 + 10);

	int s1 = 20;
	int s2 = 4;
	System.out.println(s1 + s2);
	System.out.println("결과 : " + s1 + s2); // 위와 결과가 다름. 이유 : 왼쪽부터 수행하므로 String을 먼저 수행
	System.out.println("결과 : " + (s1 + s2)); // ( ) 로 우선순위 지정으로 해결함.
	}
}