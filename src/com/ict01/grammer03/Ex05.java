package com.ict01.grammer03;

class Ex05{
	public static void main(String[] args){

	// int k1�� 60�̻��̸� �հ� �ƴϸ� ���հ�
	int k1 = 70;
	String res = (k1 >= 60)? "�հ�" : "���հ�";
	System.out.println("��� : " + res);	


	// int k2�� Ȧ������ ¦������ �Ǻ�����	
	int k2 = 87;
	String res1 = (k2 % 2 == 0)? "¦��" : "Ȧ��";
	System.out.println("��� : " + res1);	

	// char k3�� �빮������ �빮�ڰ� �ƴ��� �Ǻ�����
	char k3 = 'V';
	String res2 = (k3 >= 'A' && k3 <= 'Z')? "�빮��" : "�빮�ڰ� �ƴ�";
	System.out.println("��� : " + res2);

	// �ٹ��ð��� 8�ð������� �ð��� 8720�̰� 8�ð��� �ʰ��� �ð���ŭ�� 1.5���̴�. 
	// ���� �ٹ��ð��� 10�ð��̸� �󸶸� �޾ƾ� �ϴ°�?
	int now = 15;
	int money = 8720;
	double res3 = (now <= 8 )? (money * now) : ((money * 8) + ((now - 8) * money * 1.5));
	System.out.println("��� : " + (int)(res3) + "��"); 
	

	}
}