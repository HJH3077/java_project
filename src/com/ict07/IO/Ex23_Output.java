package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.Externalizable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// ����ȭ
public class Ex23_Output{
	public static void main(String[] args) {
		// ����ȭ : Ư�� Ŭ������ ��ü�� ����� Ȯ���ڸ� .ser�� ���� �����Ѵ�.
		// 			��ü���� ������ �ִ� ������ ����ȭ �Ǿ� �ִ�.(����� ������ ����� �� �� ����.)
		//															=> ������ ������ȭ �ʿ�
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
											+ File.separator + "ict07.ser";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// ��ü����ȭ�� �ϱ����� ��ü �����
			Ex23_VO vo = new Ex23_VO("�Ѹ�",28,67.3,true); 
			
			// ��ü ����ȭ = ��ȣȭ(encoding)
			oos.writeObject(vo);
			oos.flush();
			
			// ����ȭ�� .ser ������ ������
			// ������ȭ�ϱ� ������ ��� �о ���� ����
			
		} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
		
		
	}
}
