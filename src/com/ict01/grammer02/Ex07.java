package com.ict01.grammer02;

class Ex07{
	public static void main(String[] args){
	// 문제1 : 이름이 홍길동인 사람의 국어 : 90, 영어 : 80, 수학 : 90 이다. 
	// 	  총점과 평균을 구해서 이름, 총점, 평균을 출력하자. (단, 평균은 소숫점 첫째자리까지 구한다.)
	String name = "홍길동";
	int ko = 90;
	int eg = 80;
	int ma = 90;
	int tot = ko + eg + ma;
	double totav =  (int)((tot / 3.0) * 10) / 10.0;	

	System.out.println("이름 : " + name);
	System.out.println("총점 : " + tot);
	System.out.println("평균 : " + totav);

	}
}