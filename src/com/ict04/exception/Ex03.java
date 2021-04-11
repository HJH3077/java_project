package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 다중 catch문 : try문의 예외 발생이 여러 가지의 예외가 발생할 경우 사용
		// 주의사항 : Exception을 사용할 때는 반드시 아래쪽 catch문에서 사용한다.
		
		Scanner scan = new Scanner(System.in);
		try {
			int var = 27;
			System.out.print("정수 입력 : ");
			int su = scan.nextInt();
			System.out.println("정답 : " + (var / su));
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력하세요.");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 숫자를 나눌 수 없습니다.");
		} 
		
		// catch (Exception e) 이게 가장 마지막에 와야함 
		// why? 이건 오류발생 시 어떤경우든 해결하는 것이므로 다중 catch는 특정 오류 시 무엇이 나올지 구별해야됨 
		
		try {	
			int var = 27;
			System.out.print("정수 입력 : ");
			int su = scan.nextInt();
			System.out.println("정답 : " + (var / su));
		} catch (Exception e) { // 이런 식이면 "오류 발생하면 무조건 아래의 것을 실행한다" 처럼된다.
								// 근데 보통 이런식으로 그냥 처리하는게 편함
			System.out.println("제대로 입력하세요 : " + e); 
		}
		
		System.out.println("수고하셨습니다.");
		
		
		
	}
}
