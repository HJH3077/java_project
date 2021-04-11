package com.ict07.IO;

import java.io.File;
import java.io.FileReader;

public class Ex17 {
	public static void main(String[] args) {
		// FileInputStream : 1byte처리, read() - int(아스키) => char형변환 (대소문자, 숫자만 가능)
		// 					 read(byte[] b), String 이용
		// FileReader : read() - int(유니코드) => char형변환 (전 세계문자 처리 가능)
		//				read(char[] b), String 이용
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
												+ File.separator + "ict06.txt";
		File file = new File(pathname);
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
			// 한글자 읽기
			// int k = fr.read();
			// System.out.println(k + ":" + (char)(k)); // 한글 읽기 가능
			
			/*
			// 전체 읽기 (영상, 소리 등을 읽거나, 파일 전체를 불러올 때 사용)
			int k = 0;
			while ((k = fr.read()) != -1) {
				System.out.print((char)(k));
			}
			*/
			
			/*
			// char[] 이용 (파일 전체 읽기 사용)
			char[] c = new char[(int)(file.length())];
			fr.read(c);
			for (char k : c) {
				System.out.print(k);
			}
		    */
			
			// String 이용
			char[] c = new char[(int)(file.length())];
			fr.read(c);
			String msg = new String(c);
			System.out.println(c);
			
			
		} catch (Exception e) {
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
	}
}
