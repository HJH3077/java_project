package com.ict03.class03;

public class Ex14 {
	String name = "ȫ�浿";
	int age = 27;
	
	
	public Ex14() {
		System.out.println("�θ�Ŭ���� ������ : " + this);
		// �ڱ� �ڽ��� ��Ī�ϴ� this�� �����Ƿ� �ּҰ��� ����
		age = 17;
	}
	
	
	// �ٸ� ������
	public Ex14(String name, int age) {
		super(); // ������ super()�� �θ��� �����ڸ� ȣ���ϴµ�
				 // �⺻������ *** �θ������ Object�� ȣ����! (��������)
		this.name = name;
		this.age = age;
	}
	
	// ������ �⺻ �����ڰ� ������ �ڽ��� �����ڵ��� ������ �߻�
	// whyy? �ڽ��� �����ڵ��� super()�� ���еǾ������Ƿ� 
	// super()�� �θ��� �⺻�����ڸ� ȣ���ϴ� ��ɾ��ε� �θ��� �⺻�����ڰ� ����? = ����
	// �׷��� super() �� �ƴ� super(����)�� �ڽ��� ���ڸ� �����ָ� ��밡��
	

	
}
