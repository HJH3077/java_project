package com.ict01.grammer04;

class Ex02 
{
	public static void main(String[] args) 
	{
	// for�� : ������ ��Ģ�� ���� ���๮�� �ݺ� ó���ϴ� ��	
	// ���� : for(�ʱ��; ���ǽ�; ������){
	//			���ǽ��� ���϶� ������ ����;
	//			���ǽ��� ���϶� ������ ����;
	//		} 
		
	// for���� ������ ������ �ʱ������ �̵� ->	�ʱ�Ŀ����� ���ǽ����� �̵� -> ���ǽ��� ���̸� for���� ����
	// -> ���� �� for���� ���� ������ ������ ���������� -> �������� ������ �ٽ� ���ǽ����� �̵� -> ���ǽ��� �����̸� for���� ������ ����.
	

	// �ȳ��ϼ���, ���� ����ϱ�

	for (int i = 1; i <= 10 ; i++)
	{
		System.out.println("�ȳ��ϼ���" + i);
	}

	// 0 ~ 15���� �������
	for (int i = 0; i < 16 ; i++)
	{
		System.out.print(i + "  ");
	}
	System.out.println();

	// 0 ~ 10���� ¦���� ���  // for(int i = 0; i <= 10; i = i + 2) �� ����� ����
	for (int i = 0; i<= 10; i++)
	{
		if(i % 2 == 0)
			System.out.print(i + " ");
	}
	System.out.println();


	// 0 ~ 10���� Ȧ���� ��� 
	for (int i = 0; i<= 10 ; i++)
	{
		if(i % 2 == 1)
			System.out.print(i + " ");
	}
	System.out.println();

	// 0 ~ 50���� 7�� ����� ���
	for (int i = 0; i < 51; i++)
	{
		if(i % 7 == 0)
				if(i != 0)
				System.out.print(i + " ");

	}
	System.out.println();

	// 5�� ���
	for (int i = 1; i < 10 ; i++)
	{
			System.out.println("5 * " + i + " = " + (i * 5));
	}

	// 0 0 0 0 4�� ���
	for (int i = 1; i < 17; i++)
	{
		System.out.print("0 ");
		if(i % 4 == 0)
			System.out.println();
					
	}

 /*
	for (int i = 0; i < 5; i++)
	{
		System.out.println("0 0 0 0");
	}
*/

	// 0 ~ 10���� ������ ���ϱ� (0 + 1 + 2 + 3 ... + 10)
	int sum = 0;
	for (int i = 0; i < 11; i++)
	{
		System.out.println(sum + " + " + i);
		sum = sum + i; // i�� ������
		
		
	}
	System.out.println("�� : " + sum);


	// Ȧ���� ������
	int odd = 0;
	for (int i = 0; i <11; i++)
	{
		if(i % 2 == 1)
		odd = odd + i;
	}
	System.out.println("Ȧ���� ������ : " + odd);

	// ¦���� ������
	int even = 0;
	for (int i = 0; i <11; i++)
	{
		if(i % 2 == 0)
		even = even + i;
	}
	System.out.println("¦���� ������ : " + even);


	// Ȧ���� ¦���� �������� ���� ���Ͻÿ�
	int oddsum = 0;
	int evensum = 0;
	for (int i = 0; i < 11; i++)
	{
		if(i % 2 == 0)
			evensum = evensum + i; // i�� ������
		else
			oddsum = oddsum + i;
	}
	System.out.println("Ȧ���� ������ : " + oddsum);
	System.out.println("¦���� ������ : " + evensum);


	// 7! (7 * 6 * 5 * 4 * 3 * 2 * 1)
	int fac = 1;
	for (int i = 7; i > 0; i--)
	{
		fac = fac * i;
		if(i > 1)
		System.out.print(i + " * " );
		else
		System.out.print(i + " = ");
	}
	System.out.println(fac);

	}
}

