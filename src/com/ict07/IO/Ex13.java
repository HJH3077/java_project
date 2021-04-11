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
		// DataOuputStream 과 DataInputStream
		// 기본자료형을 주고 받을 때 사용(기본자료형을 읽고 쓰는 메소드가 별도로 존재)
		// FileInputStream, FileOutputStream과의 차이는 2진 데이터(0,1)를 입출력할 때 사용한다.
		// 하지만 기본적으로는 비슷하다.
		// => 그래서 타 시스템과 입출력할 때 유리하다.
		// ** 입력순서와 출력순서가 다르면 데이터의 결과가 달라질 수 있다.
		// BufferedInputStream, BufferedOutputStreamd 을 활용할 수 있다.
		
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
			bos = new BufferedOutputStream(fos); // 버퍼가 중간에 있어야함. file - buffer - data로 
			dos = new DataOutputStream(bos);
			
			// 쓰는 메소드 : writeXXX (XXX란 기본자료형을 의미) 
			dos.writeLong(126L);
			dos.writeBoolean(true);
			dos.writeFloat(3.14f);
			dos.writeInt(256);
			dos.writeDouble(236.41);
			dos.writeChar('A');
			// 0,1로 이루어져 있어서 메모장으로 열어도 읽을 수가 없다.
			dos.flush();
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis); // 버퍼가 중간에 있어야함. file - buffer - data로 
			dis = new DataInputStream(bis);
			
			// 읽는 메소드 : readXXX (XXX는 기본자료형을 의미)
			System.out.println(dis.readLong());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			// java 결과창으로는 읽힌다. 하지만 순서가 바뀌면 데이터의 결과가 크게 달라진다.
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
		
		// 파일로 저장할 때 쓰는 것 보다는 다른 시스템과 데이터를 입/출력할 때 주로 사용
		
		
	}
}
