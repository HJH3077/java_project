package com.ict01.grammer04;

import java.util.Scanner;
class Ex10 
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	esc : 
	while (true){
		System.out.print("숫자입력: ");
		int k = sc.nextInt();
		String msg = "";
		if(k % 2 == 0)
			msg = "짝수";
		else
			msg = "홀수";

		System.out.println(k + "(은/는) " + msg + " 입니다.");
		while(true){ // 이걸 통해 1,2외의 숫자를 넣는 경우는 해결했지만 아직 문자를 받으면 오류가 생기고 처리하는 법은 아직안배움.
			System.out.print("계속할까요? (1.yes 2.no) : "); 
			int k2 = sc.nextInt();
			if(k2 == 1) 
				// continue esc;
				break;
				// while 1번으로 이동하고 계속 동작해야 하므로
				// break; 로 해도됨. 차피 2번 while문을 빠져나가는게 목적이고 1번 while문이 작동할 것이므로
				// 단 break인 경우 2번 아래에 1번의 명령어가 더 있을 경우 아래의 명령어를 마저 실행하고 esc는 그냥 처음으로 가버림.
				// 실제로 2번 아래에 명령어가 더 있으면 break여야 오류가 안남. continue esc는 오류남.(안쓰는 부분이 있어서)
				// 결론적으로 break를 쓰는게 오류가 나지 않을 확률이 훨씬 높으므로 *** break를 쓰는게 맞다!
			else if(k2 == 2)
				break esc; // while 1번을 아예 빠져나가야 하므로
			else{
				System.out.print("잘못 입력하셨습니다.");
				continue; // 계속할까요를 묻는 while문으로 다시 가야하므로 break가 아닌 continue이다.
			}
		}
	}




	}
}
