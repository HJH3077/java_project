package com.ict02.array;

public class Test01 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = (int)(Math.random() * 100) + 1 ;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			arr[i][3] = arr[i][0] + arr[i][1] + arr[i][2];
		}
		
		for (int i = 0; i < 3; i++) {
			arr[3][i] = arr[0][i] + arr[1][i] + arr[2][i];
		}
		
		for (int i = 0; i < 3; i++) {
			arr[3][3] += arr[3][i] + arr[i][3];
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}
