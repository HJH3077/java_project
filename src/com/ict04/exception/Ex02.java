package com.ict04.exception;

public class Ex02 {
	public static void main(String[] args) {
		try {
			String year = "2002년";
			int age = 2012 - Integer.parseInt(year); // 정수형 숫자만 받아야하는데 "년" 이라는 문자가 들어와서 오류
			System.out.println("나이 : " + age);			
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요");
		}
		System.out.println("수고하셨습니다.");
		
		
		
		
		
		
	}
}
