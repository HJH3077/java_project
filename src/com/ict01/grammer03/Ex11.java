package com.ict01.grammer03;

import java.util.Scanner;
class Ex11{
	public static void main(String[] args){
	// 다중 if문 : 조건식이 거짓일때 다시 조건식을 사용한다.
	// 형식 : if(조건식1){
	//		조건식1이 참일때 실행;
	//	} else if(조건식2) {
	//		조건식1은 거짓이면서 조건식2가 참일때 실행;
	//	} else if(조건식3) {
	//		조건식1,2는 거짓이면서 조건식3은 참일때 실행;
	//	} else {
	//		조건식1,2,3 모두 거짓일때 즉, 나머지 경우;
	//	}

	// k1의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지 F
	Scanner sc = new Scanner(System.in);
	System.out.print("점수를 입력하세요 : ");
	int k1 = sc.nextInt();
	String score = "";

	if(k1 >= 90)
		score = "A";
	else if(k1 >= 80)
		score = "B";
	else if(k1 >= 70)	
		score = "C";
	else
		score = "F";

	System.out.println("학점은 " + score);

	// k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지, 판별
	char k2 = 'd';
	String str = "";
	
	if(k2 >= 'A' && k2 <= 'Z')
		str = "대문자";
	else if(k2 >= 'a' && k2 <= 'z')
		str = "소문자";
	else if(k2 >= 0 && k2 <= 9)
		str = "숫자";
	else
		str = "기타문자";

	System.out.println(str + "입니다.");

	
	// k3가 A,a 이면 아프리카 B,b이면 브라질 C,c이면 캐나다 나머지 한국
	char k3 = 'A';
	String world = "";

	if(k3 == 'A' || k3 == 'a')
		world = "아프리카";
	else if(k3 == 'B' || k3 == 'b')
		world = "브라질";
	else if(k3 == 'C' || k3 == 'c')
		world = "캐나다";
	else
		world = "한국";

	System.out.println("나라는 : " + world);




	// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000, 4이면 과일쥬스 3500이다.
	// 친구와 2잔을 10000내고 먹었다. 잔돈은 얼마인가? (단, 부가세 10% 포함.)
	System.out.print("메뉴를 선택하세요 : ");
	int menu = sc.nextInt();
	System.out.print("몇 명이신가요? : ");
	int su = sc.nextInt();
	System.out.print("결제금액 : ");
	int pay = sc.nextInt();
	
	int moka = 3500;
	int latte = 4000;
	int ame = 3000;
	int juice = 3500;
	int money = 0;

	if(menu == 1)
		money += moka;
	else if(menu == 2)
		money += latte;
	else if(menu == 3)
		money += ame;
	else if(menu == 4)
		money += juice;

	money = pay - (int)(money * 1.1 * su);
	System.out.println("잔돈 : " + money); 	
	
	}
}