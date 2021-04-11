package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.Externalizable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// 직렬화
public class Ex24_Output{
	public static void main(String[] args) {
		// 직렬화 : 특정 클래스를 객체로 만들어 확장자를 .ser로 만들어서 저장한다.
		// 			객체들이 가지고 있는 내용이 직렬화 되어 있다.(사람은 정보를 제대로 볼 수 없다.)
		//															=> 보려면 역직렬화 필요
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
											+ File.separator + "ict08.ser";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 객체직렬화를 하기위해 객체 만들기
			Ex24_VO vo1 = new Ex24_VO("고길동", 34, 77.3, true);
			Ex24_VO vo2 = new Ex24_VO("마이콜", 19, 59.7, true);
			Ex24_VO vo3 = new Ex24_VO("희동이", 2, 13.2, false);
			Ex24_VO vo4 = new Ex24_VO("도우너", 17, 24.3, true);
			Ex24_VO vo5 = new Ex24_VO("또치", 24, 34.5, false);
			
			// 객체는 배열이나 컬렉션에 담을 수 있다.
			ArrayList<Ex24_VO> list = new ArrayList<Ex24_VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			
			// 객체 직렬화
			oos.writeObject(list);
			oos.flush();
			
			// 직렬화로 .ser 파일이 생성됨
			// 역직렬화하기 전까지 열어도 읽어볼 수는 없음
			
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
