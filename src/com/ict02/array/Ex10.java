package com.ict02.array;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 번호, 국어, 영어, 수학점수를 입력받아서 번호, 총점, 평균, 학점, 순위를 구하고 정렬하자.
		int[][] arr = new int[5][5];
		
		int hak = 0;
		int rank = 1;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("번호 : ");
			int num = scan.nextInt();
			System.out.print("국어점수 : ");
			int kor = scan.nextInt();
			System.out.print("영어점수 : ");
			int eng = scan.nextInt();
			System.out.print("수학점수 : ");
			int math = scan.nextInt();
			int total = kor + eng + math;
			int avg = total/3;
			if(avg >= 90)
				hak = 'A';
			else if(avg >= 80)
				hak = 'B';
			else if(avg >= 70)
				hak = 'C';
			else
				hak = 'F';
			
			// 2차원 배열에 바로 값을 입력
			arr[i][0] = num;
			arr[i][1] = total;
			arr[i][2] = avg;
			arr[i][3] = hak;
			arr[i][4] = rank;
			
			// 1차원 배열 만들어서 넣기
			/*
			int[] person = new int[5]; // for로 5개 만들어 지지만 오류가 안남
			person[0] = num;
			person[1] = total;
			person[2] = avg;
			person[3] = hak;
			person[4] = rank;
			arr[i] = person;
			*/
		}
		
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				if(arr[i][1] < arr[j][1])
					arr[i][4]++;
					
			}
		}
		
		
		// 정렬
		
		int[] tmp = new int[5];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
		// 출력
		System.out.println("번 호\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 3)
					System.out.print((char)(arr[i][j]) + "\t");				

				else	
					System.out.print(arr[i][j] + "\t");				
			}
		System.out.println();
		}
		
		
		
	}
}
