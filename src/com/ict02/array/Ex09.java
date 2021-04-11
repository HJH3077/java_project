package com.ict02.array;

public class Ex09 {
	public static void main(String[] args) {
		int[][] persons = new int[5][];
		
		// 번호, 총점, 평균, 학점, 순위
		int[] person01 = {1, 270, 90, 'A', 1};
		int[] person02 = {2, 210, 70, 'C', 1};
		int[] person03 = {3, 180, 60, 'F', 1};
		int[] person04 = {4, 300, 100, 'A', 1};
		int[] person05 = {5, 285, 95, 'A', 1};
		
		persons[0] = person01;
		persons[1] = person02;
		persons[2] = person03;
		persons[3] = person04;
		persons[4] = person05;
		
		// 순위 구하기
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons.length; j++) {
				if(persons[i][1] < persons[j][1])
					persons[i][4]++;
			}
		}
		
		// 정렬 (앞의 정렬과 다른 점은 한 배열에 한 종류의 정보들이 있고 세로로 사람의 정보였는데 
		//		 지금은 한 배열에 한 사람의 여러 종류의 정보가 들어있음)
		// 정렬을 하려면 임시저장이 필요한데 한 배열을 옮겨야 하니 임시저장 tmp를 배열로 만들어야됨
		
		int[] tmp = new int[5];
		System.out.println("이 름\t총 점\t평 균\t학 점\t등 수");
		for (int i = 0; i < person01.length - 1; i++) { // i는 0 ~ 끝의 전까지(마지막은 나i가 될필요가 없으므로)
			for (int j = i + 1; j < person01.length; j++) { // j는 i+1부터 끝까지(나i 다음부터 이므로 +1)
				if(persons[i][4] > persons[j][4]) { // 내(i)가 남(j)보다 크면 자리를 바꾸는 것이므로
					tmp = persons[i];
					persons[i] = persons[j];
					persons[j] = tmp;
				}
			}
		}


		// 출력
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons[i].length; j++) {
				if(j == 3)
					System.out.print((char)(persons[i][j]) + "\t");	
				else			
					System.out.print(persons[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
	}
}
