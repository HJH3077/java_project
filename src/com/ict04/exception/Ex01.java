package com.ict04.exception;

public class Ex01 {
	public static void main(String[] args) {
		// 자바에서 오류가 발생하면 무조건 프로그램을 종료시킨다.
		// 그러나 가벼운 예외나 예상된 예외를 별도로 처리하는 방법을 사용하면
		// 무조건 프로그램이 종료되는 것이 아니라 정상 종료를 할 수 있도록
		// 하는 방법을 예외 처리라고 한다.
		// try ~ catch ~
		
		// 예외처리 : Exception
		//			  try ~ catch ~ 문
		// 목적 : 비정상적인 종료를 정상적인 종료로 유도,
		//		  예외 발생 시 예외에 대한 처리를 해준다.
		// 형식 : try{
		//			예외가 발생할 수 있는 문장;
		//			예외가 발생할 수 있는 문장;
		//			예외가 발생할 수 있는 문장;
		//			} catch(예외발생객체 e){         // 다중 catch 가능
		//				예외 발생 시 처리하는 문장;
		//			}
		// ** 오류가 발생하면 중간에 멈추고 오류발생
		
		try {
			int[] var = { 10, 20, 30 };
			for (int i = 0; i <= var.length; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var[" + i + "] = " + var[i]); // 여기서 오류가 발생해야 하지만
				System.out.println(3);	 		 // try로 인해 오류 발생 시 밑으로 가서 바로 정상종료
				System.out.println(4);
			}
		} catch (Exception e) {
		}
		System.out.println("수고하셨습니다.");
		
		
		
		
		// git 
		// 이걸 수정하면 왼쪽의 파일에 Ex01.java가 > Ex01.java가 됨 
		// 이건 수정했다는 의미이고 이걸 git에 올려야함
		// 우클릭 - team - commit으로 git에 올리면 사라짐.
		// 받아오는건 우클릭해서 repository에서 pull해도되고 
		
	}
}
