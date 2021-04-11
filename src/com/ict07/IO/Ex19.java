package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		// ���� ��ҿ� ���ϸ��� �ް�
		// ���̱� ��ҿ� ���ϸ��� �޾Ƽ� ���̱� ����
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ��Ҹ� �Է��ϼ��� : ");
		String a = scan.next();
		System.out.print("������ ���ϸ��� �Է��ϼ��� : ");
		String b = scan.next();
		System.out.print("�ٿ��ֱ��� ��Ҹ� �Է��ϼ��� : ");
		String c = scan.next();
		System.out.print("�ٿ��ֱ��� ���ϸ��� �Է��ϼ��� : ");
		String d = scan.next();

		// �д� ��ġ
		String copyplace = a;
		String copyfile = b;
		String copy = a + File.separator + b;
		File rfile = new File(copy);

		// ���� ��ġ
		String stickplace = c;
		String stickfile = d;
		String stick = c + File.separator + d;
		File wfile = new File(stick);

		// ���� �о ����
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			// �б� + ȭ�鿡 ����
			fr = new FileReader(rfile);
			br = new BufferedReader(fr);
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());
			
			// ���Ͽ� ����
			fw = new FileWriter(wfile);
			bw = new BufferedWriter(fw);
			
			// ġȯ�ϱ�
			String str = sb.toString();
			str = str.replace("���ѹα�", "��������");
			// bw.write(sb.toString());
			bw.write(str);
			bw.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
	}
}
