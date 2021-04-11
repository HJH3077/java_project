package com.ict03.class02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// StringBuffer, StringBuilder : 문자열을 빈번하게 수정, 삭제, 추가할 경우 사용을 권장한다.
		String msg ="hello";
		System.out.println(msg);
		
		// String은 불변의 속성을 가지고 있어서 메모리에 새로운 영역을 차지해서 새로만든다.
		// 메모리에 새로운 영역을 차지해서 hellojava를 새로만든다. 즉, 메모리에 hello라는 msg는 남아있음.(= 쓰레기)
		msg = msg + "java"; // 즉, 이건 hello에 java를 붙여서 저장한게 아니라 hello에 java를 붙여서 새로 저장
		System.out.println(msg);
	
		// StringBuffer는 가변의 속성을 가지고 있어서 현재 영역에서 내용을 추가한다.
		// 즉, 원래 있던 곳에 추가하므로 주소값이 바뀌지 않는다. (새로운 자리차지 x)
		StringBuffer sb = new StringBuffer("welcome"); // 스트링 생성
		System.out.println(sb.toString()); // toString() : sb의 문자열을 가져온다.
		// 내용을 추가할 때 (append("문자열"));
		sb.append("hiJAVA");
		System.out.println(sb.append(" JAVA"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요 : ");
		String m = sc.next();
		sb.append("\t" + m);
		System.out.println(sb.toString());
		
		
	}	
}
