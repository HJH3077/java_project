package com.ict01.grammer02;

class Ex09{
	public static void main(String[] args){
	// 문제3 : 2시간 40분 23초를 초단위로 변경해라 
	int hour1 = 2;
	int min1 = 40;
	int sec1 = 23;
	
	int sectot1 = (hour1 * 3600) + (min1 * 60) + sec1;
	System.out.println("2시간 40분 23초는 " + sectot1 + "초 입니다.");
	

	// 문제4 : 9630초는 몇 시간 몇 분 몇 초인가?
	/*
	int time = 9630;
	int hour2 = time / 3600;
	int min2 = (time - (hour2 * 3600)) / 60;
	int sectot2 = (time - (hour2 * 3600) - (min2 * 60));
	System.out.println(hour2 + "시" + min2 + "분" + sectot2 + "초");
	*/

	int time = 9630;
	int h1 = 0; // 시	
	int m1 = 0; // 분
	int s1 = 0; // 초
	int res = 0; // 나머지
	
	// 시간구하기
	h1 = time / 3600;
	res = time % 3600;
	m1 = res / 60;
	s1 = res % 60; // 분을 구한 나머지는 초

	System.out.println(time + "초는 " + h1 + ":" + m1 + ":" + s1);


	}
}
