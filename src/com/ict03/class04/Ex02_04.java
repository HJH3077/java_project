package com.ict03.class04;

// �Ϲ����� Ŭ������ �߻�Ŭ������ ����ϸ� �ݵ�� �߻�Ŭ������ �߻�޼ҵ带 �������̵��ؾ��Ѵ�.
// why? �߻�޼ҵ�� �ϼ��Ȱ� �ƴϹǷ� �������̵��ؼ� �ϼ����Ѿ� �Ѵ�!!
// = ��üȭ�� �ؾ��Ѵ�.
class Ex02_04 extends Ex01{
	// ������ �ؾ��ϹǷ� ctrl + space �ϸ� ���� ��ܿ� �ִ�.
	@Override
	public void sound() { // �θ� �ϼ����� ���� �޼ҵ带 �ڽ��� �ϼ��ؾ� �����߻� x 
		
		
	}
}

// �������̵��� ���� �ʴ� ��� : �ڽ�Ŭ������ �߻�Ŭ������ ����� ������ ���� x
// ���� �� �ڽ��� ��ӹ޴� Ŭ������ �ᱹ �������̵��� �ϴ��� �� �߻�Ŭ������ �ؾ���. 
// �θ��� �߻�޼ҵ带 ��üȭ ���� �ʾ���
abstract class Ex03 extends Ex01{
	public void song() {
		System.out.println("�뷡�ϱ�");
	}
	
}

// �θ��� �߻�޼ҵ带 ��üȭ ���� �ʾ��� + �ڱⰡ �� �߻�޼ҵ带 �߰�����
abstract class Ex04 extends Ex01{
	public void Music() {
		System.out.println("����");
	}
	public abstract void pop();
	
}