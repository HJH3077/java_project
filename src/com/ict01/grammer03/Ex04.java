package com.ict01.grammer03;

class Ex04{
	public static void main(String[] args){
	// ���׿����� (���ǿ����� = ���ǹ� if�� ����)
	// ���� - ���庯�� = ���ǽ�? ���� �� ������ ���� : ������ �� ������ ����; 	
	// 	���ǽĿ��� boolean, ������, �񱳿����� ����. (true or false)
	// ���ǻ��� : ���庯��, ���� �� ������ ������ ���, ������ �� ������ ������ ����� ��� ���� �ڷ��� �̾����!
	//	      ��, ���庯���� �� ū�ڷ����̸� ������ ����.
	// byte < short < char < int < long < float < double

	int result = true? 14 : 10;
	System.out.println("��� : " + result); // 14

	result = false? 14 : 10;
	System.out.println("��� : " + result); // 10
	
	int result2 = false ? 14 : 'C';
	System.out.println("��� : " + result2); // C�� �ش��ϴ� ����
	System.out.println("��� : " + (char)(result2)); // C��� ǥ���ϱ� ���� ���
	
	// �־��� sum�� 80�̻��̸� "�հ�", �ƴϸ� "���հ�"
	int sum = 81;
	String res = (sum >= 80)? "�հ�" : "���հ�";
	System.out.println("��� : " + res);

	// ��������� 90�̻��̸� A, �ƴϸ� B
	double avg = 87.0;
	double result4 = (avg >= 90)? 'A' : 'B'; // double�̶� int�� �񱳰� ����. �����ϴ°� �ƴϱ� ������
	System.out.println("��� : " + result4);
	System.out.println("��� : " + (char)(result4));
	
	}
}