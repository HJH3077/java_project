package com.ict01.grammer04;

import java.util.Scanner;
class Ex09 
{
	public static void main(String[] args) 
	{
	// 1 ~ 10까지 짝수만 출력 (continue 사용)
	for (int i = 1; i < 11; i++)
	{
		if(i % 2 == 1) continue;
		System.out.print(i + " ");
	}
	System.out.println();




	// 무한루프에서 숫자를 받아서 짝수, 홀수 판별	
	Scanner sc = new Scanner(System.in);
	while(true){ // 무한루프면 for보단 그냥 while을 사용할 것
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();
		String msg = "";
		if(num % 2 == 0)
			msg = "짝수";
		else
			msg = "홀수";
		System.out.println(num + "(은/는) " + msg + " 입니다");
		System.out.print("계속할까요? (1.yes, 2.no) >>> ");
		int num2 = sc.nextInt();
		if(num2 == 2) break; // 2이외의 다른 숫자를 입력하면 1이 아니어도 계속 진행을함. 처리가 필요함.

	
	}








	}
}
