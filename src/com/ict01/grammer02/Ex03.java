package com.ict01.grammer02;

class Ex03{
	public static void main(String[] args){
	// 정수형 : 소숫점이 없는 숫자 (정수형보다 무조건 실수형이 큼)
	// 정수형 크기 : byte < short < int < long , 정수형의 기본은 int 이다.
	// 주의사항 - byte, short 를 연산하면 결과는 무조건 int 이상이다. (32bit 처리를 하기 때문에)
	 
	// byte : -128 ~ 127 사이의 숫자만 사용가능
 	byte s1 = -127; 
	System.out.println(s1);

	s1 = -128;
	System.out.println(s1);

	//s1 = -129; --> 범위를 넘어서 오류남

	// short : -32768 ~ 32767 범위 안에 존재하는 정수를 저장
	//short s2 = 32760 + 100; --> 오류발생 : 오른쪽의 결과값이 저장되기 때문에 범위를 넘어감. 즉, 오른쪽이 우선순위가 높음
	
	// int 와 long은 범위가 넓으므로 외워서 쓸 필요가 없음. 
	// 앞으로 일반적인 정수는 무조건 int! , 그리고 아주 큰 정수를 쓸 때 long을 사용한다.
	// long에는 숫자 뒤에 L 또는 l을 붙인다.(생략가능!) 
	int s3 = 117;

	long s4 = 117L;
	long s5 = 117l;
	long s6 = 117;   
	
	// 실수 : 소숫점이 존재하는 수 (무조건 정수보다는 크다.)
	// 실수의 크기 : char(단, int보다 작은것이지 byte보다는 큼 / short와는 크기가같음) < 정수(int < long) < float < double
	// 실수의 기본형은 double 이다. 
	//float는 숫자 뒤에 반드시 F 또는 f를 붙인다.(생략안됨!)
	//float s7 = 3.14;  --> 오류발생 : 기본형은 double인데 f를 안붙여서 float로 인식하여 자료형이 안맞음.
	float s7 = 3.14f;
	System.out.println(s7);

	double s8 = 3.14;
	System.out.println(s8);

	// 자동형변환 : 자료형이 자동으로 변경되는 것
	double s9 = 117; // doble과 int이므로 자료형 차이로 오류가 원래는 나야하지만 자동형변환에 의해 오류가 안남.	
	System.out.println(s9);
	}
}