package com.ict02.array;

import java.util.Arrays; // Arrays ctrl + space�� �ڵ� import
import java.util.Collections;

public class Ex03 {
	public static void main(String[] args) {
		// �迭 �����ϱ�(���� ���� - 1,2,3,4,5,6,7,8,9,10)
		int[] su = {3,4,9,5,6,1,7,2,10,8};
		int temp = 0;
		
		for (int i = 0; i < su.length - 1; i++) { // i = 0 ~ 8 ���ڸ��� 9�� ���� ����� �����Ƿ�
			for (int j = i+1; j < su.length; j++) { // j = (i + 1) ~ 9  i���� ��ĭ ������ ��(i)�� ���� ������ ��(i)�� �ǹǷ�
				// ��(i)���� ��(j)�� ������ �ڸ� ����(���� ���� (su[i] > su[j]))
				// ��(i)���� ��(j)�� ũ�� �ڸ� ����(���� ���� (su[i] < su[j]))
				if(su[i] > su[j]) {
					temp = su[j];
					su[j] = su[i];
					su[i] = temp;
				}
			}
		}
		// ���
		for(int i = 0; i < su.length; i++)
			System.out.println(su[i]); 
		
		System.out.println("================================================");
		
		int[] su2 = {3,4,9,5,6,1,7,2,10,8};
		Arrays.sort(su2); // Arrays.sort(�迭) �޼ҵ�� �ش� �迭�� ���������ϴ� ���
		
		for (int i = 0; i < su2.length; i++) {
			System.out.println(su2[i]);
		}
		
		System.out.println("================================================");
		
		// Integer[] ���߿����
		// Ŭ������ �ڷ��� �迭�� ��� (�����ڷ��� �迭 �϶� �������� ����)
		Integer[] su3 = {3,4,9,5,6,1,7,2,10,8};
		// Arrays.sort(�迭, Collections.reverseOrder()) �� �ش� �迭�� ���������ϴ� ���
		Arrays.sort(su3, Collections.reverseOrder());
		for (int i = 0; i < su3.length; i++) {
			System.out.println(su3[i]);
		}
		
		
		// �Ϻθ� �����ϱ�
		int[] su4 = {3,4,9,5,6,1,7,2,10,8};
		
		
	}
}
