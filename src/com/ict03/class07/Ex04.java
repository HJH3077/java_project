package com.ict03.class07;

// 3. static ����Ŭ����
public class Ex04 {
	static String name = "ȫ�浿";
	private static int age = 24;
	static String addr = "���ֵ�";
	
	
	public Ex04() {
		System.out.println("�ܺ�Ŭ���� ������ : " + this);
	}
	
	public static void sound() {
		int money = 1000;
		final int time = 2;
		// static int number = 12; ���������� static ��� �Ұ�!(�޼ҵ尡 ȣ��Ǿ� ����� ���̹Ƿ�)
		// static final int number2 = 12;
		System.out.println("�ܺ�Ŭ���� �޼ҵ� : " + name + ", money : " + money); // ����,�������� ��� �����پ�
	}
	
	// Member ����Ŭ����
	public static class Inner03 {
		String name = "ȫ����";
		final int i2 = 10;
		// ����Ŭ���������� static ��� �Ұ�! (��, �� �ٿ��� �Ѵٸ� static ����Ŭ���� ���)
		// ������ static�� ����ϰ��� �Ϸ��� ����Ŭ�������� static�� �ٿ���.
		static int i3 = 20; 
		static final int i4 = 30;
		
		public Inner03() {
			System.out.println("����Ŭ���� ������ : " + this); // ** �ּҰ��� $�� �����ϸ� ����Ŭ�����̴�.
		}
		
		// ����Ŭ���� �޼ҵ�
		// ����Ŭ������ �ܺ�Ŭ������ �޼ҵ�� �ʵ带 ������� ��밡��
		public void play() {
			// �ܺ�Ŭ������ �޼ҵ�� �Ȱ����� ����� ������?
			int money = 50000;
			System.out.println("�̸� : " + name);
			System.out.println("�ݾ� : " + money);
			//	System.out.println("���� : " + age); static ����Ŭ�����̹Ƿ� �����߻�
			// �ܺ�Ŭ������ ������� static�� �ٿ��� ��� ����
			System.out.println("���� : " + age); 
			// �ܺ�Ŭ������ �޼ҵ嵵 static�� �ٿ��� ��� ����
			sound(); // �ܺ�Ŭ������ �޼ҵ� sound()
		}
		
	}
	
	
}
