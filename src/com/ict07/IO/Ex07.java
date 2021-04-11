package com.ict07.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		// 1. FileInputStream : 파일을 대상으로 1byte씩 데이터 읽기를 할 수 있는 스트림
		// - 생성자 : FileInputStream(File file), FileInputStream(String name)
		//		File file, String name => 특정위치 + 파일이름
		//	- 주요메소드
		//		read() : int반환 -> 결과가 숫자(아스키코드)로 나옴
		//				 char형으로 형변환 해야 문자가 된다.
		//			 	 더이상 읽을 수가 없을 때 -1이 나온다.
		//				 비 영어권 문자는 읽을 수 없다.
		// 		read(byte[] b) : int반환 -> 배열을 만들어서 인자에 넣으면
		//									배열 크기만큼 문자를 읽을 수 있다.
		//									(byte[] b에 읽을 문자들이 배열 크기만큼 저장된다.)
		//		close : open된 스트림 닫기(사용 후 닫기), 보통 finally에서 처리
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
											+ File.separator + "ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			
			// 한글자 읽어오기 : read() => 숫자(아스키코드) -> 형변환
			// int k = fis.read();
			// System.out.println(k + ":" + (char)(k)); // 맨 앞의 한개만 읽음
			
			// 한글자씩 계속 읽기 : 그림, 소리, 동영상, 파일은 무조건 해당 방식을 사용
			//						비 영어권 문자들은 읽을 수 없다.
			/*	// 풀어 쓰면 이렇게 쓰는게 맞긴함
			int k = 0;
			while (true) {
				k = fis.read();
				if(k == -1) break;
				System.out.println(k + " : " + (char)(k));
			}
			*/
			/*
			int k = 0;
			// 위의 것을 줄여쓰면 이렇게 됨
			while ((k = fis.read()) != -1) { // fis를 이용해서 한 글자를 읽었을 때 -1과 같지 않으면 실행
				System.out.println(k + " : " + (char)(k));
			}
			*/
			
			/*
			// 배열을 이용하는 방법 : 비영어권 사용 못함
			byte[] b = new byte[(int)(file.length())]; // 배열 크기만큼 저장.
			fis.read(b);
			for (byte k : b) {
				System.out.println(k + " : " + (char)(k));
			}
			*/
			
			// String을 이용하자(영어외의 문자도 가능)
			// String 생성자에는 byte[]을 인자로 받는 생성자를 이용하면 된다.
			byte[] b = new byte[(int)(file.length())];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}
}
