package com.ict03.class02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// ��ǻ�Ϳ� ����(0), ����(1), ��(2) �����ϱ�
		// ��ǻ�ʹ� �������� ����(0), ����(1), ��(2)�� ���´�.
		// ����ڰ� ����, ����, ���� �����ؼ� ��ǻ�Ϳ� ����Ѵ�.
		
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int wincnt = 0;
		
		// ����
		/*
		while (true) {
			cnt++;
			double game = (int) (Math.random() * 3); // 0 ~ 2
			System.out.println(game); // ��ǻ�Ͱ� �� �´��� Ȯ��
			System.out.print("������ ���ðڽ��ϱ�? (0. ���� / 1. ���� / 2. ��) >>> ");
			int choice = sc.nextInt();
			if (game == choice) {
				System.out.println("�����ϴ�.");
			} else if (game < choice) {
				if (game == 0 && choice == 2) {
					System.out.println("�����ϴ�.");
				} else {
					System.out.println("�̰���ϴ�.");
					wincnt++;
				}
			} else {
				if (game == 2 && choice == 0) {
					System.out.println("�̰���ϴ�.");
					wincnt++;
				} else
					System.out.println("�����ϴ�.");
			}
			System.out.print("����Ͻðڽ��ϱ�? (1. yes / 2.no) >>>  ");
			int coin = sc.nextInt();
			if (coin == 2)
				break;
		}
		
		// �·�
		
		double win_rate = (wincnt * 1.0 / cnt) * 100;
				System.out.println("�·��� " + win_rate);
		*/
		
		
		esc: while (true) {
			cnt++;
			int computer = (int) (Math.random() * 3);// 0 ~ 2
			
			int user = 0;
			while (true) {
				System.out.print("����, ����, �� >> ");
				String user1 = scan.next();
				if (user1.equals("����")) {
					user = 0; break;
				}
				else if (user1.equals("����")) {
					user = 1; break;
				}
				else if (user1.equals("��")) {
					user = 2; break;
				}
				else {
					System.out.println("�ٽ� �Է��ϼ���");
					continue;
				}
			}
			
			if (computer == 0) {// ����
				if (user == 0)
					System.out.println("���");
				else if (user == 1) {
					System.out.println("�̱�");
					wincnt++;
				} else if (user == 2)
					System.out.println("��");
			} else if (computer == 1) { // ����
				if (user == 0)
					System.out.println("��");
				else if (user == 1)
					System.out.println("���");
				else if (user == 2) {
					System.out.println("�̱�");
					wincnt++;
				}
			} else if (computer == 2) { // ��
				if (user == 0) {
					System.out.println("�̱�");
					wincnt++;
				} else if (user == 1)
					System.out.println("��");
				else if (user == 2)
					System.out.println("���");
			}
			
			while (true) {
				System.out.print("����ұ��?(y/n) >> ");
				String msg = scan.next();
				if (msg.equalsIgnoreCase("y"))
					continue esc;
				else if (msg.equalsIgnoreCase("n"))
					break esc;
				else {
					System.out.println("�ٽ� �Է��ϼ���");
					continue;
					
				}
			}

		}
		System.out.println("�����ϼ̽��ϴ�.");
		System.out.println("����� ����Ƚ�� : " + cnt + " / �·� : " + Math.round(((wincnt * 1.0 / cnt) * 100)) + "%");
																// wincnt / cnt �� int���� 0.�� �ε� 0��.
	}
	
	
	// ��Ȧ�� ���� : ������������ ���� �־ ���ڷ� 0,1,2�� �ƴ� ���� ���� �� �� �Է��ؼ� ������ �����
	
	// ���� �� ���� baseball game �����!
	/* ���� 3�ڸ�[1]�� ���ڸ� ���Ƿ� ���� ��, ���ο��� 3�ڶ��� ���ڸ� �ҷ��� ����� Ȯ���Ѵ�.
	   �׸��� �� ����� ���� ��밡 ���� ���ڸ� ������ �� ������.
	  	* ���Ǵ� ���ڴ� 0 ~ 9���� ���� �ٸ� �����̴�.
	  	* ���ڴ� ������ ��ġ�� Ʋ���� ���� ��
	  	* ���ڿ� ��ġ�� ���� ������ ��Ʈ����ũ
	  	* ���ڿ� ��ġ�� ���� Ʋ���� �ƿ�
	  �������� : 9������ or 3�ƿ� or ������ ����
	 */
	
	
}
