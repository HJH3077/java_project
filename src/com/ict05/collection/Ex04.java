package com.ict05.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex04 {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math.random() * 45) + 1; // 1 ~ 45
			boolean b = lotto.add(k); // true
			if(!b) { // false가 되면 = 중복되었을 때
				i--; // 여기다 랜덤하면 또 중복될 수 있으므로 카운트를 1개빼는 방법을 씀
			}
		}
		System.out.println(lotto); // 근데 중복되면 6개가 안나옴
		
		TreeSet<Integer> lotto2 = new TreeSet<Integer>(); // lotto가 오름차순으로!
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
