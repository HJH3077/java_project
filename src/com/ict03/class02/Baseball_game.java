package com.ict03.class02;

import java.util.Scanner;

public class Baseball_game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		// 숫자 생성
		int[] computer = new int[3];
		while(true) {
		computer[0] = (int)(Math.random() * 10);
		computer[1] = (int)(Math.random() * 10);
		computer[2] = (int)(Math.random() * 10);
		if(computer[0] != computer[1] && computer[1] != computer[2] && computer[2] != computer[0])
			break;
		}
		
		
		// 볼, 스트라이크, 아웃 카운트
		int strike = 0;
		int num_cnt = 0;
		int out_cnt = 0;
		int[] user = new int[3];
		while (num_cnt < 10) {
			num_cnt++;
			strike = 0;
			int ball = 0;
			int out = 0;
			for (int i = 0; i < user.length; i++) {
					System.out.print((i+1) + "번째 자리를 입력하세요 : ");
					user[i] = sc.nextInt();
					if(user[i] < 0 || user[i] > 9) {
						System.out.println("한 자리 숫자를 입력하세요.");
						i = i - 1;
					}
			}
			
			for (int i = 0; i < user.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (user[i] == computer[j]) {
						if (i == j) 
							strike++;						
						else
							ball++;
					} else 
						out++;
			
				}
			}
			if(out == 9) {
				out_cnt++;
				System.out.println(out_cnt + " 아웃");
				if(out_cnt == 3) 
					break;
			}
			else {
				System.out.println(strike + " 스트라이크 " + ball +" 볼");
				if(strike == 3)
					break;
			}
			
		} 

		// 결과 출력
		if(strike == 3)
			System.out.println(num_cnt + "번으로 승리하였습니다.");
		else if(num_cnt == 10)
			System.out.println("횟수 초과로 패배하였습니다.");
		else if(out_cnt == 3)
			System.out.println("3 아웃으로 패배하였습니다.");
			
		
		
		
	}
}
