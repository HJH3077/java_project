package com.ict02.array;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ��ȣ, ����, ����, ���������� �Է¹޾Ƽ� ��ȣ, ����, ���, ����, ������ ���ϰ� ��������.
		int[][] arr = new int[5][5];
		
		int hak = 0;
		int rank = 1;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("��ȣ : ");
			int num = scan.nextInt();
			System.out.print("�������� : ");
			int kor = scan.nextInt();
			System.out.print("�������� : ");
			int eng = scan.nextInt();
			System.out.print("�������� : ");
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
			
			// 2���� �迭�� �ٷ� ���� �Է�
			arr[i][0] = num;
			arr[i][1] = total;
			arr[i][2] = avg;
			arr[i][3] = hak;
			arr[i][4] = rank;
			
			// 1���� �迭 ���� �ֱ�
			/*
			int[] person = new int[5]; // for�� 5�� ����� ������ ������ �ȳ�
			person[0] = num;
			person[1] = total;
			person[2] = avg;
			person[3] = hak;
			person[4] = rank;
			arr[i] = person;
			*/
		}
		
		// ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				if(arr[i][1] < arr[j][1])
					arr[i][4]++;
					
			}
		}
		
		
		// ����
		
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
		
		
		// ���
		System.out.println("�� ȣ\t�� ��\t�� ��\t�� ��\t�� ��");
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
