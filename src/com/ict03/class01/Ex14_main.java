package com.ict03.class01;

public class Ex14_main {
	public static void main(String[] args) {
		Ex14 t1 = new Ex14(); // ���⼭ �⺻�����ڰ� �����.
		System.out.println(t1.su1); // 11
		System.out.println(t1.su2); // 11
		System.out.println(Ex14.su2); // static�� �̷��� ���°� ����
		System.out.println();
		
		Ex14 t2 = new Ex14();
		System.out.println(t2.su1); // 11
		System.out.println(t2.su2); // 12 
								// static�� �����̾ t1�̳� t2�� ������ �� Ex14�� ���赵���� su1�� �ʱⰪ���� ������.
								// su2�� static Ex14�� su2�� �ּҰ� ����Ǿ��ִ� �����̴�.
								// �׷��� Ex14�� ������ ������ �ּҸ� ã�ư��� su2�� 1������Ű�� �� ����
								// static Ex14�� su2�� ���´�. �׷��� su1�� �޸� ���� ��� ���Ե�.
		t2.prn();
		System.out.println(Ex14.su2);  // 13
		System.out.println();
		
		
		
	 
		
		
		
		
	}	
}
