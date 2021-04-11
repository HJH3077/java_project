package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex09 {
	public static void main(String[] args) {
		// c:\\study\\util\\text100.txt 파일 안에
		// 이름 : 000
		// 나이 : 00
		// 전화번호 : 000-0000-0000를
		// 작성하는 코딩을 하시오(파일에 쓰)
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
													+ File.separator + "text100.txt";
		
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String msg = "이름 : 황준혁\n나이 : 26\n전화번호 : 010-3077-2684";
			byte[] b = msg.getBytes();
			bos.write(b);
			bos.flush();
		} catch (Exception e) {
			// System.out.println(e); 이걸 하면 백지오류가 뜰 시 무슨 오류인지 확인가능
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {	
			}
		}
		
		
		
		
	}
}
