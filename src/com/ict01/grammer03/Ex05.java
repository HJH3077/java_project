package com.ict01.grammer03;

class Ex05{
	public static void main(String[] args){

	// int k1가 60이상이면 합격 아니면 불합격
	int k1 = 70;
	String res = (k1 >= 60)? "합격" : "불합격";
	System.out.println("결과 : " + res);	


	// int k2가 홀수인지 짝수인지 판별하자	
	int k2 = 87;
	String res1 = (k2 % 2 == 0)? "짝수" : "홀수";
	System.out.println("결과 : " + res1);	

	// char k3가 대문자인지 대문자가 아닌지 판별하자
	char k3 = 'V';
	String res2 = (k3 >= 'A' && k3 <= 'Z')? "대문자" : "대문자가 아님";
	System.out.println("결과 : " + res2);

	// 근무시간이 8시간까지는 시간당 8720이고 8시간을 초과한 시간만큼은 1.5배이다. 
	// 현재 근무시간이 10시간이면 얼마를 받아야 하는가?
	int now = 15;
	int money = 8720;
	double res3 = (now <= 8 )? (money * now) : ((money * 8) + ((now - 8) * money * 1.5));
	System.out.println("결과 : " + (int)(res3) + "원"); 
	

	}
}