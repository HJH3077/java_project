package com.ict04.exception;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// finally : 예외처리와 상관없이 반드시 실행해야 되는 문장을
		//			 처리할 때 사용(데이터베이스, 입/출력, 네트워크에서 주로 사용)
		// 형식 : try ~ catch ~ finally
		
		Scanner scan = new Scanner(System.in);
		
		try {	
			int var = 27;
			System.out.print("정수 입력 : ");
			int su = scan.nextInt();
			System.out.println("정답 : " + (var / su));
		//	return ; // 메소드를 호출한 곳으로 돌아가는게 return인데 이 때 무언가를 가져가면 
					 // return에 값을 쓰고 아무것도 안가져가면 void이다.
		} catch (Exception e) { 
			System.out.println("제대로 입력하세요 : " + e); 
			return ; // 결국 리턴 되므로 수고하셨습니다 부분이 필요 없어져서 오류발생
					 // 수고하셨습니다 부분을 없애든가 try의 return을 없애서 수행되게 만들어야 오류잡힘
		} finally {
			System.out.println("반드시 수행해야 될 문장");
		}
		
		System.out.println("수고하셨습니다.");
		
		// 즉, 이렇게 쓰면 return으로 JVM한테 돌아가기 때문에 "정답 : " 수행 후 "수고하셨습니다"로 안가고
		// 돌아갔는데 finally는 무조건 수행이라 finally가 수행된 상황.
		
		
		
		
		
		
		
		
	}
}
