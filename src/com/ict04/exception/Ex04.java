package com.ict04.exception;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// finally : ����ó���� ������� �ݵ�� �����ؾ� �Ǵ� ������
		//			 ó���� �� ���(�����ͺ��̽�, ��/���, ��Ʈ��ũ���� �ַ� ���)
		// ���� : try ~ catch ~ finally
		
		Scanner scan = new Scanner(System.in);
		
		try {	
			int var = 27;
			System.out.print("���� �Է� : ");
			int su = scan.nextInt();
			System.out.println("���� : " + (var / su));
		//	return ; // �޼ҵ带 ȣ���� ������ ���ư��°� return�ε� �� �� ���𰡸� �������� 
					 // return�� ���� ���� �ƹ��͵� �Ȱ������� void�̴�.
		} catch (Exception e) { 
			System.out.println("����� �Է��ϼ��� : " + e); 
			return ; // �ᱹ ���� �ǹǷ� �����ϼ̽��ϴ� �κ��� �ʿ� �������� �����߻�
					 // �����ϼ̽��ϴ� �κ��� ���ֵ簡 try�� return�� ���ּ� ����ǰ� ������ ��������
		} finally {
			System.out.println("�ݵ�� �����ؾ� �� ����");
		}
		
		System.out.println("�����ϼ̽��ϴ�.");
		
		// ��, �̷��� ���� return���� JVM���� ���ư��� ������ "���� : " ���� �� "�����ϼ̽��ϴ�"�� �Ȱ���
		// ���ư��µ� finally�� ������ �����̶� finally�� ����� ��Ȳ.
		
		
		
		
		
		
		
		
	}
}
