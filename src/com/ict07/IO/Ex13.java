package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex13 {
	public static void main(String[] args) {
		// DataOuputStream �� DataInputStream
		// �⺻�ڷ����� �ְ� ���� �� ���(�⺻�ڷ����� �а� ���� �޼ҵ尡 ������ ����)
		// FileInputStream, FileOutputStream���� ���̴� 2�� ������(0,1)�� ������� �� ����Ѵ�.
		// ������ �⺻�����δ� ����ϴ�.
		// => �׷��� Ÿ �ý��۰� ������� �� �����ϴ�.
		// ** �Է¼����� ��¼����� �ٸ��� �������� ����� �޶��� �� �ִ�.
		// BufferedInputStream, BufferedOutputStreamd �� Ȱ���� �� �ִ�.
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util" 
							+ File.separator + "ict03.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos); // ���۰� �߰��� �־����. file - buffer - data�� 
			dos = new DataOutputStream(bos);
			
			// ���� �޼ҵ� : writeXXX (XXX�� �⺻�ڷ����� �ǹ�) 
			dos.writeLong(126L);
			dos.writeBoolean(true);
			dos.writeFloat(3.14f);
			dos.writeInt(256);
			dos.writeDouble(236.41);
			dos.writeChar('A');
			// 0,1�� �̷���� �־ �޸������� ��� ���� ���� ����.
			dos.flush();
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis); // ���۰� �߰��� �־����. file - buffer - data�� 
			dis = new DataInputStream(bis);
			
			// �д� �޼ҵ� : readXXX (XXX�� �⺻�ڷ����� �ǹ�)
			System.out.println(dis.readLong());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			// java ���â���δ� ������. ������ ������ �ٲ�� �������� ����� ũ�� �޶�����.
		} catch (Exception e) {
		} finally {
			try {
				dis.close();
				bis.close();
				fis.close();
				dos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
		// ���Ϸ� ������ �� ���� �� ���ٴ� �ٸ� �ý��۰� �����͸� ��/����� �� �ַ� ���
		
		
	}
}
