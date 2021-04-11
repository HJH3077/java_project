package com.ict08.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex02 {
	public static void main(String[] args) {
		// URL Ŭ���� : URL(Uniform Resource Locator) - ���� ������ �ڿ��� �ּҸ� ���Ѵ�.
		//				final Ŭ�����̱� ������ ����� �Ұ���.
		
		InputStream is = null; // ������ �ƴ� ��ǻ�ʹϱ� �׳� InputStream
							   // �д°� ������ ���� �а� ���°� �� ��ǻ�Ϳ� ���Ƿ�
		InputStreamReader isr = null; // �����ε� ���ڷ� ������
		BufferedReader br = null; // �ӵ����
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
											+ File.separator + "���̹���ȭ.txt";
		File file = new File(pathname);
		FileWriter fw = null; // ���Ͽ� ���ϱ� FileWriter
		BufferedWriter bw = null;
		
		try {
			// ���� �� �������� ����
			URL url = new URL("https://www.kma.go.kr/XML/weather/sfc_web_map.xml"); // �����ּ�
			is = url.openStream(); // ����, ������Ʈ ���� �б�
			isr = new InputStreamReader(is, "utf-8"); // ���⼭ ���� ������ �ѱ� ó���� ������ȭ
													  // utf-8�� �ѱ�ó���� �ǹ���
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer(); // String�� ��� ������Ű�� �޸𸮰� �Ҹ�ǹǷ�
												  // �ִ� ���� ������Ű�� ����
			while((msg =br.readLine())!= null) {
				sb.append(msg+"\n"); // ��� ���پ� sb�� �߰���
			}
			
			// System.out.println(sb.toString());
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString()); // "sb.toString�� ���� file�� ���" ��� �ǹ�
			bw.flush();
			
			
		} catch (Exception e) {
			System.out.println(e); // Ȥ�� ���������
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
			System.out.println(e2);
			}
		}
	}
}
