package com.ict04.exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {//throws NumberFormatException 	// 이러면 JVM한테 떠넘긴 것
		// throws (예외 양도, 예외 전가)
		// - 예외가 발생하면 예외처리를 하지 않고, 자신을 호출한 곳으로 예외 객체를 전달하는 것
		// - 나중에라도 예외처리(try ~ catch)를 하는 것이 좋다.
		Ex05 test = new Ex05();
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("정수 입력 : ");
			String msg = scan.next();
			test.setData(msg);			
		} catch (Exception e) {
			System.out.println("첫 글자는 숫자로 입력하세요.");
		}
		 // 메소드인데 무언가에 저장하는게 아니므로 void
						   // 인자가 있으므로 메소드에도 인자가 필요함
		
	}
	public void setData(String msg) throws NumberFormatException {
		if(msg.length()>=1) { // msg가 1글자 이상이면 실행 즉, 0이면 글자 없으므로 실행 x
			String str = msg.substring(0, 1); // 0이상 1미만에 있는 인덱스에 글자를 추출 -> 즉, 첫글자만 추출
			prnData(str); // 메소드가 끝나기 전에 호출하므로 여기서는 객체 생성이나 호출을 또 안해도됨!
		}
	}	
	
	public void prnData(String str) throws NumberFormatException {
	//	try {
			int dan = Integer.parseInt(str);
			System.out.println(dan + "단");
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
	//	} catch (Exception e) {
	//		System.out.println("첫 글자는 숫자로 입력하세요.");
	//	}
			
	// 원래는 여기서 try catch로 잡아도 되지만 throws로 값을 잘못 준 애한테 떠넘기기 시작할 수 있음.
	}
	
}
