package com.ict01.grammer03;

import java.util.Scanner;
class Ex10{
	public static void main(String[] args){
	// if ~ else ~ : 조건식이 참일때와 거짓일때 각각 나눠서 처리한다. ( == 삼항 연산자와 같다.)
	// 형식 : if(조건식){
	//		조건식이 참일 때 실행할 문장;
	//		} else {
	//		조건식이 거짓일 때 실행할 문장;
	//		}	단, 실행할 문장이 한 줄이면 { }를 생략 가능!

	// int k1이 60이상이면 합격 아니면 불합격
	Scanner sc = new Scanner(System.in);
	System.out.print("점수 : ");
	int score = sc.nextInt();
	String pass = ""; 

	if(score >= 60) {
		pass = "합격";
	} else {
		pass = "불합격";
	}
	
	System.out.println("당신은 " + pass + "입니다.");		
	
	
	// int k2가 홀수인지 짝수인지 판별하자
	System.out.print("숫자를 입력하세요 : ");
	int num = sc.nextInt();
	String number = "";

	if(num % 2 == 0) {
		number = "짝수";
	} else {
		number = "홀수";
	}

	System.out.println(number + "입니다.");	
	

	// k4가 1또는 3이면 남자 아니면 여자
	System.out.print("숫자를 입력하세요 : ");
	int k4 = sc.nextInt();
	String gender = "";
	
	if(k4 == 1 || k4 == 3){
		gender = "남자";
	} else {
		gender = "여자";
	}
	
	System.out.println("성별은 " + gender + "입니다.");


	// 근무시간이  8시간까지는 시간당 8720이고 8시간 초과시 1.5배 현재 10시간 받을 금액은? 
	System.out.print("시간을 입력하세요 : ");
	int time = sc.nextInt();
	int dan = 8720;
	int pay = 0;
	
	if (time <= 8){
		pay = time * dan;
	} else {
		pay = (dan * 8) + (int)((time - 8) * 1.5 * dan);
	}

	System.out.print("받을 금액 :" + pay + "원");


	}
}