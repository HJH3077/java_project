package com.ict01.grammer04;

class Ex08 
{
	public static void main(String[] args) {
	// break label: ���̺��� ������ ����� Ż���Ѵ�.
	//				�ܼ� for���϶��� break�� break label�� ���̰� ����. ��, ���� for�������� �ǹ̰� ����.
	// continue label : ���̺��� ������ ����� ���������� �̵��Ѵ�.
	//					�ܼ� for���϶��� continue�� continue label�� ���̰� ����. ��, ���� for�������� �ǹ̰� ����.
	// ���̺���� ��� : ���ϴ� �ݺ��� ���� �տ� '���̺�� : '
	
	for (int i = 1; i < 11; i++) // 1 ~ 4���� ���
	{
		if (i == 5) break;
		{
			System.out.print(i + " ");
		}
	}
	System.out.println();
		
	esc1:
	for (int i = 1; i < 11; i++) // ���� �ٸ��� ����
	{
		if (i == 5) break esc1;
		{
			System.out.print(i + " ");
		}
	}
	System.out.println();
	System.out.println();

	for (int i = 1; i < 4; i++) // j = 1,2 ����� ������ i = 1 ~ 3
	{
		for (int j = 1; j < 6; j++)
		{
			if(j == 3) break;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println();

	esc2 :
	for (int i = 1; i < 4; i++) // ���� �޸� i = 1�϶� �����ٰ� j = 3�� �Ǵ� ���� �ٷ� ���̺��� ������ for�� ��ü�� ��������.
								// ��, 2�� for���̹Ƿ� �ٱ����� for���� ���������� �ű⼭ for���� �����Ե�. i = 1�϶� j = 1,2�� ���
	{
		for (int j = 1; j < 6; j++)
		{
			if(j == 3) break esc2;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println(" ============================================= ");



	for (int i = 1; i < 11; i++) // 1 ~ 4���� 5�� �ѱ�� 6 ~ 10 ���� ���
	{
		if (i == 5) continue;
		{
			System.out.print(i + " ");
		}
	}
	System.out.println();
		
	esc3:
	for (int i = 1; i < 11; i++) // ���� �ٸ��� ����
	{
		if (i == 5) continue esc3;
		{
			System.out.print(i + " ");
		}
	}
	System.out.println();
	System.out.println();


	for (int i = 1; i < 4; i++) // i = 1 ~ 3, j = 1, 2���� 3���� 4,5 
	{							// continue�ϸ� j�� for���� ���������� ��
		for (int j = 1; j < 6; j++)
		{
			if(j == 3) continue;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println();

	esc4 :
	for (int i = 1; i < 4; i++) // i = 1 ~ 3, j = 1, 2���� i�� for���� ���������� ���Ƿ� j�� 1,2�� ������ i�� 1~3���� ����
	{							// ��, continue�ϸ� label�� �ִ� i�� for���� ���������� ��.
		for (int j = 1; j < 6; j++)
		{
			if(j == 3) continue esc4;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println();



	}
}
