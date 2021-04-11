package com.ict02.array;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번 열 갯수를 입력하세요 >> ");
			int su = sc.nextInt();
			int[] temp = new int[su];
			for (int j = 0; j < su; j++) {
				temp[j] = (int)(Math.random() * 100) + 1;
				arr[i] = temp;
			}
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();
		}
		
		int[] sum = new int[3];
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				sum[i] += arr[i][k];
			}
		}
		System.out.println();
		
		for (int j = 0; j < sum.length; j++) {
			if ((sum[j] % 5) == 0)
				System.out.println(j + "행 : 합이 5의 배수, 값은 " + sum[j]);
			else
				System.out.println(j + "행 : 합이 5의 배수가 아닙니다");	
		}
		
		
		
	}
}
