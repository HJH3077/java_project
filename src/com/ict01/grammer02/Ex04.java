package com.ict01.grammer02;

class Ex04{
	public static void main(String[] args){
	// 숫자들의 크기에 따른 저장 원리
	// (byte < short <= )  char < int < long < float < double
	//                    (문자) (정수형 숫자) (실수형 숫자)
	// 형변환 : 자동형변환(프로모션)과 강제형변환(디모션)

	// 자동형변환 : 작은 자료형이 큰 자료형에 저장될 때 자동으로 형변환이 일어남.
	// char를 int에 저장할 수 있다.
	char c1 = 'a';
	System.out.println(c1);
	
	int s1 = 'a'; // int로 자료형이 바뀌었기 때문에 a가 숫자로 바뀐 97이 나온다.
	System.out.println(s1); 

	int s2 = c1; // c1이 변수이고 데이터 'a'를 호출하므로 오류x
	System.out.println(s2);
	
	// int를 long에 저장할 수 있다.
	long s3 = 117L; 
	System.out.println(s3);
	long s4 = 117; // 이게 가능한 이유가 형변환 때문이다.

	// long이 flaot나 double에 저장할 수 있다.
	float s5 = s3;
	System.out.println(s5);	

	// 강제형변환 : 큰 자료형을 작은 자료형으로 저장할 때 오류가 발생한다. 이때 강제로 형을 변환해서 오류를 없앤다.
	// 		그러나, 데이터가 손실될 가능성이 있다.
	// 강제형변환 방법 : = 를 기준으로 무조건 왼쪽자료형에 맞춘다. --> = (왼쪽 자료형)(대상)

	byte k1 = (byte)(128); // 실행은 되지만 값이 -128이됨 = 데이터가 오류남, 129넣으면 -127이됨. 
			       // -128 ~ 127 이므로 127이 넘으면 한 바퀴 돌아서 다시 -128부터 나오게 되는 것임.
	System.out.println(k1);

	// char를 int를 넣는건 가능했으니 int를 char에 넣어보기
	char k2 = 97; // char는 0 ~ 65535까지 가능해서 들어가짐
	System.out.println(k2);

	int k3 = 97;
	char k4 = (char)(k3); // int를 char에 넣으므로 오류가 발생함. 강제형변환으로 실행했지만 97이 범위의 숫자이므로 손실은 x
	System.out.println(k4);

	// float나 double을 int로 저장
	int k5 = (int)(87.6);
	System.out.println(k5);

	// 응용문제 : 소숫점 첫째자리까지 구하자.
	//int k6 = 87.64; // 곱하기 10후 int하면 876이되고 나누기 10.0(정수와 실수를 계산하면 실수가됨. 소수점을 위해 10이 아닌 10.0으로 계산.)을 하면 87.6이됨.
			// 이렇게 소숫점 자리구할 때 강제형변환 int를 사용하는 것임!
			// * 정수 정수 계산하면 정수 , 정수 실수 계산하면 실수가 됨!!!
	}
}