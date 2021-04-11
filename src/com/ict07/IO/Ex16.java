package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex16 {
	public static void main(String[] args) {
		// BufferedWriter : 속도향상을 위해 사용. 줄바꾸기 메소드가 존재한다.
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
														+ File.separator + "ict06.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// 한글자 쓰기
			bw.write(97); // a
			bw.write(65); // A
			bw.write(13);
			
			
			// int이므로 char로 대체 가능
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.write(13);
			// 여기 까진 Ex05인 FileOutputStream과 동일
			
			bw.write('대'); // FileOutputStream은 한글이 안되지만 FileWriter는 
			bw.write('한');	// 유니코드라 한글도 가능
			bw.write('민');
			bw.write('국');
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.write(13);		
			
			// byte[]이 아닌 char[]이 가능해짐!
			char[] c = {'k','o','r','e','a',13,'대','한','민','국',13};
			fw.write(c); // 하지만 Ex05와 동일한 점이 누가 이거 씀 String쓰지 ㅋ
			
			bw.write("한국ICT인재개발원");
			bw.newLine(); // 줄 변경 메소드
			bw.write("1강의장");
			bw.newLine(); // 줄 변경 메소드
			bw.write("자바수업");
			bw.newLine(); // 줄 변경 메소드
			
			
			
			
			bw.flush();
		} catch (Exception e) {
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
		

		// FileInputStream(바이트) : 1byte처리, write(int b), write(byte[]) - 숫자(아스키코드)
		
	}
}
