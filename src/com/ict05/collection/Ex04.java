package com.ict05.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex04 {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math.random() * 45) + 1; // 1 ~ 45
			boolean b = lotto.add(k); // true
			if(!b) { // false�� �Ǹ� = �ߺ��Ǿ��� ��
				i--; // ����� �����ϸ� �� �ߺ��� �� �����Ƿ� ī��Ʈ�� 1������ ����� ��
			}
		}
		System.out.println(lotto); // �ٵ� �ߺ��Ǹ� 6���� �ȳ���
		
		TreeSet<Integer> lotto2 = new TreeSet<Integer>(); // lotto�� ������������!
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math.random() * 45) + 1; // 1 ~ 45
			boolean b = lotto2.add(k); 
			if(!b) { 
				i--; 
			}
		}
		System.out.println(lotto2); 
	}
}
