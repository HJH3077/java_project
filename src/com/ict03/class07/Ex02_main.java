package com.ict03.class07;

public class Ex02_main {
	public static void main(String[] args) {
		// Member ����Ŭ������ ������ ��ü ���� ����
		// Inner01 t1 = new Inner01();
		// �׷��� �ܺ�Ŭ������ ���ؼ� ����Ŭ������ ����Ѵ�.
		Ex02 t1 = new Ex02();
		// �ܺ�Ŭ������ ���ؼ� ����Ŭ���� ����
		// ����Ŭ������ �ּҿ��� '$'�� �����Ѵ�.
		Ex02.Inner01 t2 = t1.new Inner01();
		System.out.println(t2.name);
		System.out.println(t2.i2); 
		System.out.println(t2.i4); // ����Ŭ������ ����
		System.out.println();
		t2.play(); 	// �ܺ��� age�� �������µ� ������
					// ������ �޼ҵ忡�� sound()�� �̿��Ͽ� �ܺ�Ŭ������ �޼ҵ带 ȣ���ؼ� �ܺ��� �ڷḦ ������
		
		
		
		
	}
}
