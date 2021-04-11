package com.ict07.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex18 {
	public static void main(String[] args) {
		// BufferedReader : 속도향상을 위해서 사용, 한줄 씩 읽는 메소드가 존재
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
												+ File.separator + "ict06.txt";
		File file = new File(pathname);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			// 한글자 읽기
			// int k = br.read();
			// System.out.println((char)(k));
			
			/*
			// 전체 읽기 (영상, 소리 등을 읽거나, 파일 전체를 불러올 때 사용)
			int k = 0;
			while ((k = br.read()) != -1) {
				System.out.print((char)(k));
			}
			*/
			
			/*
			// char[] 이용 (파일 전체 읽기 사용)
			char[] c = new char[(int)(file.length())];
			br.read(c);
			for (char k : c) {
				System.out.print(k);
			}
		    */
			
			/*
			// String 이용
			char[] c = new char[(int)(file.length())];
			br.read(c);
			String msg = new String(c);
			System.out.println(c);
			*/
			
			// 한줄 읽기
			// String msg = br.readLine(); // 첫줄 읽음
			// System.out.println(msg);
			
			// 한줄 읽기를 이용해서 모두 읽기
			String msg = null;
			//StringBuffer는 String이 새로 생기지 않고 있는 것을 수정해서 쓰기 때문에 메모리 낭비를 줄여줌
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());
			
		} catch (Exception e) {
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
	}
}
