package com.ict01.grammer02;

class Ex07{
	public static void main(String[] args){
	// ����1 : �̸��� ȫ�浿�� ����� ���� : 90, ���� : 80, ���� : 90 �̴�. 
	// 	  ������ ����� ���ؼ� �̸�, ����, ����� �������. (��, ����� �Ҽ��� ù°�ڸ����� ���Ѵ�.)
	String name = "ȫ�浿";
	int ko = 90;
	int eg = 80;
	int ma = 90;
	int tot = ko + eg + ma;
	double totav =  (int)((tot / 3.0) * 10) / 10.0;	

	System.out.println("�̸� : " + name);
	System.out.println("���� : " + tot);
	System.out.println("��� : " + totav);

	}
}