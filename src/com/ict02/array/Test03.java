package com.ict02.array;

import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println(sum);
		
		int tmp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}	
			}
		}
		int max = arr[9];
		int min = arr[0];
		System.out.println("최소값 : " + min);
		System.out.println("최댓값 : " + max);
		
	
		
		
	}
}
