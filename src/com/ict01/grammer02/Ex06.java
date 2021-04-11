package com.ict01.grammer02;

class Ex06{
	public static void main(String[] args){
	// 산술연산자 : +, - ,*, /, %(나머지)
	// 작은자료형과 큰자료형을 연산하면 큰자료형으로 변경됨.
	// int + int = int, long + long = long, float + float = float / 예외) byte + byte = int, byte + short = int, short + short = int	
	// int + long = long, float + double = double, int + double = double
	// byte < short < char < int < long < float < double 인 것을 기반.
	
	// 원단위 절삭
	int k1 = 21755; // => 21750
	int s1 = k1 / 10; // 정수/정수 = 정수, 21755/10 = 2175
	int s2 = s1 * 10; // 21750

	int s3 = (k1 / 10) * 10; // 위와 같음, 21750
	int s4 = (21755 / 10) * 10;
	System.out.println("s3 = " + s3);
	System.out.println("s4 = " + s4);

	// 소숫점 첫째자리까지 구하기
	double k2 = 24.6843; // => 24.6
	int s5 = (int)(k2 * 10); // 실수*정수 = 실수, 246.843 이후 형변환으로 246
	double s6 = s5 / 10.0; // 24.6

	double s7 = (int)(k2*10) / 10.0; // 24.6
	double s8 = (int)(24.6843*10) / 10.0;
	System.out.println("s7 = " + s7);
	System.out.println("s8 = " + s8);
	 
	// % : 나눈 나머지 , '/'의 결과가 int이면 몫
	int su1 = 7;
	int su2 = 3;
	int res1 = 7 / 3; // 2.3333333... 인데 int이므로 2 즉, 몫이 나옴.
	int res2 = 7 % 3; // 1
	
	// 어떤 수를 2로 나눈 나머지가 1이면 홀수, 0이면 짝수
	// 어떤 수를 k로 나눈 나머지가 0이면 k의 배수

	}
}