package com.ict03.class01;

public class Ex02_main {
	public static void main(String[] args) {
		// static�� ��ü ������ ������� �̸� ���������.
		// ȣ���� Ŭ�����̸�.�޼ҵ�, Ŭ�����̸�.���� 
		/*  
		System.out.println(test.k1); test���� ���� ���� �翬�� ����
		System.out.println(test.k2);
		System.out.println(test.K3);
		System.out.println(test.K4);
		*/
		 
		// System.out.println(Ex02.k1); // �ν��Ͻ�
		System.out.println(Ex02.k2); // static�̹Ƿ� ��ü �������� �̹� �����������. static�׸�(��ü)�� �̹� �׷�������
									 // test�� ��ü�� ����� static�� ���� ������� static�� �ּҸ� �������� ����. �ν��Ͻ��� �����
		// System.out.println(Ex02.K3); // �ν��Ͻ�
		System.out.println(Ex02.K4); 
		
		// ��ȯ���� ���� �޴� ����� �޶�����.
		// void�� ������ �Ѿ���� �ʴ´�. 
		// Ex. ���� Ȯ�� �� S���ִ°� static, F�� final
		Ex02.prn02(); // prn02 �� �ִ� ������� �����.
		
		// void�� �ƴϸ� �ݵ�� ��ȯ���� ���缭 ��������.
		double su1 = Ex02.prn04(); // prn04�� �ִ� ������� ����ǰ� ��ȯ�� ���� su1�� �����.
		System.out.println(su1);
		
		System.out.println("============ ��ü ���� ���� ============");
		
		// *********** �ν��Ͻ��� new�� ��ü�� ��������� ������ �� �� �ִ� �� ***************
		// ���� ���� Ex02 class�� ������ �� ����
		// 1. Ex02 Ŭ������ ����ϱ� ���ؼ� Ŭ������ ��ü�� ������
		// ��� : Ŭ���� �������� = new ������; .
		// Ex02�� �����ڸ� ������ �ʾƼ� �⺻�����ڷ� ��ü �����Ѵ�. (�⺻ �����ڶ� �μ�( = �Ű�����)�� ���� ������) 
		Ex02 test = new Ex02(); // �̰� ���� �׸��� ���°� ���ö���� ������ ��
		
		System.out.println(test); // ��ü�� �ּҰ� ����
		System.out.println(test.k1); // ��ü�� �����ϴ� k1
		System.out.println(test.k2);
		System.out.println(test.K3);
		System.out.println(test.K4);
		System.out.println();
		
		// �޼ҵ� ����
		test.prn01();
		// test.prn02(); 
		Ex02.prn02(); // ���� ������ static�� �̷��� ���°� ����.
		System.out.println(test.k1);
		System.out.println(test.k2);
		System.out.println();
		
		int su2 = test.prn03();
		System.out.println(su2);
		double su3 = test.prn04();
		System.out.println(su3);
		double su4 = Ex02.prn04(); // ���� ������ static�� �̷��� ���°� �´ٰ� ���ٰ� �ϼ���
		System.out.println(su4);
	}

}
