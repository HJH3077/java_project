package com.ict03.class03;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요 (1. 고양이 2. 강아지) >>>  ");
		int s1 = scan.nextInt();
		/*
		if(s1 == 1) {
			Ex10_Cat cat = new Ex10_Cat();
			cat.sound(); // 은닉화로 부모의 울음소리가 없어지고 자식인 고양이의 야옹이 출력됨.
			cat.hobby();
			cat.like();
			cat.sleep();
		} else if (s1 == 2) {
			Ex11_dog dog = new Ex11_dog();
			dog.sound();
			dog.hobby();
			dog.like();
			dog.sleep();
		}
		*/
		
		Ex09_Animal animal = null; // 미리 선언
		if (s1 == 1) {
			animal = new Ex10_Cat(); // 각자에 맞게 따로 객체 생성.
		} else if (s1 == 2) {
			animal = new Ex11_dog();
		}
		
		// 부모 클래스에 없는 메소드는 사용 불가.
		// animal.hobby(); 자식(고양이, 개)만 가지고 있는 메소드
		animal.sound();
		animal.like();
		animal.sleep();
		// 공통적인 것만 실행할 경우 이렇게 쓰는게 짧고 간결해서 좋다.
	
		
		
		
		
		
	}
}
