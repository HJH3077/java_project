package com.ict03.class01;

public class Ex06 {
	// �����ϴ� ������ �� Ŭ����. ���� �ڷ����� ���� ����.
	private String name = "ȫ�浿"; // public�̶�� �ٸ������� ���� �ٲ� �� �ִ� ���� �ƴ�
	private int age = 24;			// �׷��� setter�� �ʿ���!
	private double height = 180.3;
	private char rank = 'A';
	
	// �ܺο��� private ������ �����ϱ� ���ؼ��� �޼ҵ带 ����ؾ� �Ѵ�.
	// �̰��� "getter() �޼ҵ�" ����Ѵ�.
	// �̸� �����ֱ�
	public String k1() {
		return name;
	}
	// ���� �����ֱ�
	public int k2() {
		return age;
	}
	// Ű �����ֱ�
	public double k3() {
		return height;
	}
	// rank �����ֱ�
	public char k4() {
		return rank;
	}
	
	// ������ �����ؼ� �ش� ������ �����͸� ������ �� ���
	// �̰��� "setter() �޼ҵ�" ����Ѵ�.
	// �̸� �ٲٱ�
	public void m1(String t1) {
		name = t1;
	}
	// ���� �ٲٱ�
	public void m1(int t1) {
		age = t1;
	}
	// Ű �ٲٱ�
	public void m1(double t1) {
		height = t1;
	}
	// rank �ٲٱ�
	public void m1(char t1) {
		rank = t1;
	}
	
	
	
}
