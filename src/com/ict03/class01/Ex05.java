package com.ict03.class01;

public class Ex05 {
	// 접근제한자 : 외부에서 접근하여 사용할 수 있는 단계를 구분
	// public : 누구나 다 접근 가능, protected : 같은 패키지나 다른 패키지라도 상속관계이면접근가능
	// 생략(default) : 같은 패키지에서만 접근가능, private : 외부에서는 접근 불가, 내부에서는 접근 가능
	
	public int s1 = 10;
	private int s2 = 20; // 변수 상수는 기본적으로 private하긴함, getter/setter로 만지는게 가능함.
	public static int s3 = 30;
	private static int s4 = 40;
	
	public void add() { // 모두가 쓸 수 있게 하는 기능
		s1 = s1 + 10;
		s2 = s2 + 10; // 내부에서는 접근 가능
		s3 = s3 + 10;
		s4 = s4 + 10; // 내부에서는 접근 가능
	}
	
	private void add2() { // 이런건 외부에서 사용이 불가능하니 필요 없거나 아무도 못오게 하려고 만든거지만
		s1 = s1 + 10;	  // 나만 쓸 수 있는 기능
		s2 = s2 + 10; 
		s3 = s3 + 10;
		s4 = s4 + 10; 
	}
	
	void add3() { // 이런 방법으로 메소드가 메소드를 호출하여 사용이 가능함. 즉, 직접적으로는 못감.
 		add2();	  // 변수는 이런 방법이 아니라 그냥 getter/setter로 조정가능
	}
	
	
	
	
}
