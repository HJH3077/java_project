package com.ict02.array;
// 한줄 지우기 : ctrl + D, 한줄 복사 : ctrl + alt + 아래 방향키
public class Ex01 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 데이터들을 한 곳에 모아둔 묶음, * 반드시 같은 자료형만 가능!
		// 		  생성할 때 크기를 지정해야한다. 배열 크기는 변경불가
		// 		  배열을 출력할 때 일반적으로 for문을 사용한다.
		// 배열 생성 순서 : 선언 -> 생성 -> 데이터 저장
		// 1. 선언 : 자료형[] 이름; (or 자료형 이름[];)
		// 2. 생성 : 이름 = new 이름의 자료형[배열의 크기];
		//			 배열의 크기는 갯수 즉, 빈 방의 수를 말한다.
		// 			 new 는 예약어(자주색)로 메모리에 데이터를 저장할 공간을 만들라는 예약어
		// 			 다른 말로 인스턴스, 객체 생성, 객체화
		// 3. 데이터 저장 : 이름[방번호 = index = 위치값] = 데이터;
		//					이 때 데이터는 같은 자료형이어야 한다.
		//					단, 작은 자료형이 큰자료형에 들어가는건 가능하다. (반대는 x)
	
		int[] su; // 선언
		su = new int[5]; // 생성
		su[0] = 123;
		su[1] = 'j';
		// 자료형이 다르거나 선언한 자료형보다 크면 데이터 저장이 안됨.
		// su[2] = 3.14;
		// su[3] = true;
		// su[4] = "j";
		su[2] = 321;
		su[3] = 456;
		su[4] = 654;
		
		// 배열을 호출하면 주소가 나온다.
		System.out.println(su); // su가 가진 배열의 저장주소
		
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		System.out.println(su[4]);
		System.out.println();
		
		// i < 5에서 5는 배열의 크기를 의미한다 => su.length
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
	}
}
