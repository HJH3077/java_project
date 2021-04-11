package com.ict03.class07;

interface Test{
	int data = 1000;
	void printData();
}

// 상속받아서 사용하는 방법
class Test02 implements Test{
	@Override
	public void printData() {
		System.out.println("data : " + data);
	}
	
	// 그냥 printData(); 를 실행
} 

// 상속받지 않고 사용하는 방법 (anonymous 사용)
class Test03{
	Test t = new Test() {
		@Override
		public void printData() {
			System.out.println("data : " + data);
		}
	};
	// t.printData(); 실행
}

// 상속받지 않고 메소드에 넣기('Test t = ' 부분을 없앨 수 있음)
class Test04{
	public void play() {
		new Test() {
			@Override
			public void printData() {
				System.out.println("data : " + data);			
			}
		}
		.printData(); // 내부클래스 끝
	} // 메소드 끝
} 
// 내부 끝과 외부메소드 끝 사이에 실행해야함

// 상속받지 않고 메소드 인자에 넣기
class Test05{
	public void sound(Test test) {
		test.printData();
	}
}


public class Ex08 {
	public static void main(String[] args) {
		// 1번 방법의 출력
		Test02 t2 = new Test02();
		t2.printData();
		System.out.println();
		
		// 2번 방법의 출력
		Test03 t3 = new Test03();
		t3.t.printData();
		System.out.println();
		
		// 3번 방법의 출력
		Test04 t4 = new Test04();
		t4.play();
		System.out.println();
		
		// 4번 방법의 출력 (이벤트 처리 방법)
		Test05 t5 = new Test05();
		t5.sound(new Test() {
			@Override
			public void printData() {
				System.out.println("data : " + data);
			}
		});
		
	}
}
