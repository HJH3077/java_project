package com.ict02.array;

public class Ex04 {
	public static void main(String[] args) {
		// 순위 구하기
		// 전제조건 : 1. 모든 사람의 순위를 1등으로 초기화한다.
		// 			  2. 모든 사람들과 비교해야 한다.(단, 자기자신은 비교할 필요가 없다.(i == j 일때))
		//			  3. 나(i) 보다 남(j)이 크면 내(i) 순위를 증가시킨다.
		
		int[] su = {270, 265, 280, 290, 285}; // 만약 동점이 있을 시) 285점이 2명이면 3등없이 2등이 2명이됨.
		int[] rank = {1, 1, 1, 1, 1};
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				if(su[i] == su[j]) continue;
				if(su[i] < su[j]) 
					rank[i]++;
				
				
			}
		}
	
		for (int i = 0; i < rank.length; i++) {
			System.out.println(rank[i]);
		}
		
	}
}
