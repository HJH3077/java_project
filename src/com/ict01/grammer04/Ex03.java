package com.ict01.grammer04;

class Ex03 
{
	public static void main(String[] args) {
	// 다중 for문 : for문안에 for문이 존재함.
	for (int i = 1; i < 4; i++){
		for (int j = 1; j < 6; j++)
		{
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	
	// 구구단1 2단부터 아래로 쭉
	for (int i = 2; i < 10; i++)
	{
		System.out.println(i + "단");
		for (int j = 1; j < 10; j++)
		{
			System.out.println(i + " * " + j + " = " + (i * j));
		}
	}
	System.out.println();

	// 구구단2 2단 가로로 쭉, 3단은 줄바꾸고 쭉, 반복
	for (int i = 2; i < 10; i++)
	{
		System.out.println(i + "단");
		for (int j = 1; j < 10; j++)
		{
			if(j < 9)
			System.out.print(i + " * " + j + " = " + (i * j) + " / ");
			else
			System.out.println(i + " * " + j + " = " + (i * j));
		}
	}
	System.out.println();

	// 구구단3 2와 비슷한데 대신 x1 일때 가로로 쭉, 줄바꾸고 x2 ~~ ,반복
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

	// 0 0 0 0 4줄
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
