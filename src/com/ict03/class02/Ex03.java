package com.ict03.class02;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		// 랜덤 : Math.random(), Random 클래스
		
		// 1. Random 클래스
		Random ran = new Random();
		
		// 각종 자료형의 데이터를 무작위로 추출
		System.out.println("boolean형 : " + ran.nextBoolean());
		System.out.println("int형 : " + ran.nextInt());
		System.out.println("long형 : " + ran.nextLong());
		
		// 실수형태는 0.0이상 ~ 1.0미만
		System.out.println("float형 : " + ran.nextFloat());
		System.out.println("double형 : " + ran.nextDouble());
		System.out.println();
		System.out.println("--");
		// 특정범위를 지정해서 사용하는 방법
		// 1) nextInt(정수) : 0 ~ 정수전까지 난 수 발생
		int s1 = ran.nextInt(3); // 0 ~ 2;
		System.out.println(s1);
		System.out.println(ran.nextInt(3));
		// 2) (int)(nextDouble() * 숫자) : 0 ~ 정수전까지 난 수 발생 - 이게 범위가 넓어서 더 많아서 많이씀
		int s2 = (int)(ran.nextDouble() * 3); // 0 ~ 2 double은 0 ~ 0.999999999... 까지
		System.out.println(s2);
		System.out.println();
		
		// 2. Math 클래스 : 생성자가 없다. 즉, 메소드들이 다 static이므로 객체 생성없이 호출.
		System.out.println("--");
		// 1) random() : 0.0이상 ~ 1.0미만
		System.out.println(Math.random()); // nextDouble이랑 같음, 반환형도 같은 double
		
		// 2) 특정 범위를 지정할 때
		int s3 = (int)(Math.random() * 3); // 0 ~ 2
		System.out.println(s3);
		
		// 3) abs : 절대값 반환
		System.out.println(Math.abs(100));	// 100
		System.out.println(Math.abs(-100)); // 100
		
		// 4) ceil(올림), round(반올림), floor(버림) : 
		System.out.println("올림 : " + Math.ceil(3.45)); // 4.0 반환이 실수
		System.out.println("올림 : " + Math.ceil(3.55)); // 4.0
		
		System.out.println("반올림 : " + Math.round(3.45)); // 3 반환이 정수
		System.out.println("반올림 : " + Math.round(3.55)); // 4
		
		System.out.println("버림 : " + Math.floor(3.45)); // 3.0
		System.out.println("버림 : " + Math.floor(3.55)); // 3.0
	
		// 5) max : 두 수 중에 큰 것. (단점 : 숫자를 2개밖에 못받음, 그래서 정렬 오름차순으로 구별하는게 나음)
		// 	  min : 두 수 중에 작은 것.		
		System.out.println("max : " + Math.max(44.9, 45));
		System.out.println("min : " + Math.min(-44.9, -45)); // 음수 양수 모두 다 됨 ^^7
		
		// 6) pow(double a, double b) : a ^ b 제곱 
		System.out.println(Math.pow(2, 3)); // 2의 3승 = 8.0
		System.out.println(Math.pow(3, 2)); // 3의 2승 = 9.0
		
		
		
		
	}
}
