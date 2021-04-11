package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex09 {
	public static void main(String[] args) {
		// c:\\study\\util\\text100.txt ���� �ȿ�
		// �̸� : 000
		// ���� : 00
		// ��ȭ��ȣ : 000-0000-0000��
		// �ۼ��ϴ� �ڵ��� �Ͻÿ�(���Ͽ� ��)
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
													+ File.separator + "text100.txt";
		
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String msg = "�̸� : Ȳ����\n���� : 26\n��ȭ��ȣ : 010-3077-2684";
			byte[] b = msg.getBytes();
			bos.write(b);
			bos.flush();
		} catch (Exception e) {
			// System.out.println(e); �̰� �ϸ� ���������� �� �� ���� �������� Ȯ�ΰ���
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {	
			}
		}
		
		
		
		
	}
}
