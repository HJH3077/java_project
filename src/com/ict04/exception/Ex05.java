package com.ict04.exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {//throws NumberFormatException 	// �̷��� JVM���� ���ѱ� ��
		// throws (���� �絵, ���� ����)
		// - ���ܰ� �߻��ϸ� ����ó���� ���� �ʰ�, �ڽ��� ȣ���� ������ ���� ��ü�� �����ϴ� ��
		// - ���߿��� ����ó��(try ~ catch)�� �ϴ� ���� ����.
		Ex05 test = new Ex05();
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("���� �Է� : ");
			String msg = scan.next();
			test.setData(msg);			
		} catch (Exception e) {
			System.out.println("ù ���ڴ� ���ڷ� �Է��ϼ���.");
		}
		 // �޼ҵ��ε� ���𰡿� �����ϴ°� �ƴϹǷ� void
						   // ���ڰ� �����Ƿ� �޼ҵ忡�� ���ڰ� �ʿ���
		
	}
	public void setData(String msg) throws NumberFormatException {
		if(msg.length()>=1) { // msg�� 1���� �̻��̸� ���� ��, 0�̸� ���� �����Ƿ� ���� x
			String str = msg.substring(0, 1); // 0�̻� 1�̸��� �ִ� �ε����� ���ڸ� ���� -> ��, ù���ڸ� ����
			prnData(str); // �޼ҵ尡 ������ ���� ȣ���ϹǷ� ���⼭�� ��ü �����̳� ȣ���� �� ���ص���!
		}
	}	
	
	public void prnData(String str) throws NumberFormatException {
	//	try {
			int dan = Integer.parseInt(str);
			System.out.println(dan + "��");
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
	//	} catch (Exception e) {
	//		System.out.println("ù ���ڴ� ���ڷ� �Է��ϼ���.");
	//	}
			
	// ������ ���⼭ try catch�� ��Ƶ� ������ throws�� ���� �߸� �� ������ ���ѱ�� ������ �� ����.
	}
	
}
