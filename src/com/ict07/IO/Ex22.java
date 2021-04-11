package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex22 {
	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in); // System.in = Ű���� = ���
		System.out.print("���ϴ� ���� �Է� : ");
		String msg = scan.next();
		System.out.println("���� ���� : " + msg); // ��� -> ����� ���Բ�
		*/
		// ���� ���� InputStreamReader�� OutputStreamWriter�� �̿��ؼ� �ۼ��Ͻÿ�.
		
		// Ű���带 ���� �Է�
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		// ����Ϳ� ���
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			
			// �Է�
			bw.write("���ϴ� ���� �Է� : ");
			bw.flush();
			String msg = br.readLine();
			
			// ���
			bw.write("���� ���ڴ� : ");
			bw.write(msg);
			bw.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				isr.close();
				bw.close();
				osw.close();
			} catch (Exception e2) {
			}
		}
		
		
	}
}