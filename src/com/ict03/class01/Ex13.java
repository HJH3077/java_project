package com.ict03.class01;

public class Ex13 {
	private String name = "����";
	private int age = 3;
	private String addr = "����";
	
	// ������
	// �⺻������ : ctrl + space

	
	
	
	public Ex13() {
		// this : ��ü ���ο��� ��ü �ڽ��� �����ϴ� �����
		// this.���� : ��������
		// this() : �����ڰ� �ٸ� �����ڸ� ȣ���� �� ����ϴ� �����
		// ��, �ݵ�� ������ ù �ٿ��� ����� �����ϴ�.

		this("������", 21, "����"); // �� �κ��� ������ �ش��ϴ� ������(4��° �����ڰ� �ִ� �κ�)�� ���� �����ϰԵ�.
									// �ݵ�� �� ���� �־����!
		System.out.println("�⺻������ " + this);
		// System.out.println(this.name);
		// System.out.println(this.getName());
	}
	
	// �ٸ� ������ ����¹� : Source �޴� - generate constructor using fields
	public Ex13(String name, int age) {
		this(name, age, "����");
		
	}
	
	public Ex13( int age, String name) { 
		// super();
		this.name = name;
		this.age = age;
	}
	
	public Ex13(String name, int age, String addr) {
		// super(); ���� �ȹ��
		this.name = name;
		this.age = age;
		this.addr = addr;
		System.out.println("4��° ������");
	}
	


	
	
	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
	
}
