package com.ict01.grammer04;

import java.util.Scanner;
class Ex10 
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	esc : 
	while (true){
		System.out.print("�����Է�: ");
		int k = sc.nextInt();
		String msg = "";
		if(k % 2 == 0)
			msg = "¦��";
		else
			msg = "Ȧ��";

		System.out.println(k + "(��/��) " + msg + " �Դϴ�.");
		while(true){ // �̰� ���� 1,2���� ���ڸ� �ִ� ���� �ذ������� ���� ���ڸ� ������ ������ ����� ó���ϴ� ���� �����ȹ��.
			System.out.print("����ұ��? (1.yes 2.no) : "); 
			int k2 = sc.nextInt();
			if(k2 == 1) 
				// continue esc;
				break;
				// while 1������ �̵��ϰ� ��� �����ؾ� �ϹǷ�
				// break; �� �ص���. ���� 2�� while���� ���������°� �����̰� 1�� while���� �۵��� ���̹Ƿ�
				// �� break�� ��� 2�� �Ʒ��� 1���� ��ɾ �� ���� ��� �Ʒ��� ��ɾ ���� �����ϰ� esc�� �׳� ó������ ������.
				// ������ 2�� �Ʒ��� ��ɾ �� ������ break���� ������ �ȳ�. continue esc�� ������.(�Ⱦ��� �κ��� �־)
				// ��������� break�� ���°� ������ ���� ���� Ȯ���� �ξ� �����Ƿ� *** break�� ���°� �´�!
			else if(k2 == 2)
				break esc; // while 1���� �ƿ� ���������� �ϹǷ�
			else{
				System.out.print("�߸� �Է��ϼ̽��ϴ�.");
				continue; // ����ұ�並 ���� while������ �ٽ� �����ϹǷ� break�� �ƴ� continue�̴�.
			}
		}
	}




	}
}
