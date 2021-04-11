package com.ict01.grammer01;

class Ex02{
	// 메인메소드 : JVM이 호출해서 자바프로그램을 실행시키는 즉, 해석하고 실행하기 위한 시작포인트 = 자바가 실행이 되게함
	// 그래서 main은 1개여야함. 시작하는 것이니까 1개면 충분함 2개면 뭘로 실행할지 모르죠
	// public, static, void 다 의미가 있고 결국 고칠수 있는 부분은 string args부분
	public static void main(String[] args){
		// 출력 후 줄 바꾸기 : println(~)
		// 출력하고 줄 바꾸기 x : print(~)
		// 그냥 줄 바꾸기 : println()
		System.out.println("이름 : 황준혁 ");
		System.out.print("010 - 3077 - 2684");
		System.out.println();
		System.out.print("wnsgu2684@naver.com");
		System.out.println("한국 ICT 인재 개발원");
		System.out.println("02 - 739 - 7235");
	}
}

// ()가 나오면 무조건 메소드이고 ()앞이 메소드의 이름임 main() = main 메소드임 / println() = println 메소드임
// 메소드란 기능, 동작, 일을 뜻함 