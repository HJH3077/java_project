package com.ict01.grammer04;

class Ex03 
{
	public static void main(String[] args) {
	// ���� for�� : for���ȿ� for���� ������.
	for (int i = 1; i < 4; i++){
		for (int j = 1; j < 6; j++)
		{
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	
	// ������1 2�ܺ��� �Ʒ��� ��
	for (int i = 2; i < 10; i++)
	{
		System.out.println(i + "��");
		for (int j = 1; j < 10; j++)
		{
			System.out.println(i + " * " + j + " = " + (i * j));
		}
	}
	System.out.println();

	// ������2 2�� ���η� ��, 3���� �ٹٲٰ� ��, �ݺ�
	for (int i = 2; i < 10; i++)
	{
		System.out.println(i + "��");
		for (int j = 1; j < 10; j++)
		{
			if(j < 9)
			System.out.print(i + " * " + j + " = " + (i * j) + " / ");
			else
			System.out.println(i + " * " + j + " = " + (i * j));
		}
	}
	System.out.println();

	// ������3 2�� ����ѵ� ��� x1 �϶� ���η� ��, �ٹٲٰ� x2 ~~ ,�ݺ�
	for (int i = 1; i < 10; i++)
	{
		for (int j = 2; j < 10; j++)
		{
			
			if(j < 9)
			System.out.print(j + " * " + i + " = " + (i * j) + " / ");
			else
			System.out.println(j + " * " + i + " = " + (i * j));
		}
	}
	System.out.println();

	// 0 0 0 0 4��
	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			System.out.print("0 ");
		}
	System.out.println();
	}
	System.out.println();

	// 1 0 0 0
	// 0 1 0 0
	// 0 0 1 0
	// 0 0 0 1
	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			if(i == j)
			System.out.print("1 ");
			else
			System.out.print("0 ");
		}
	System.out.println();
	}



	}
}
