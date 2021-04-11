package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// ��ü ������ȭ : ObjectInputStream - readObject()
 
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
			
			// ������ȭ
			ArrayList<Ex25_VO> list = (ArrayList<Ex25_VO>)ois.readObject();
			
			
			// ������ ������ �����غ���!
			// ���� - �÷����� �迭�� �����ؼ� ����
			Ex25_VO[] arr = (Ex25_VO[]) list.toArray(new Ex25_VO[0]); // object�迭�� �ٲ� -> �׷��� ����ȯ
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
			
			// �����ؼ� ���
			System.out.println("�̸�\t����\t���\t����");
			for (Ex25_VO k : arr) {
				System.out.print(k.getName()+"\t");
				System.out.print(k.getTotal()+"\t");
				System.out.print(k.getAvg()+"\t");
				System.out.println(k.getHak()+"\t");
			}
			
			/*
			System.out.println("�̸�\t����\t���\t����");
			for (Ex25 k : list) {
				System.out.print(k.getName()+"\t");
				System.out.print(k.getTotal()+"\t");
				System.out.print(k.getAvg()+"\t");
				System.out.println(k.getHak()+"\t");
			}
			*/
			
		} catch (Exception e) {
			// System.out.println(e); ���⿡ �̰� ���̸� ���� �������� �� �� ����
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
