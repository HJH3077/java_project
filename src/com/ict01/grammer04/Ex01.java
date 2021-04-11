package com.ict01.grammer04;

class Ex01{
	public static void main(String[] args){
	// swich ~ case : if문과 같은 분기문
	// if문의 조건식은 boolean형, 비교연선, 논리연산
	// swich문의 조건식은 byte, short, int, char, String 사용
	// 범위가 나오면 기본적으로는 if문을 사용하자
	// switch문은 100% if문으로 변환이 가능하다!
	// 형식 : switch(인자값(char,int,String)) {
	//	  case 조건값1 : 인자값이 요구하는 값이 조건값1과 같을 때 실행할 문장; break;
	//	  case 조건값2 : 인자값이 요구하는 값이 조건값2와 같을 때 실행할 문장; break;
	//	  case 조건값3 : 인자값이 요구하는 값이 조건값3와 같을 때 실행할 문장; break;
	//	  default : 조건값1,2,3 모두 요구하는 값이 아닐때, 즉 나머지의 경우 실행할 문장;	
	// 	  }	
	// 주의사항 : break문이 없으면 다음 break를 만날때까지 모든 실행문을 실행한다.
	// 	      break문은 해당 switch문을 빠져나가는 역할.

	// char k1이 A이면 아프리카, B이면 브라질, C이면 캐나다, 나머지 한국
	char k1 = 'C';
	String str = "";
	switch(k1){
		case 'A' : 
		case 'a' : str = "아프리카"; break;	
		case 'B' : 
		case 'b' : str = "브라질"; break;
		case 'C' : 
		case 'c' : str = "캐나다"; break;
		default : str = "한국"; 
		// break가 없는걸 이용한 OR관계 표현
	}
	System.out.println(str);

	// int k2가 1또는 3이면 남자, 2또는 4이면 여자
	int k2 = 3;
	String str2 = "";
	switch(k2){
	  case 1 :
	  case 3 : str2 = "남자"; break;
	  case 2 :
	  case 4 : str2 = "여자"; break;
	  // default 생략가능
	}
	System.out.println(str2);

	// String k3이 한국이면 서울, 중국이면 베이징, 일본이면 도쿄
	String k3 = "한국";
	String str3 = "";
	switch(k3){
	  case "한국" : str3 = "서울"; break;
	  case "중국" : str3 = "베이징"; break;
	  case "일본" : str3 = "도쿄"; break;
	  default : str = "데이터에 없는 나라입니다.";
	}
	System.out.println(str3);

	}
}