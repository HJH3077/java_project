package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		// 복사 장소와 파일명을 받고
		// 붙이기 장소와 파일명을 받아서 붙이기 하자
		Scanner scan = new Scanner(System.in);
		System.out.print("복사 장소를 입력하세요 : ");
		String a = scan.next();
		System.out.print("복사할 파일명을 입력하세요 : ");
		String b = scan.next();
		System.out.print("붙여넣기할 장소를 입력하세요 : ");
		String c = scan.next();
		System.out.print("붙여넣기할 파일명을 입력하세요 : ");
		String d = scan.next();

		// 읽는 위치
		String copyplace = a;
		String copyfile = b;
		String copy = a + File.separator + b;
		File rfile = new File(copy);

		// 쓰는 위치
		String stickplace = c;
		String stickfile = d;
		String stick = c + File.separator + d;
		File wfile = new File(stick);

		// 먼저 읽어서 쓰기
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			// 읽기 + 화면에 쓰기
			fr = new FileReader(rfile);
			br = new BufferedReader(fr);
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());
			
			// 파일에 쓰기
			fw = new FileWriter(wfile);
			bw = new BufferedWriter(fw);
			
			// 치환하기
			String str = sb.toString();
			str = str.replace("대한민국", "大韓民國");
			// bw.write(sb.toString());
			bw.write(str);
			bw.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
	}
}
