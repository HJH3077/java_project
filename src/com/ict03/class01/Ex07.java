package com.ict03.class01;

// VO(Value Object)�� ���� �� �̷��� ����. ***** ���߿� ����ϱ� ������ �� �˾Ƶδ°� ����
public class Ex07 {
	private String name = "�Ѹ�";
	private int age = 13;
	private double height = 135.15;
	private boolean gender = true;
	private char rank = 'A';
	// getter/setter ȣ�� => �޴� - source - generate getter and setter
	
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public boolean isGender() {
		return gender;
	}
	public char getRank() {
		return rank;
	}
	
	// setter
	public void setName(String name) {
		this.name = name; // this name�� ���������� name�̰� name�� main�� �Է¹޴� �������� name�̴�. 
	}					  // ���������� ���������� �̸��� ���� �� �����ϱ� ���� this ���.
						  // ���������̸��� ���������̸��� ���� �� �켱������ ���������� ����.
						  // ��, name = name �� �� �������� �̸��� name�̸� name = name �Ѵ� ������������.
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public void setRank(char rank) {
		this.rank = rank;
	}
	

	
	
	
	
}
