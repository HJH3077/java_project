package com.ict01.grammer02;

class Ex09{
	public static void main(String[] args){
	// ����3 : 2�ð� 40�� 23�ʸ� �ʴ����� �����ض� 
	int hour1 = 2;
	int min1 = 40;
	int sec1 = 23;
	
	int sectot1 = (hour1 * 3600) + (min1 * 60) + sec1;
	System.out.println("2�ð� 40�� 23�ʴ� " + sectot1 + "�� �Դϴ�.");
	

	// ����4 : 9630�ʴ� �� �ð� �� �� �� ���ΰ�?
	/*
	int time = 9630;
	int hour2 = time / 3600;
	int min2 = (time - (hour2 * 3600)) / 60;
	int sectot2 = (time - (hour2 * 3600) - (min2 * 60));
	System.out.println(hour2 + "��" + min2 + "��" + sectot2 + "��");
	*/

	int time = 9630;
	int h1 = 0; // ��	
	int m1 = 0; // ��
	int s1 = 0; // ��
	int res = 0; // ������
	
	// �ð����ϱ�
	h1 = time / 3600;
	res = time % 3600;
	m1 = res / 60;
	s1 = res % 60; // ���� ���� �������� ��

	System.out.println(time + "�ʴ� " + h1 + ":" + m1 + ":" + s1);


	}
}
