package com.ict03.class03;

public class Ex15 extends Ex14 {
	String name = "ȫ����";
	int id = 2410;
	
	public Ex15() {
		super("������", 15);
		// super(); �� �����Ǿ� �־ �ڽ�ȣ��� �θ� ���� ȣ��Ǵ� ����.
		System.out.println("�ڽ�Ŭ���� ������ : " + this);
		name = "ȫ�β�"; // �ٲٰ� �; �ٲ�
		id = 1004;		 // �������� ���� : ����� �ʱⰪ�� �ʱ�ȭ(= ���ϴ� ������ �ٲ�)
				
	}

	public Ex15(String name) {
		super("�±Ǻ���", 37); // �θ�Ŭ������ ���ڰ� �´� �����ڰ� ���ܼ� ������ ������
		this.name = name; // source���� ������ ����
	}
	
	public void prn() {
		String name = "ȫ��";
		// ����, ����, �θ� ��� �����̸��� ������ ������ �ִ�. -> �ݵ�� ������ ��!
		System.out.println("�������� �̸� : " + name);
		System.out.println("�������� �̸� : " + this.name);
		System.out.println("�θ𺯼� �̸� : " + super.name);
		
		// �θ� ������ �ִ� ���� : �������� �ʾƵ� ��.
		System.out.println("�������� ���� : " + age); // age�� �θ� ������ �����Ƿ� �������� �ʾƵ���.
		System.out.println("�������� ���� : " + age);
		System.out.println("�θ𺯼� ���� : " + age);
		
		// ���������� ������ �ִ� ���� (�θ� x, �ڽ� o)
		System.out.println("�������� id : " + id);
		System.out.println("�������� id : " + this.id);
		// System.out.println("�θ𺯼� id : " + super.id); �ڽĸ� ������ �ִ� �������� ����
	}
}
