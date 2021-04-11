package com.ict07.IO;

import java.io.File;
import java.io.FileWriter;

public class Ex15 {
	public static void main(String[] args) {
		// 문자스트림(사람중심) : 모든 처리를 2byte씩 처리
		// 대상 : 전 세계의 모든 언어로 구성된 문서파일들
		// 최상위 클래스 : Reader(입력), Writer(출력)
		
		// FileOnputStream(바이트) : 1byte처리, write(int b), write(byte[]) - 숫자(아스키코드)
		// FileWriter(문자) : 2byte 처리, write(int b), write(char[]), write(String str) - 유니코드
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
														+ File.separator + "ict05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			
			// 한글자 쓰기
			fw.write(97); // a
			fw.write(65); // A
			fw.write(13);
			
			
			// int이므로 char로 대체 가능
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write(13);
			// 여기 까진 Ex05인 FileOutputStream과 동일
			
			fw.write('대'); // FileOutputStream은 한글이 안되지만 FileWriter는 
			fw.write('한');	// 유니코드라 한글도 가능
			fw.write('민');
			fw.write('국');
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write(13);		
			
			// byte[]이 아닌 char[]이 가능해짐!
			char[] c = {'k','o','r','e','a',13,'대','한','민','국',13};
			fw.write(c); // 하지만 Ex05와 동일한 점이 누가 이거 씀 String쓰지 ㅋ
			
			fw.write("한국ICT인재개발원\n");
			fw.write("1강의장\n");
			fw.write("자바수업\n");
			
			
			
			
			fw.flush();
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
