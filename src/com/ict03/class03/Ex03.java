package com.ict03.class03;

// Ex02(�θ�)�� Ex03(�ڽ�)�� ��Ӱ���, �ڽ��� �θ� ��밡�� �ٵ� �θ�� �ڽĲ� x
public class Ex03 extends Ex02 {
	String name = "���θ�";
	int age = 34;
	static String hobby = "��ȭ����";
	
	public Ex03() {
		System.out.println("�ڽ�Ŭ���� ������ : " + this);
	}
	
	public void sound() {
		System.out.println("�ڽ�Ŭ���� �޼ҵ�");
	}
	
	public void study() {
		// ��ü �������� �θ�Ŭ������ ����ʵ带 ����� ���
		System.out.println("������� : " + addr); // Ex02�� addr�� ��ü �������� �׳� �� �� ����.
		
		// �θ�� �ڽ��� �����̸��� ������ �θ��� ������ super.���� ����
		System.out.println("name : " + this.name); // ���θ�
		System.out.println("name : " + super.name); // ������
		
		// ��Ӱ��迩�� private�� ����� �� ����.
		// System.out.println("�츮�� �ֿϵ��� : " + dog); private���� �� �� ����
	}
	
	// �������̵� : �θ�޼ҵ��� �Ѹ���� �״�� ����ϸ鼭 ���븸 �����ϴ� �� (= ������)
	
	@Override
	public void eat() {
		System.out.println("��ħ���� �����Ѵ�"); // �θ�޼ҵ带 �״�� ���������� ������ �ٲ�(��� -> ��ȸ�)
		// super.eat(); 
	}
	
	/*
	public void walk() { // final�� ����ġ�� ���Ƽ� ������ �߻�
		System.out.println("���� �ȱ� �Ⱦ�");
	}
	 */
	
	// �������̵��� �� �� ���� ����� ����� : final
	// �θ�޼ҵ忡 final ������ override �� �� ����.
	
	
}