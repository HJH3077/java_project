package com.ict03.class07;

public class Ex03 {
	String name = "�Ѹ�";
	int height = 160;
	public Ex03() {
		System.out.println("�ܺλ����� : " + this);
	}
	
	public void sound() {
		String addr = "����";
		System.out.println("ȣ��~ ȣ��~");
	}
	
	// ����Ŭ������ ���� �ܺθ޼ҵ�
	public void play() {
		int age = 24;
		class Inner02 { // public ��� �Ұ� = ������ �ƴϴϱ�
			String name = "����";
			int time = 36;
			public Inner02() {
				System.out.println("���λ����� : " + this);
			}
			public void hobby() {
				System.out.println(name);
				System.out.println(height);
				// System.out.println(addr); �ڱⰡ ���� �޼ҵ尡 �ƴϹǷ� �������� ��� �Ұ�
				System.out.println(age); // �����ִ� age�� ��밡��
				System.out.println(time);
				
			} // ���θ޼ҵ� ��
		} // ����Ŭ������
		Inner02 in02 = new Inner02();
		// �ܺ� ���
		System.out.println(name);
		// �ܺ� �޼ҵ�
		sound();
		// ���� �޼ҵ�
		in02.hobby();
	} // �ܺ� �޼ҵ� ��
	
}
