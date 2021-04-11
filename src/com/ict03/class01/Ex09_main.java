package com.ict03.class01;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학 점수를 받아서 이름, 총점, 평균, 학점, 순위를 구하고 정렬하자
		
		// 입력받아서 데이터 넣기
		Scanner sc = new Scanner(System.in);
		Ex09[] arr = new Ex09[5]; // 클래스를 저장하는 배열, Ex09가 자료형이됨.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int math = sc.nextInt();
			
			Ex09 person = new Ex09();
			person.setName(name);
			person.p_sum(kor, eng, math);
			person.p_avg();
			person.p_hak();
			
			arr[i] = person; // 2차원 배열 같은 느낌이 됨. person은 name, sum, avg, hak, rank가 있는 배열
							 // arr에 다 넣은 거라 실제로는 1차원 배열임.
		}
		
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) continue;
					if(arr[i].getSum() < arr[j].getSum())
						arr[i].setRank(arr[i].getRank() + 1); // 바꾸려면 setter로 해야함.
			}
		}
		
		// 정렬
		// 자리를 변경하기 위한 임시저장
		Ex09 tmp = new Ex09();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
		// 출력
		System.out.println("이 름\t총 점\t평 균\t학 점\t등 수");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + "\t");
			System.out.print(arr[i].getSum() + "\t");
			System.out.print(arr[i].getAvg() + "\t");
			System.out.print(arr[i].getHak() + "\t");
			System.out.println(arr[i].getRank());
		}
		
		
		
		
		
		
		
	}
}
