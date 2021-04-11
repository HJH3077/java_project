package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		// 속도 향상을 위해서 BufferedOutputStream을 사용한다.
		// 혼자서는 사용할 수 없고 반드시 OutputStream을 받아서 사용한다.
		// 생성자 : BufferedOutputStream(OutputStream out)


		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict02.txt";
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		File file = new File(pathname); // 파일 생성
		try {
			// 기존 파일이 있으면 덮어쓰기 하고, 없으면 생성한다.
			fos = new FileOutputStream(file); 
			bos = new BufferedOutputStream(fos); // 유식하게 Stream chain이라고 함. fos와 bos가 묶여있음
			
			// 기존 파일이 있으면 이어쓰기하고, 없으면 생성한다.
			// fos = new FileOutputStream(file, true);
			
			// 한글자쓰기
			bos.write(65); // A
			bos.write(97); // a
			
			// int이기 때문에 char를 사용할 수 있다. 
			bos.write('j'); 
			bos.write('a'); 
			bos.write('v'); 
			bos.write('a');
			
			// 자바에서 줄변경 13(Carriage return = CR = \r)이다.
			// 다른 언어 중에는 (\r\n(Line feed = 10)를 같이 사용하는 경우도 있다.)
			bos.write(13);
			
			// 배열을 이용해서 여러글자 쓰기
			byte[] b = {'H','I','J','A','V','A',13};
			bos.write(b);
			
			// String을 이용하자(영어외의 문자도 가능)
			String str = "Hello\r안녕\r123\r大韓";
			byte[] b2 = str.getBytes();
			bos.write(b2);
			
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close(); // 보통 bos먼저 풀고 fos 품
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	
	
	
	}
}