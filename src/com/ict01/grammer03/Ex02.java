package com.ict01.grammer03;

class Ex02{
	public static void main(String[] args){
	// || (OR, ������)
	// - �־��� ���� �� �ϳ��� true �̸� ����� true;
	// - ���� �� true �� ������ ���� ������ ���� x
	int s1 = 10;
	int s2 = 7;
		
	boolean result = false || false;
	System.out.println("��� : " + result);

	result = (s1 >= 15) || (s2 <= 5);
	System.out.println("��� : " + result); // false
		
	result = true || false;
	System.out.println("��� : " + result); // true
	
	result = (s1 >= 15) || (s2 >= 5);
	System.out.println("��� : " + result); // true

	// OR �� true �� ������ ���� ������ ���� �ʴ´�.
	result = ((s1 = s1 + 2) < 20) || (s1 == (s2 = s2 + 5));
	System.out.println("��� : " + result);	
	System.out.println("s1 : " + s1);
	System.out.println("s2 : " + s2);

	
	// ! (NOT, ��������)
	// - �־��� �������� �ݴ�� ����. (true�� false, false�� true)
	result = true;
	System.out.println(!result);
	System.out.println(!!result);
	System.out.println(!!!result);

	}
}