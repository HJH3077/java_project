package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex12 {
	public static void main(String[] args) {
		// C:\\study\\util\\java_2.jpg ������
		// C:\\study\\util\\res\\ �ȿ� �̵��ϴ� �ڵ�
		
		// �д� ��ġ�� ���� ��ġ�� �ٸ��Ƿ� 2���� ����
		// �д� ��ġ
		String pathname1 = "C:" + File.separator + "study" + File.separator + "util" 
												+ File.separator + "video.mp4";
		File read_file = new File(pathname1);
		
		// ���� ��ġ
		String pathname2 = "C:" + File.separator + "study" + File.separator + "util" 
				+ File.separator + "res" + File.separator + "video.mp4";
		File write_file = new File(pathname2);
		
		// ���� �о ����(�бⰡ ����)
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
			
			// ���ڿ� �޸� �׸�, �Ҹ�, ������ ���ϵ��� ó��(����, �̵�)�� ���� ������ 1byte�� ó���ؾ� �Ѵ�!
			int k = 0;
			// 1byte�б�
			while ( (k = bis.read())!= -1) {  
				// 1byte����
				bos.write(k);
			}
			bos.flush();
			
			
		} catch (Exception e) {
		} finally {
			try {
				bos.close(); // �а����� ������ ũ�� ��������� ���ۿ��� ��ġ�� �����ϸ� ��ų ��!
				fos.close();
				bis.close();
				fis.close();
				// ���� ����(�д� ����)�� ����
				// ���⿡ �ϴ� ������ ������ ���������� ������ �� ����.
				boolean b1 = read_file.delete();
				if(b1)
					System.out.println("��������");
				else
					System.out.println("��������");
			} catch (Exception e2) {
			}
		}
		
	}
}
