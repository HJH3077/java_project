package com.ict03.class01;

public class Ex11 {
	// ������ : Ŭ������ ��ü�� ���� �� �ڵ����� �ѹ� ȣ��ȴ�.
	// ���� : ����ʵ�(������ ���)�� �ʱ�ȭ
	// Ư¡ : Ŭ�����̸��� �������̸��� ����. Ŭ�����̸�([���� = �Ű�����]);
	//		  ��ȯ���� ���� �޼ҵ��� �Ѵ�.
	//		  �����ڸ� ������ ������ �ڵ����� �⺻�����ڷ� ��ü�� �����Ѵ�. 
	//		  �⺻������ : ���ڰ� ���� ������ ��) class();
	//		  �����ڵ� �����ε��� ����
	//		  �����ε� : �ϳ��� Ŭ������ �������� �����ڰ� ������ �� �ִ�. 
	//		  			 ��, ������ ������ ������ ������ �޶�� �Ѵ�.
	//				     Ŭ���� �ȿ��� �����ڸ� ��������� ������� �����ڸ� ����ؾ� �Ѵ�.
	
	private String name = "�Ѹ�"; // ��, ���� ������ setter�� �ٲٵ簡 �����ڷ� �ٲ����.
	private int age = 24;
	private boolean gender = true;
	
	// ������ �����ε� (2�� �̻��̸� �����ε�)
	// �⺻������
	public Ex11() { // ���� �ʱⰪ�̰� ���� �� �⺻�������� ������ ������ �ʱ�ȭ��.
		System.out.println("�⺻������");
		name = "�±Ǻ���";
		age = 43;
	}
	
	
	// �⺻�����ڰ� �ƴ� �ٸ� ������ (���ڰ� �ִ� �����ڸ� ����)
	public Ex11(String name, int age) {
		System.out.println(1);
		this.name = name;
		this.age = age;
		
	}
	
	public Ex11(int age, String name) { // ���� �Ȱ����� ������ �޶� ������ �ȳ�. ���� �ٸ��ɷ� �ν�
		System.out.println(2);			// �ϳ��� Ŭ������ ���� �����ڸ� ����� "�����ε�" !
		this.name = name;
		this.age = age;
		
	}  // ������ ����غ��� �̸�, ���� ���̸� 1�� ��� ����, �̸� ���̸� 2�� ����̵�. 
	   // �� �����ڰ� �ٸ��ٴ°� �� �� ����.
	
	
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public boolean isGender() {
		return gender;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	

	
	
}
