package com.ict01.grammer04;

class Ex05 {
	public static void main(String[] args) 	{
	// ��ø while�� : while���ȿ� while�� ����.

	// ������1
	int i = 2;
	while (i < 10)
	{
		System.out.println(i + "��");
		int j = 1;
		while (j < 10)
		{
			System.out.println(i + " * " + j + " = " + (i * j));
			j++;
		}
		i++;
		}
	System.out.println();

	// ������2
	i = 2;
	while (i < 10)
	{
		System.out.println(i + "��");
		int j = 1;
		while (j < 10)
		{
			if(j == 9)
			System.out.print(i + " * " + j + " = " + (i * j));
			else
			System.out.print(i + " * " + j + " = " + (i * j) + " / ");
			j++;
		}
		System.out.println();
		i++;
	}
	System.out.println();
	
	// ������3
	i = 1;
	while (i < 10)
	{
		int j = 2;
		while (j < 10)
		{
			if(j == 9)
			System.out.print(j + " * " + i + " = " + (i * j));
			else
			System.out.print(j + " * " + i + " = " + (i * j) + " / ");
			j++;
		}
		System.out.println();
		i++;
	}


	// 1 0 0 0
	// 0 1 0 0
	// 0 0 1 0
	// 0 0 0 1


	









	}
}
