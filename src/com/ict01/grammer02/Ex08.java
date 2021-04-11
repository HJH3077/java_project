package com.ict01.grammer02;

class Ex08{
	public static void main(String[] args){
	// 문제2 : 아메리카노가 2500원이다. 친구와 둘이서 10000원을 내고 주문했다. 잔돈은 얼마인가? (부가세 10%가 추가된다.)
	
	/* 
	int ame = 2500;
	int human = 2;
	int money = (int)(10000 - ((ame * human) * 1.1));
	System.out.println("잔돈은 : " + money + "원");
	 */

	// 입력정보
	String coff = "아메리카노"; // 커피이름
	int dan = 2500; // 커피 단가 
	int su = 2; // 사람 수
	int input = 10000; // 넣은 돈
	
	int total = dan * su; // 물건금액
	int vat = (int)(total * 0.1); // 부가세
	int output = input - (total + vat);
	System.out.println("잔돈은 : " + output + "원");

	// 또는 int total = (int)((dan * su) * 1.1);
	//	int output = input - total;
	}
}