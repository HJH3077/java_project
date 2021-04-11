package com.ict07.IO;

import java.io.File;
import java.io.FileWriter;

public class Ex15 {
	public static void main(String[] args) {
		// ���ڽ�Ʈ��(����߽�) : ��� ó���� 2byte�� ó��
		// ��� : �� ������ ��� ���� ������ �������ϵ�
		// �ֻ��� Ŭ���� : Reader(�Է�), Writer(���)
		
		// FileOnputStream(����Ʈ) : 1byteó��, write(int b), write(byte[]) - ����(�ƽ�Ű�ڵ�)
		// FileWriter(����) : 2byte ó��, write(int b), write(char[]), write(String str) - �����ڵ�
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
														+ File.separator + "ict05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			
			// �ѱ��� ����
			fw.write(97); // a
			fw.write(65); // A
			fw.write(13);
			
			
			// int�̹Ƿ� char�� ��ü ����
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write(13);
			// ���� ���� Ex05�� FileOutputStream�� ����
			
			fw.write('��'); // FileOutputStream�� �ѱ��� �ȵ����� FileWriter�� 
			fw.write('��');	// �����ڵ�� �ѱ۵� ����
			fw.write('��');
			fw.write('��');
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write(13);		
			
			// byte[]�� �ƴ� char[]�� ��������!
			char[] c = {'k','o','r','e','a',13,'��','��','��','��',13};
			fw.write(c); // ������ Ex05�� ������ ���� ���� �̰� �� String���� ��
			
			fw.write("�ѱ�ICT���簳�߿�\n");
			fw.write("1������\n");
			fw.write("�ڹټ���\n");
			
			
			
			
			fw.flush();
		} catch (Exception e) {
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
		

		// FileInputStream(����Ʈ) : 1byteó��, write(int b), write(byte[]) - ����(�ƽ�Ű�ڵ�)
		
	}
}
