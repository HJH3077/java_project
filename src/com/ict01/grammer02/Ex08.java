package com.ict01.grammer02;

class Ex08{
	public static void main(String[] args){
	// ����2 : �Ƹ޸�ī�밡 2500���̴�. ģ���� ���̼� 10000���� ���� �ֹ��ߴ�. �ܵ��� ���ΰ�? (�ΰ��� 10%�� �߰��ȴ�.)
	
	/* 
	int ame = 2500;
	int human = 2;
	int money = (int)(10000 - ((ame * human) * 1.1));
	System.out.println("�ܵ��� : " + money + "��");
	 */

	// �Է�����
	String coff = "�Ƹ޸�ī��"; // Ŀ���̸�
	int dan = 2500; // Ŀ�� �ܰ� 
	int su = 2; // ��� ��
	int input = 10000; // ���� ��
	
	int total = dan * su; // ���Ǳݾ�
	int vat = (int)(total * 0.1); // �ΰ���
	int output = input - (total + vat);
	System.out.println("�ܵ��� : " + output + "��");

	// �Ǵ� int total = (int)((dan * su) * 1.1);
	//	int output = input - total;
	}
}