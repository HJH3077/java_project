package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.Externalizable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// 직렬화
public class Ex23_Output{
	public static void main(String[] args) {
		// 직렬화 : 특정 클래스를 객체로 만들어 확장자를 .ser로 만들어서 저장한다.
		// 			객체들이 가지고 있는 내용이 직렬화 되어 있다.(사람은 정보를 제대로 볼 수 없다.)
		//															=> 보려면 역직렬화 필요
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
											+ File.separator + "ict07.ser";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 객체직렬화를 하기위해 객체 만들기
			Ex23_VO vo = new Ex23_VO("둘리",28,67.3,true); 
			
			// 객체 직렬화 = 암호화(encoding)
			oos.writeObject(vo);
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
