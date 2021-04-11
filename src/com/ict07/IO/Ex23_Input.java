package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

// 객체 역직렬화 : ObjectInputStream - readObject()
 
public class Ex23_Input {
	public static void main(String[] args) {
		// 객체 역직렬화 : 직렬화된 파일이나 정보를 원래 내용이로 복원하는 역할
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
				+ File.separator + "ict07.ser";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// 역직렬화 : 원래 객체로 되돌아 간다. = 복호화(decoding)
			Ex23_VO vo = (Ex23_VO)ois.readObject();
			
			System.out.println(vo.getName());
			System.out.println(vo.getAge());
			System.out.println(vo.getWeight());
			System.out.println(vo.isGender());
			
			// 직렬화 이유 : class를 collection에 넣는데 다른 곳에 보내고 싶어서 직렬화로 변환 후 전송
			//				 보안, 속도 등의 이유(객체 단위로 보내야 효율이 높아서)
		} catch (Exception e) {
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
		
		
	}
}
