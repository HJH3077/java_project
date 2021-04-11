package com.ict03.class02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 컴퓨터와 가위(0), 바위(1), 보(2) 게임하기
		// 컴퓨터는 랜덤으로 가위(0), 바위(1), 보(2)를 갖는다.
		// 사용자가 가위, 바위, 보를 선택해서 컴퓨터와 대결한다.
		
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int wincnt = 0;
		
		// 게임
		/*
		while (true) {
			cnt++;
			double game = (int) (Math.random() * 3); // 0 ~ 2
			System.out.println(game); // 컴퓨터가 뭘 냈는지 확인
			System.out.print("무엇을 내시겠습니까? (0. 가위 / 1. 바위 / 2. 보) >>> ");
			int choice = sc.nextInt();
			if (game == choice) {
				System.out.println("비겼습니다.");
			} else if (game < choice) {
				if (game == 0 && choice == 2) {
					System.out.println("졌습니다.");
				} else {
					System.out.println("이겼습니다.");
					wincnt++;
				}
			} else {
				if (game == 2 && choice == 0) {
					System.out.println("이겼습니다.");
					wincnt++;
				} else
					System.out.println("졌습니다.");
			}
			System.out.print("계속하시겠습니까? (1. yes / 2.no) >>>  ");
			int coin = sc.nextInt();
			if (coin == 2)
				break;
		}
		
		// 승률
		
		double win_rate = (wincnt * 1.0 / cnt) * 100;
				System.out.println("승률은 " + win_rate);
		*/
		
		
		esc: while (true) {
			cnt++;
			int computer = (int) (Math.random() * 3);// 0 ~ 2
			
			int user = 0;
			while (true) {
				System.out.print("가위, 바위, 보 >> ");
				String user1 = scan.next();
				if (user1.equals("가위")) {
					user = 0; break;
				}
				else if (user1.equals("바위")) {
					user = 1; break;
				}
				else if (user1.equals("보")) {
					user = 2; break;
				}
				else {
					System.out.println("다시 입력하세요");
					continue;
				}
			}
			
			if (computer == 0) {// 가위
				if (user == 0)
					System.out.println("비김");
				else if (user == 1) {
					System.out.println("이김");
					wincnt++;
				} else if (user == 2)
					System.out.println("짐");
			} else if (computer == 1) { // 바위
				if (user == 0)
					System.out.println("짐");
				else if (user == 1)
					System.out.println("비김");
				else if (user == 2) {
					System.out.println("이김");
					wincnt++;
				}
			} else if (computer == 2) { // 보
				if (user == 0) {
					System.out.println("이김");
					wincnt++;
				} else if (user == 1)
					System.out.println("짐");
				else if (user == 2)
					System.out.println("비김");
			}
			
			while (true) {
				System.out.print("계속할까요?(y/n) >> ");
				String msg = scan.next();
				if (msg.equalsIgnoreCase("y"))
					continue esc;
				else if (msg.equalsIgnoreCase("n"))
					break esc;
				else {
					System.out.println("다시 입력하세요");
					continue;
					
				}
			}

		}
		System.out.println("수고하셨습니다.");
		System.out.println("당신의 도전횟수 : " + cnt + " / 승률 : " + Math.round(((wincnt * 1.0 / cnt) * 100)) + "%");
																// wincnt / cnt 가 int여서 0.몇 인데 0됨.
	}
	
	
	// 나홀로 공부 : 가위바위보에 문자 넣어서 숫자로 0,1,2가 아닌 가위 바위 보 를 입력해서 나오게 만들기
	
	// 다음 주 까지 baseball game 만들기!
	/* 각자 3자리[1]의 숫자를 임의로 정한 뒤, 서로에게 3자라의 숫자를 불러서 결과를 확인한다.
	   그리고 그 결과를 토대로 상대가 적은 숫자를 예상한 뒤 맞힌다.
	  	* 사용되는 숫자는 0 ~ 9까지 서로 다른 숫자이다.
	  	* 숫자는 맞지만 위치가 틀렸을 때는 볼
	  	* 숫자와 위치가 전부 맞으면 스트라이크
	  	* 숫자와 위치가 전부 틀리면 아웃
	  종료조건 : 9번까지 or 3아웃 or 정답을 맞춤
	 */
	
	
}
