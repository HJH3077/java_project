package com.ict01.grammer04;

class Ex04{
	public static void main(String[] args) {
	// while문 : for문과 같은 반복문
	// 형식 1) : 초기식;											형식 2) 초기식;
	//			 while(조건식){												while(true){				
	//			 조건식이 참일때 실행할 문장;								* if(빠져나갈조건) break;(먼저탈출) // 문장실행 전 탈출
	//			 조건식이 참일때 실행할 문장;								조건식이 참일때 실행할 문장;
	//			 증감식;													* if(빠져나갈조건) break;(나중탈출) // 문장실행 후 탈출
	//			 }     * while문의 끝을 만나면 조건식으로 이동.				증감식;
	//																		}
	
	// 0 ~ 15까지 출력하자
	int i = 0;
	while (i < 16) // for(int i = 0; i < 16; i++)와 같음
	{			   // 차이점은 for문은 선언한 i를 for문에서만 쓸수있지만 while은 밖에 초기값을 선언했으므로 나중에도 사용가능
		System.out.println(i);
		i++;
	}
	System.out.println();
	
	i = 0;
	while (true){
		if(i >= 16) break;
		System.out.println(i);
		i++;
	}
	System.out.println();
	
	// 0 ~ 10까지 짝수만 출력
	i = 0;
	while (i <= 10){
		if(i % 2 == 0){
		System.out.print(i + " ");
		}
		i++;	
	}
	System.out.println();

	/*
	i = 0;
	while (true)
	{
		if(i >= 11) break;
		if(i % 2 == 0)
			System.out.print(i + " ");
		i++;
	}
	System.out.println();
	*/

	// 0 ~ 10까지 홀수만 출력 
	i = 0;
	while (i <= 10){
		if(i % 2 == 1){
		System.out.print(i + " ");
		}
		i++;	
	}
	System.out.println();

	// 0 ~ 50까지 7의 배수만 출력
	i = 0;
	while (i <= 50){
		if(i % 7 == 0)
			if(i != 0){
			System.out.print(i + " ");
		}
		i++;	
	}
	System.out.println();
	System.out.println();

	// 5단 출력
	i = 1;
	System.out.println("5단");
	while (i <= 9){
		
		System.out.println("5 * " + i + " = " + (5 * i));
		i++;	
	}
	System.out.println();


	// 0 0 0 0 4줄 출력
	i = 0;
	while (i < 4)
	{
		for (int j = 0; j < 4; j++)
		{
			System.out.print("0 ");
		}
		System.out.println();
		i++;
		
	}
	System.out.println();

	/*
	i = 1;
	while (i < 17)
	{
		System.out.print("0 ");
		if (i%4 == 0)
		{
			System.out.println();
		}
		i++;
	}
	System.out.println();
	*/

	// 0 ~ 10까지 누적합 구하기 (0 + 1 + 2 + 3 ... + 10)
	i = 0;
	int sum = 0;
	while (i < 11)
	{
		sum = sum + i;
		i++;
	}
	System.out.println("합 : " + sum);

	// 홀수와 짝수의 누적합을 각각 구하시오
	i = 0;
	int odd = 0;
	int even = 0;
	while (i < 11)
	{
		if(i % 2 == 1) {
			odd = odd + i;
			}
		else {
			even = even + i;
			}
		i++;
	}
	System.out.println("odd합 : " + odd);
	System.out.println("even합 : " + even);

	}
}
