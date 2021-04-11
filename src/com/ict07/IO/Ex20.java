package com.ict07.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		// ����Ʈ-���� ���� : ü�ι��
		// �Է� : InputStreamReader = InputStream -> Reader
		// ���� : InputSream -> InputStreamReader(��������) -> Reader -> BufferedReader
		// ��谡 ���°� ����� ���� �ٲ۴���?
		
		/*
		Scanner scan = new Scanner(System.in); // System.in = Ű���� = ���
		System.out.print("���ϴ� ���� �Է� : ");
		String msg = scan.next();
		System.out.println("���� ���� : " + msg); // ��� -> ����� ���Բ�
		*/
		
		System.out.print("���ϴ� ���� �Է� : ");
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine(); // ���پ� �б�
			System.out.println("���� ���� : " + msg); // scanneró����.
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
		
	}
}
