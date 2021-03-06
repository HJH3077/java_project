package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// 객체 역직렬화 : ObjectInputStream - readObject()
 
public class Ex25_Input {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
				+ File.separator + "ict09.ser";
		File file = new File(pathname);
	
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// 역직렬화
			ArrayList<Ex25_VO> list = (ArrayList<Ex25_VO>)ois.readObject();
			
			
			// 순위와 정렬을 생각해보자!
			// 정렬 - 컬렉션을 배열로 변경해서 정렬
			Ex25_VO[] arr = (Ex25_VO[]) list.toArray(new Ex25_VO[0]); // object배열로 바뀜 -> 그러니 형변환
			Ex25_VO tmp = new Ex25_VO();
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if(arr[i].getTotal() < arr[j].getTotal()) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
						
				}
			}
			
			// 정렬해서 출력
			System.out.println("이름\t총점\t평균\t학점");
			for (Ex25_VO k : arr) {
				System.out.print(k.getName()+"\t");
				System.out.print(k.getTotal()+"\t");
				System.out.print(k.getAvg()+"\t");
				System.out.println(k.getHak()+"\t");
			}
			
			/*
			System.out.println("이름\t총점\t평균\t학점");
			for (Ex25 k : list) {
				System.out.print(k.getName()+"\t");
				System.out.print(k.getTotal()+"\t");
				System.out.print(k.getAvg()+"\t");
				System.out.println(k.getHak()+"\t");
			}
			*/
			
		} catch (Exception e) {
			// System.out.println(e); 여기에 이걸 붙이면 무슨 오류인지 알 수 있음
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
