package com.ict03.class03;

public class Ex16_main {
	public static void main(String[] args) {
		// �ڽ��� ȣ���ϴ� ���� �θ�Ŭ������ ������� �� �ڽ�Ŭ������ ���������.
		Ex15 person1 = new Ex15(); // Ex15�� ��������� Ex14�� ���� ������� 
		// ������ ���� �� �θ�Ŭ������ �����ڰ� ���� ������
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.id);
		System.out.println();
		
		Ex15 person2 = new Ex15("�Ӳ���"); // �����ε����� �ڽ�Ŭ������ String name�� ���ڰ� �ִ� �����ڷ� ��
		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(person2.id);
		// Ex15()�� �ƴ� Ex15(String name)�� �����ڰ� ���� �ǹǷ� Ex15()�� id�� name�� ����Ǵ°� �ƴϹǷ�
		// Ex14�� id�� ������ Ex15�������� �̸��� �ٲ�
		// �ٵ� super()�� �����Ǿ� �����Ƿ� Ex14()�� �����ؼ� age�� Ex14()�� �������� �ٲ�
		System.out.println();
		person2.prn();
		
	}
}
