package com.ict03.class01;

public class Ex15 {
	int s1 = 100;
	// �ʱ�ȭ �� �����ʹ� �ʱ�ȭ�� ������ ��������.
	static int s2 = 200;
	
	// static �ʱ�ȭ
	static { 
		s2 = 2000;
		s3 = 3000; // �ν��Ͻ����� s3�� s4�� ������ �Ʒ��� �Ǿ��־ ������ �߻��ؾ���. 
		s4 = 4000; // ������ static�� ������ �Է� ���� �����ص� ���� �߻� ����.
		// s5 = 5000; // ���߿��� ���� ���ϸ� ����
	}
	public Ex15() {	}
	
	// �ʱ�ȭ ���� ����
	static int s3 = 300;
	static int s4; 
	
	public static void main(String[] args) {
		// main �޼ҵ嵵 static�̹Ƿ� ���������� �ν��Ͻ��̸� ���Ұ�!
		Ex15 t1 = new Ex15();
		System.out.println(t1.s1);
		// System.out.println(s1); // �ν��Ͻ��� ����
		System.out.println(s2); // 2000  �ʱ�ȭ ������ ������ ���� ���õ�.
		System.out.println(s3); // 300 ,�ʱ�ȭ ���� �������� �ʱ�ȭ ���� �ٲ�
		System.out.println(s4); // 4000
	}
	
}
