package com.ict07.IO;

import java.io.File;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) {
		// 작업할 특정 위치 지정에 파일 저장(존재하지 않는다.)
		String pathname = "C:" + File.separator + "study" + File.separator + "util" 
																+ File.separator + "io_test.txt";
		File file = new File(pathname);
		// 오류나면 무조건 try ~ catch ~
		try {
			boolean b1 = file.createNewFile();
			if(b1) {
				System.out.println("파일 생성 성공"); // 이렇게 하면 없던 io_test.txt 파일이 생긴다
			} else {
				System.out.println("파일 생성 실패(같은 이름이 있으면 실패)");
			}						// 즉, 한번 만들고 두번째 부터는 무조건 실패 같은 이름이 만들어 져있으므로
			
			pathname = "C:" + File.separator + "study" + File.separator + "util" 
					+ File.separator + "IO_test";
			
			File file2 = new File(pathname);
			boolean b2 = file2.mkdirs();
			if (b2) {
				System.out.println("디렉토리 생성 성공"); // 이렇게 하면 없던 IO_test 폴더가 생긴다
			} else {
				System.out.println("디렉토리 생성 실패");
			}
			
			// 디렉토리 삭제 (비어있어야 삭제가 가능)
			File file3 = new File(pathname);
			boolean b3 = file3.delete();
			if (b3) {
				System.out.println("디렉토리 삭제 성공"); // 실제로 비어있는 디렉토리가 삭제됨 
			} else {
				System.out.println("디렉토리 삭제 실패");
			}		
			
			// 파일 삭제
			pathname = "C:" + File.separator + "study" + File.separator + "util" 
					+ File.separator + "IO_test" + File.separator + "asdf.txt";
			File file4 = new File(pathname);
			boolean b4 = file4.delete();
			if (b4) {
				System.out.println("파일 삭제 성공"); // 실제로 만들어 둔 파일이 삭제됨.
			} else {
				System.out.println("파일 삭제 실패");
			}
			System.out.println();
			
			// 경로표시 (다 똑같이 표시된다.)
			pathname = "C:" + File.separator + "study" + File.separator + "util";
			File file5 = new File(pathname);
			System.out.println(file5.getAbsolutePath());
			System.out.println(file5.getCanonicalPath());
			System.out.println(file5.getPath());
					
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
