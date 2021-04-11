package com.ict08.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {
	public static void main(String[] args) {
		// InetAddress : �ڹٿ��� IP�ּҸ� ǥ���ϴ� Ŭ����
		//				 �����ڰ� ���������� ������� �ʴ´�.
		//				 6���� static �޼ҵ带 �̿��Ѵ�.
		//		** Localhost : ���� ���� ����ϰ� �ִ� ��ǻ��
		
		// IO���ķδ� ���Ǵ� try ~ catch ~ �����.
		// host = ���� �ִ� ���
		// �������� IP�ּҸ� �˱� ���� �������� ǥ���� ��
		// �װ��� �����γ��ӽý��� DMS�� �̸� ü�踦 ���� ����
		// .net, .com, .org / www, http ��
		
		try { 
			InetAddress addr = InetAddress.getByName("www.naver.com"); // address�̸� ����
			// �̰����� ���� ������ 223.130.195.95�� �Է��ؾ� ���̹��� ������ www.naver.com�� �� �� �ְԵ�.
			System.out.println("�̸� : " + addr.getHostName());
			System.out.println("�ּ� : " + addr.getHostAddress()); 
			System.out.println("toString : " + addr.toString());
			System.out.println("===============================================");
			
			
			// �� ��ǻ�Ϳ� ���� ����
			addr = InetAddress.getLocalHost();
			System.out.println("�̸� : " + addr.getHostName());
			System.out.println("�ּ� : " + addr.getHostAddress()); 
			System.out.println("toString : " + addr.toString());
			System.out.println("===============================================");
			
			InetAddress[] addrs = InetAddress.getAllByName("m.naver.com");
			for (InetAddress k : addrs) {
				System.out.println("�̸� : " + k.getHostName());
				System.out.println("�ּ� : " + k.getHostAddress()); 
				System.out.println("toString : " + k.toString());
			}
			System.out.println("===============================================");
			
			// 125.209.222.137
			byte[] b = {125, (byte)209, (byte)222, (byte)137};
			addr = InetAddress.getByAddress(b);
			System.out.println("�̸� : " + addr.getHostName());
			System.out.println("�ּ� : " + addr.getHostAddress()); 
			System.out.println("toString : " + addr.toString());
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
		
		
		
		
		
	}
}
