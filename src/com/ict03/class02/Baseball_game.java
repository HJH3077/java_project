package com.ict03.class02;

import java.util.Scanner;

public class Baseball_game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		// ���� ����
		int[] computer = new int[3];
		while(true) {
		computer[0] = (int)(Math.random() * 10);
		computer[1] = (int)(Math.random() * 10);
		computer[2] = (int)(Math.random() * 10);
		if(computer[0] != computer[1] && computer[1] != computer[2] && computer[2] != computer[0])
			break;
		}
		
		
		// ��, ��Ʈ����ũ, �ƿ� ī��Ʈ
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
					System.out.print((i+1) + "��° �ڸ��� �Է��ϼ��� : ");
					user[i] = sc.nextInt();
					if(user[i] < 0 || user[i] > 9) {
						System.out.println("�� �ڸ� ���ڸ� �Է��ϼ���.");
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
				System.out.println(out_cnt + " �ƿ�");
				if(out_cnt == 3) 
					break;
			}
			else {
				System.out.println(strike + " ��Ʈ����ũ " + ball +" ��");
				if(strike == 3)
					break;
			}
			
		} 

		// ��� ���
		if(strike == 3)
			System.out.println(num_cnt + "������ �¸��Ͽ����ϴ�.");
		else if(num_cnt == 10)
			System.out.println("Ƚ�� �ʰ��� �й��Ͽ����ϴ�.");
		else if(out_cnt == 3)
			System.out.println("3 �ƿ����� �й��Ͽ����ϴ�.");
			
		
		
		
	}
}
