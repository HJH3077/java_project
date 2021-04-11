package com.ict07.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		// 1. FileOutputStream : ������ ������� 1byte�� ������ ���⸦ �� �� �ִ� ��Ʈ��
		// - ������ : FileOutputStream(File file), FileOutputStream(File file, boolean
		// append)
		// FileOutputStream(String name), FileOutputStream(String name, boolean append)
		// File file, String name => Ư����ġ + �����̸�
		// boolean append : false or ������ �ϸ� �����, true�ϸ� �̾��
		// - �ֿ�޼ҵ�
		// write (byte[] b) : �������ڸ� byte[]�� �־ ���� ����
		// flush() : ����� ���� ����� ��ɾ� ,write �� �ݵ�� ��������
		// close() : open�� ��Ʈ�� �ݱ�(����� �ݱ�), ���� finally�� ó�� => �������� �� �ݾƾ���!

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict01.txt";
		FileOutputStream fos = null;
		File file = new File(pathname); // ���� ����
		try {
			// ���� ������ ������ ����� �ϰ�, ������ �����Ѵ�.
			fos = new FileOutputStream(file); // ������ ������ ict01.txt�� ����
			
			// ���� ������ ������ �̾���ϰ�, ������ �����Ѵ�.
			// fos = new FileOutputStream(file, true);
			
			// �ѱ��ھ���
			fos.write(65); // A
			fos.write(97); // a
			
			// int�̱� ������ char�� ����� �� �ִ�. 
			fos.write('j'); 
			fos.write('a'); 
			fos.write('v'); 
			fos.write('a');
			
			// �ڹٿ��� �ٺ��� 13(Carriage return = CR = \r)�̴�.
			// �ٸ� ��� �߿��� (\r\n(Line feed = 10)�� ���� ����ϴ� ��쵵 �ִ�.)
			fos.write(13);
			
			// �迭�� �̿��ؼ� �������� ����
			byte[] b = {'b','o','y','s',13,'g','i','r','l','s'};
			fos.write(b);
			
			// String�� �̿�����(������� ���ڵ� ����)
			String str = "Hello\r�ȳ�\r123\r����";
			byte[] b2 = str.getBytes();
			fos.write(b2);
			
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	

	
	
	}
}