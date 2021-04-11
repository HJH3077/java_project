package com.ict01.grammer03;

class Ex01{
	public static void main(String[] args){
	// �������� : &&(AND, ����, ||(OR, ����), !(NOT, ������)
	// ���Ǵ� �ڿ� : boolean��, �񱳿���(��������� true,false�� �����Ƿ�), ������
	// ����� boolean�� ==> ���ǽĿ� ���ȴ�.

	// && (AND, ����, ������)
	// - �־��� ������ ��� true �϶��� ����� true 
	// - �־��� ���ǵ� �߿� false�� ������ ���� ����� false����. �׸��� ���Ŀ� �ִ� ������ ���� x

	int s1 = 10;
	int s2 = 7;
	boolean result = true && true;
	System.out.println(result);	

	result = (s1 >= 7) && (s2 >= 5);
	System.out.println(result);

	result = false && true;
	System.out.println(result);
	
	result = (s1 <= 7) && (s2 >= 5);
	System.out.println(result);
	
	// false�� ������ ���� ������ ���� �ʴ´�.
	result = ((s1 = s1 + 2) > s2) && (s1 == (s2 = s2 + 5));
	System.out.println("��� : " + result);
	System.out.println("s1 : " + s1); // 12
	System.out.println("s2 : " + s2); // 12

	result = ((s1 = s1 + 2) < s2) && (s1 == (s2 = s2 + 5));
	System.out.println("��� : " + result);
	System.out.println("s1 : " + s1); // 14
	System.out.println("s2 : " + s2); // 12 (���� false���� ������ ������� �ʾ���)
	
	// && �� ������ �ܿ� ������ ������ �� �ִ�.
	// a >= 10 && a <= 20; ==> a�� 10 ~ 20 ������ ������ �ǹ���.
	s1 = 24;
	result = (s1 >= 20) && (s1 <= 30);
	System.out.println("��� : " + result);

	// char c1�� �ҹ��� �ΰ�?
	char c1 = 'D'; // D = 68
	//result = (c1 >= 97) && (c1 <= 122); // 97 ~ 122���̿� ������ �ҹ�����(�ƽ�Ű�ڵ���)
	result = (c1 >= 'a') && (c1 <= 'z'); // �̷� ������� �ص� ������ ����.
	System.out.println("��� : " + result);

	}
}