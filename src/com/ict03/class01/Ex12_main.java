package com.ict03.class01;

import java.util.Scanner;
		// Ex09_main과 틀은 같음.
public class Ex12_main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex12[] arr = new Ex12[5]; // 클래스를 저장하는 배열, Ex09가 자료형이됨.

		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int math = sc.nextInt();

			Ex12 person = new Ex12(name, kor, eng, math); // ctrl + Ex12클릭하면 생성자위치로 링크이동.
			arr[i] = person;

		}

		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					continue;
				if (arr[i].getSum() < arr[j].getSum())
					arr[i].setRank(arr[i].getRank() + 1); 
			}
		}

		Ex12 tmp = new Ex12(); // 이 부분을 쓰기위해 오버로딩으로 기본생성자를 만듬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

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
