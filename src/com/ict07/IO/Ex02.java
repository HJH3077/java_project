package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 {
	public static void main(String[] args) {
		// File Ŭ������ ����ϱ� ���� Ư�� ��ġ�� �����ؾ��Ѵ�. (Ư����ġ = ���)
		String pathname_1 = "C:\\study\\util"; // �ü���� Windows�� ��� ����ϴ� ���
		String pathname_2 = "C:/study/util"; // �ü���� Linux�� ��� ����ϴ� ���
		// �ü���� ���� �޸����� �� = ������, java�� ��ü ������ ������ ��ȣ��
		
		// �ü���� ������� ����ϴ� ���(������, ������ ��� ����)
		String pathname_3 = "C:" + File.separator + "study" + File.separator + "util";
		// separator�� \\ , / �� ����ϴ� ��
		
		File file = new File(pathname_3);
		String[] arr = file.list(); // String �迭�� Ư�� ��ġ�� ��´�
									// ��, util���� ������ arr�� ��´�
		for (String k : arr) {
			// System.out.println(k);
			File file2 = new File(pathname_3, k); // pathname_3�� �θ�, k�� �ڽ�
			System.out.println(file2); // ���� �̸� ������ �������� �θ��� �����̸��� �ڽ�
									   // = ���� ��ΰ� ��µ�
			
			// ��ǻ�Ϳ� ������ �� �ִ� ������ ���丮�� ���� �ۿ� ����.
			// ���丮�� ũ�Ⱑ �������� ����.
			
			// ������¥ ��������
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
			
			if(file2.isDirectory()) {		// ���� lastModified�ϸ� �ʷθ� �߳��� �׷��� �̷� ������� ����
				System.out.println("���丮 : " + file2 + "\n������ ��¥ : " + sdf.format(file2.lastModified()));
			} else {
				System.out.println("���� : " + file2 + "\nũ�� : " + (int)(file2.length()/1024) + "KB" 
						+ "\n������ ��¥ : "  + sdf.format(file2.lastModified()));
			}
		}
		
		
	}
}
