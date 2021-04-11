package com.ict03.class01;

public class Ex02 {
	// Ŭ���� �ȿ��� 3������ �����Ѵ�.
	// ����ʵ�, ����޼ҵ�, ������
	// ����ʵ� : ����� ����, static�� instance�� ��������.
	// final�� ������ ���, static�� ������ �ν��Ͻ�(��ü ������ �� ���� �������.)
	// static �̶� ��ü ������ ������� �̸� ���������.
	
	
	// ���������� �Ķ���
	int k1 = 80; 				// instance(static�̾����Ƿ�) ���� = �Ϲݺ���
	static int k2 = 90; 		// static ���� 
	final int K3 = 85;			// �ν��Ͻ� ���(final�� �پ ���)
	static final int K4 = 95;	// static ��� = API���� �����ϴ� �������
	// System.out.println() ��� �Ұ�. �޼ҵ� ���� �ƴ϶�
	
	// ����޼ҵ� : ����, ���
	// �޼ҵ�� �ڱ⸦ ȣ���� ������ �ǵ��ư���.
	// �ҹ���( ) �� ������ ������ �޼ҵ���
	
	public void prn01() { // �ν��Ͻ�, ��ȯ���� ����
		// �� ������ �����ϹǷ� ����
		k1 = k1 + 20;
		k2 = k2 + 10;
		System.out.println("k1 = " + k1);
		System.out.println("k2 = " + k2);
		
		/*
		final�� ������ ���, ����� �� ������ �� �� ����. �׷��� �����߻�
		k3 = k3 + 15;  
		k4 = k4 + 5;   
		*/ 
		
		// �������� : �޼ҵ� �ȿ��� ������� ����
		// 			  �޼ҵ� �ȿ��� ������� ������ �޼ҵ带 ȣ���� �� �����ȴ�.
		//			  �޼ҵ尡 ������ �޸𸮿��� �ڵ����� �������.
		// 			  ���� �޼ҵ尡 �ν��Ͻ��� ȣ���ؾ� �����µ� static�� ������ ����� ���� ����.
		//			  ���������� static�� ����� ���� ����.
		int s1 = 10;
		// static int s2 = 90; ���������� static�Ұ���
		final int s3 = 85;
		// static final int s4 = 95;
		
		System.out.println();
	
	}
	
	public static void prn02() { // static, ��ȯ���� ����. return �ᵵ�Ǵµ� �ǹ̴� ����
		// k1 = k1 + 20; static�� ��� ����
		k2 = k2 + 10;
		// K3 = K3 + 15;  
		// K4 = K4 + 5; ����� �����Ϸ��� �ؼ� ����  
		System.out.println("k2 = " + k2);
		System.out.println("K4 = " + K4);
	
		// ���������� static ��� �Ұ� static �޼ҵ忩��.
		int s1 = 10;
		// static int s2 = 90; 
		final int s3 =85;
		// static final int s4 = 95;
		
		System.out.println();
	}
	
	public int prn03() { // �ν��Ͻ�, ��ȯ���� ����, ������ �� return '����������'
		return 14; // return ����ϴ� ������ ������, ��ȯ���̶� ���� �ڷ���
		// return 'c'; �� ���� (���� �ڷ����� ����) 
	}
	
	public static double prn04() { // static, ��ȯ���� ����
		System.out.println("K4 = " + K4);
		return 3.14;
		// return 114; (���� �ڷ��� ����)
	}
	
	
}
