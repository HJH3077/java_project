package com.ict03.class01;

public class Ex03_main {
	public static void main(String[] args) {
		// Ex03 클래스를 객체로 만들자
		Ex03 test = new Ex03(); // 생성자를 안만들었으니 기본생성자
		
		// plus01 은 void이므로 받을 데이터가 없다.
		System.out.println(1);
		test.plus01(); // 여기가 없으면 result는 초기값인 0이 나온다.
					   // 메소드는 호출해야 실행하기 때문에. 대신 호출한 이곳으로 결국 다시 돌아옴.
		System.out.println(3);
		System.out.println(test.result);
		
		// sub01 은 반환형이 int이므로 저장 변수도 int형으로 만들어야 한다.
		int sub = test.sub01();
		System.out.println(sub);
		
	}
}
