package com.ict01.grammer04;

import java.util.Scanner;
class Ex09 
{
	public static void main(String[] args) 
	{
	// 1 ~ 10���� ¦���� ��� (continue ���)
	for (int i = 1; i < 11; i++)
	{
		if(i % 2 == 1) continue;
		System.out.print(i + " ");
	}
	System.out.println();




	// ���ѷ������� ���ڸ� �޾Ƽ� ¦��, Ȧ�� �Ǻ�	
	Scanner sc = new Scanner(System.in);
	while(true){ // ���ѷ����� for���� �׳� while�� ����� ��
		System.out.print("�����Է� : ");
		int num = sc.nextInt();
		String msg = "";
		if(num % 2 == 0)
			msg = "¦��";
		else
			msg = "Ȧ��";
		System.out.println(num + "(��/��) " + msg + " �Դϴ�");
		System.out.print("����ұ��? (1.yes, 2.no) >>> ");
		int num2 = sc.nextInt();
		if(num2 == 2) break; // 2�̿��� �ٸ� ���ڸ� �Է��ϸ� 1�� �ƴϾ ��� ��������. ó���� �ʿ���.

	
	}








	}
}
