package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex16 {
	public static void main(String[] args) {
		// BufferedWriter : �ӵ������ ���� ���. �ٹٲٱ� �޼ҵ尡 �����Ѵ�.
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
														+ File.separator + "ict06.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// �ѱ��� ����
			bw.write(97); // a
			bw.write(65); // A
			bw.write(13);
			
			
			// int�̹Ƿ� char�� ��ü ����
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.write(13);
			// ���� ���� Ex05�� FileOutputStream�� ����
			
			bw.write('��'); // FileOutputStream�� �ѱ��� �ȵ����� FileWriter�� 
			bw.write('��');	// �����ڵ�� �ѱ۵� ����
			bw.write('��');
			bw.write('��');
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.write(13);		
			
			// byte[]�� �ƴ� char[]�� ��������!
			char[] c = {'k','o','r','e','a',13,'��','��','��','��',13};
			fw.write(c); // ������ Ex05�� ������ ���� ���� �̰� �� String���� ��
			
			bw.write("�ѱ�ICT���簳�߿�");
			bw.newLine(); // �� ���� �޼ҵ�
			bw.write("1������");
			bw.newLine(); // �� ���� �޼ҵ�
			bw.write("�ڹټ���");
			bw.newLine(); // �� ���� �޼ҵ�
			
			
			
			
			bw.flush();
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
