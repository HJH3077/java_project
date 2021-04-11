package com.ict01.grammer03;

import java.util.Scanner;
class Ex08{
	public static void main(String[] args){
	// 숫자를 받아서 홀수, 짝수를 구분하자
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 입력하세요 : ");
	int a = sc.nextInt();	
	String A = (a % 2 == 0)? "짝수" : "홀수";
	System.out.println(a + "는 " + A + "입니다.");


	// 국어, 영어, 수학 점수를 받아서 점수의 평균이 60이상이고, 각각의 점수는 40점 이상일 때 합격, 아니면 불합격
	System.out.print("국어점수 : ");
	int kor = sc.nextInt();

	System.out.print("영어점수 : ");
	int eng = sc.nextInt();
	
	System.out.print("수학점수 : ");
	int math = sc.nextInt();

	double avg = (int)(((kor + eng + math) / 3.0) * 10) / 10.0;
	System.out.println("평균점수는 " + avg + "입니다.");
	String pass = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60)? "합격" : "불합격";
	System.out.println("당신은 " + pass + "입니다.");

	// 시급이 8720인 알바 중 알바시간을 입력 받아서 8시간을 초과하면 초과한 시간만큼 1.5배인 경우 받을 금액은?
	int pay = 8720;
	System.out.print("일한 시간 : ");
	int time = sc.nextInt();

	int money = (time <= 8)? (pay * time) : ((pay * 8) + (int)((time - 8) * pay * 1.5));
	System.out.print("받을 금액 : " + money); 

	


	}
}