package com.ict01.grammer04;

import java.util.Scanner;
class Ex06
{
	public static void main(String[] args) 
	{
	// do ~ while문 : while문과 같은 반복문이지만, 먼저 실행 후 나중에 비교한다.
	// 형식 : 초기식;
	//		  do{
	//			실행할 문장;
	//			증감식;
	//		  } while(조건식);

	// 0 ~ 10까지 출력
	int i = 0;
	do
	{
		System.out.print(i + " ");
		i++;
	}
	while (i < 11);
	System.out.println();

	// 반복횟수를 받아서 처리하자
	Scanner sc = new Scanner(System.in);
	System.out.print("반복횟수 : ");
	int a = sc.nextInt();
	int j = 0;
	do
	{
		System.out.println("Hello Java");
		j++;
	}
	while (j < a);
	

	// 반복횟수와 판별 숫자를 받아서 홀수, 짝수를 출력
	System.out.print("반복횟수를 입력하세요 : ");
	int su = sc.nextInt();
	int k = 0;
	String msg = "";
	do
	{
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num % 2 == 0)
			msg = "짝수";
		else
			msg = "홀수";
		System.out.println("입력한 수는 " + msg + "입니다.");
		k++;
	}
	while (k < su);	
	

	
		


	}
}
