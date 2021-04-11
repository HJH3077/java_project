package com.ict03.class06;

enum Type2 {
	// 순서를 지키자
	// 1. 들어갈 정보
	WALK("워킹화", 270), 
	RUN("러닝화", 275), 
	TRACK("트래킹화", 265), 
	HIKE("하이킹화", 260);

	// 2. 전역변수
	final private String name;
	final private int size;

	// 3. 생성자 (ctrl + space면 나옴)
	Type2(String name, int size) {
		this.name = name;
		this.size = size;
	}

	// 4. getter
	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
	// 상수이므로 set은 X

}

public class Ex03 {
	public static void main(String[] args) {
		Type2[] arr = Type2.values();
		for (int i = 0; i < arr.length; i++) {
			// if (i == 2) continue; 특별한 요소!
			System.out.println(arr[i].getName() + ", " + arr[i].getSize());
		}
		System.out.println("===================================");
		for (Type2 k : arr) {
			System.out.println(k.getName()+", "+k.getSize());
		}
		System.out.println("===================================");
		
		//	개선된 for문 = foreach = forin => 배열이나 나중에 배울 collection에서 주로 사용
		//	for(배열의자료형 내부에서사용할변수 : 배열이름) {
		// 	':' 의 의미가 배열이 가지고 있는 처음부터 끝까지 차례대로 내부에 사용할 변수에 대입(저장)시킨다.
		//	}
		// 단점 : 배열의 특별한 요소를 처리할 방법은 없음
		
		String[] msg = {"java", "jsp", "spring", "android"};
		for (String k : msg) {
			System.out.println(k); // 순서대로 나옴
		}
		
		
		
	}
}
