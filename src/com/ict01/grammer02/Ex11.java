package com.ict01.grammer02;

class Ex11{
	public static void main(String[] args){
	// �� ������ : ������ ����� ���� ���ϴ� �����ڷ� ����� �׻� (true or false) �̴�.
	// 		 boolean ���� ���ǽĿ� ���ȴ�.  * �ڷ����� String�� ��쿡�� ������� ����!(���ڸ� �񱳰���? x)

	int s1 = 90;
	int s2 = 80;
	boolean res = s1 >= s2;
	System.out.println("��� : " + res);
	
	char s3 = 'c';
	char s4 = 'a';
	res = s3 > s4; // char�� �񱳰� ���� �ֳ�? char�� ���ڷ� ����Ǵϱ�
	System.out.println("��� : " + res);

	// char �� int ��
	res = 'a' >= 97;
	System.out.println("��� : " + res);

	// int �� double �� : �񱳰� ����. �����ϴ°� �ƴϴϱ�
	res = 97 == 97.0;
	System.out.println("��� : " + res);

	res = 97 == 97.0000001;
	System.out.println("��� : " + res);

	String str1 = "���ѹα�";
	String str2 = "���ѹα�";
	/*
	res = str1 > str2;
	System.out.println("��� : " + res); // �ε�ȣ�� ������ �߻���! ���ڸ� ���ϴ°� �Ұ��� �ϴϱ�
	res = str1 >= str2;
	System.out.println("��� : " + res);
	*/ 
	
	res = str1 == str2; // ����� �������� ������ ��! ����: String�� ���� ������ �ƴ϶� �ּҰ��� ���� ����
			    // class�� �� �������δ� ���� Ʋ��. �׷��� ������ String���� ��� x 
			    // String���� ���ϴ� �޼ҵ尡 ���� ������. ���߿� ���

	System.out.println("��� : " + res);

	}
}