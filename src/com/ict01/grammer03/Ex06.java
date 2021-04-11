package com.ict01.grammer03;

class Ex06{
	public static void main(String[] args){
	// 삼항연산자의 참, 거짓 결과에 또 다른 삼항연산자가 들어가는게 가능하다. 즉, 중첩이 가능!(if문 형태의 기반)
	// 중첩 삼항연산자 : 삼항연산자가 중첩된 것

	//char k1 이 대문자인지, 소문자인지, 기타문자인지 판별하자.
	char k1 = '*';
	String res1 = (k1 >= 'A' && k1 <= 'Z')? "대문자" : (k1 >= 'a' && k1 <= 'z')? "소문자" : "기타문자";
	System.out.println("결과 : " + res1);

	// k2가 90이상이면 A학점, 80이상이면 B학점, 나머지는 F학점
	int k2 = 60;
	String res2 = (k2 >= 90)? "A" : (k2 >= 80)? "B" : "F";
	System.out.println("학점 : " + res2);
	


	// k3이 1 또는 3이면 남자, 2 또는 4이면 여자, 나머지는 외국인
	int k3 = 5;
	String res3 = (k3 == 1 || k3 == 3)? "남자" : (k3 == 2 || k3 == 4)? "여자" : "외국인";
	System.out.println(res3);

	}
}