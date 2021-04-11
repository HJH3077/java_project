package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex25_Output {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// 직렬화
		String pathname = "C://study//util//ict09.ser";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			ArrayList<Ex25_VO> list = new ArrayList<Ex25_VO>(); // while에 쓰면 계속 새로운 array를 만들기 때문에
														  // 꺼내서 생성시킴
			esc : 
			while (true) {
				System.out.println("정보를 입력하세요");
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("국어 : ");
				int kor = scan.nextInt();
				System.out.print("영어 : ");
				int eng = scan.nextInt();
				System.out.print("수학 : ");
				int math = scan.nextInt();
				
				Ex25_VO vo = new Ex25_VO(name, kor, eng, math); // 생성자에서 계산을 끝냄
				list.add(vo); // *** 객체가 new Ex25 이므로 객체가 계속 생성된게 list에 담김
				while (true) {
					System.out.println("계속할까요? (y/n) >>  ");
					String msg = scan.next();
					if(msg.equalsIgnoreCase("y")) { // String은 == 로 비교가 아닌 equlsIgnoreCase 사용!
						continue esc;
					} else if(msg.equalsIgnoreCase("n")) {
						break esc;
					} else {
						continue;
					}
				}
			}
			
			// 객체 직렬화
			oos.writeObject(list);
			oos.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
	}
}
