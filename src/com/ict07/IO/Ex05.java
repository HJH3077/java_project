package com.ict07.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		// 1. FileOutputStream : 파일을 대상으로 1byte씩 데이터 쓰기를 할 수 있는 스트림
		// - 생성자 : FileOutputStream(File file), FileOutputStream(File file, boolean
		// append)
		// FileOutputStream(String name), FileOutputStream(String name, boolean append)
		// File file, String name => 특정위치 + 파일이름
		// boolean append : false or 생략을 하면 덮어쓰기, true하면 이어쓰기
		// - 주요메소드
		// write (byte[] b) : 여러글자를 byte[]에 넣어서 쓰기 가능
		// flush() : 저장된 값을 지우는 명령어 ,write 후 반드시 실행하자
		// close() : open된 스트림 닫기(사용후 닫기), 보통 finally로 처리 => 열었으면 꼭 닫아야함!

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict01.txt";
		FileOutputStream fos = null;
		File file = new File(pathname); // 파일 생성
		try {
			// 기존 파일이 있으면 덮어쓰기 하고, 없으면 생성한다.
			fos = new FileOutputStream(file); // 파일이 없으면 ict01.txt를 생성
			
			// 기존 파일이 있으면 이어쓰기하고, 없으면 생성한다.
			// fos = new FileOutputStream(file, true);
			
			// 한글자쓰기
			fos.write(65); // A
			fos.write(97); // a
			
			// int이기 때문에 char를 사용할 수 있다. 
			fos.write('j'); 
			fos.write('a'); 
			fos.write('v'); 
			fos.write('a');
			
			// 자바에서 줄변경 13(Carriage return = CR = \r)이다.
			// 다른 언어 중에는 (\r\n(Line feed = 10)를 같이 사용하는 경우도 있다.)
			fos.write(13);
			
			// 배열을 이용해서 여러글자 쓰기
			byte[] b = {'b','o','y','s',13,'g','i','r','l','s'};
			fos.write(b);
			
			// String을 이용하자(영어외의 문자도 가능)
			String str = "Hello\r안녕\r123\r大韓";
			byte[] b2 = str.getBytes();
			fos.write(b2);
			
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	

	
	
	}
}