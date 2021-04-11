package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex12 {
	public static void main(String[] args) {
		// C:\\study\\util\\java_2.jpg 파일을
		// C:\\study\\util\\res\\ 안에 이동하는 코딩
		
		// 읽는 위치와 쓰는 위치가 다르므로 2개를 만듬
		// 읽는 위치
		String pathname1 = "C:" + File.separator + "study" + File.separator + "util" 
												+ File.separator + "video.mp4";
		File read_file = new File(pathname1);
		
		// 쓰는 위치
		String pathname2 = "C:" + File.separator + "study" + File.separator + "util" 
				+ File.separator + "res" + File.separator + "video.mp4";
		File write_file = new File(pathname2);
		
		// 먼저 읽어서 쓰기(읽기가 먼저)
		// InputStream
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		// OutputStream
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(read_file);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(write_file);
			bos = new BufferedOutputStream(fos);
			
			// 글자와 달리 그림, 소리, 동영상 파일들을 처리(복사, 이동)할 때는 무조건 1byte씩 처리해야 한다!
			int k = 0;
			// 1byte읽기
			while ( (k = bis.read())!= -1) {  
				// 1byte쓰기
				bos.write(k);
			}
			bos.flush();
			
			
		} catch (Exception e) {
		} finally {
			try {
				bos.close(); // 읽고쓰기의 순서는 크게 상관없지만 버퍼와의 위치는 웬만하면 지킬 것!
				fos.close();
				bis.close();
				fis.close();
				// 원본 파일(읽는 파일)을 삭제
				// 여기에 하는 이유는 파일이 열려있으면 삭제할 수 없다.
				boolean b1 = read_file.delete();
				if(b1)
					System.out.println("삭제성공");
				else
					System.out.println("삭제실패");
			} catch (Exception e2) {
			}
		}
		
	}
}
