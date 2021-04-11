package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 {
	public static void main(String[] args) {
		// File 클래스를 사용하기 전에 특정 위치를 지정해야한다. (특정위치 = 경로)
		String pathname_1 = "C:\\study\\util"; // 운영체제가 Windows인 경우 사용하는 방법
		String pathname_2 = "C:/study/util"; // 운영체제가 Linux인 경우 사용하는 방법
		// 운영체제에 따라 달리지는 점 = 종속적, java는 객체 지향적 독립을 선호함
		
		// 운영체제와 상관없이 사용하는 방법(리눅스, 윈도우 모두 가능)
		String pathname_3 = "C:" + File.separator + "study" + File.separator + "util";
		// separator가 \\ , / 를 대신하는 것
		
		File file = new File(pathname_3);
		String[] arr = file.list(); // String 배열을 특정 위치에 담는다
									// 즉, util안의 내용을 arr에 담는다
		for (String k : arr) {
			// System.out.println(k);
			File file2 = new File(pathname_3, k); // pathname_3이 부모, k가 자식
			System.out.println(file2); // 파일 이름 나오기 전까지가 부모경로 파일이름이 자식
									   // = 절대 경로가 출력됨
			
			// 컴퓨터에 저장할 수 있는 종류는 디렉토리와 파일 밖에 없다.
			// 디렉토리는 크기가 존재하지 않음.
			
			// 수정날짜 형식지정
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
			
			if(file2.isDirectory()) {		// 원래 lastModified하면 초로만 쭉나옴 그래서 이런 방법으로 지정
				System.out.println("디렉토리 : " + file2 + "\n수정한 날짜 : " + sdf.format(file2.lastModified()));
			} else {
				System.out.println("파일 : " + file2 + "\n크기 : " + (int)(file2.length()/1024) + "KB" 
						+ "\n수정한 날짜 : "  + sdf.format(file2.lastModified()));
			}
		}
		
		
	}
}
