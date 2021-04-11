package com.ict03.class07;

interface Test{
	int data = 1000;
	void printData();
}

// ��ӹ޾Ƽ� ����ϴ� ���
class Test02 implements Test{
	@Override
	public void printData() {
		System.out.println("data : " + data);
	}
	
	// �׳� printData(); �� ����
} 

// ��ӹ��� �ʰ� ����ϴ� ��� (anonymous ���)
class Test03{
	Test t = new Test() {
		@Override
		public void printData() {
			System.out.println("data : " + data);
		}
	};
	// t.printData(); ����
}

// ��ӹ��� �ʰ� �޼ҵ忡 �ֱ�('Test t = ' �κ��� ���� �� ����)
class Test04{
	public void play() {
		new Test() {
			@Override
			public void printData() {
				System.out.println("data : " + data);			
			}
		}
		.printData(); // ����Ŭ���� ��
	} // �޼ҵ� ��
} 
// ���� ���� �ܺθ޼ҵ� �� ���̿� �����ؾ���

// ��ӹ��� �ʰ� �޼ҵ� ���ڿ� �ֱ�
class Test05{
	public void sound(Test test) {
		test.printData();
	}
}


public class Ex08 {
	public static void main(String[] args) {
		// 1�� ����� ���
		Test02 t2 = new Test02();
		t2.printData();
		System.out.println();
		
		// 2�� ����� ���
		Test03 t3 = new Test03();
		t3.t.printData();
		System.out.println();
		
		// 3�� ����� ���
		Test04 t4 = new Test04();
		t4.play();
		System.out.println();
		
		// 4�� ����� ��� (�̺�Ʈ ó�� ���)
		Test05 t5 = new Test05();
		t5.sound(new Test() {
			@Override
			public void printData() {
				System.out.println("data : " + data);
			}
		});
		
	}
}
