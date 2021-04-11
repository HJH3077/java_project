package com.ict02.array;

import java.util.Arrays; // Arrays ctrl + space로 자동 import
import java.util.Collections;

public class Ex03 {
	public static void main(String[] args) {
		// 배열 정렬하기(오름 차순 - 1,2,3,4,5,6,7,8,9,10)
		int[] su = {3,4,9,5,6,1,7,2,10,8};
		int temp = 0;
		
		for (int i = 0; i < su.length - 1; i++) { // i = 0 ~ 8 끝자리인 9는 비교할 대상이 없으므로
			for (int j = i+1; j < su.length; j++) { // j = (i + 1) ~ 9  i보다 한칸 위부터 나(i)가 비교후 다음이 나(i)가 되므로
				// 나(i)보다 남(j)이 작으면 자리 변경(오름 차순 (su[i] > su[j]))
				// 나(i)보다 남(j)이 크면 자리 변경(오름 차순 (su[i] < su[j]))
				if(su[i] > su[j]) {
					temp = su[j];
					su[j] = su[i];
					su[i] = temp;
				}
			}
		}
		// 출력
		for(int i = 0; i < su.length; i++)
			System.out.println(su[i]); 
		
		System.out.println("================================================");
		
		int[] su2 = {3,4,9,5,6,1,7,2,10,8};
		Arrays.sort(su2); // Arrays.sort(배열) 메소드는 해당 배열을 오름차순하는 기능
		
		for (int i = 0; i < su2.length; i++) {
			System.out.println(su2[i]);
		}
		
		System.out.println("================================================");
		
		// Integer[] 나중에배움
		// 클래스를 자료형 배열로 사용 (참조자료형 배열 일때 내림차순 가능)
		Integer[] su3 = {3,4,9,5,6,1,7,2,10,8};
		// Arrays.sort(배열, Collections.reverseOrder()) 는 해당 배열을 내림차순하는 기능
		Arrays.sort(su3, Collections.reverseOrder());
		for (int i = 0; i < su3.length; i++) {
			System.out.println(su3[i]);
		}
		
		
		// 일부만 정렬하기
		int[] su4 = {3,4,9,5,6,1,7,2,10,8};
		
		
	}
}
