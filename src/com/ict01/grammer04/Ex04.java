package com.ict01.grammer04;

class Ex04{
	public static void main(String[] args) {
	// while�� : for���� ���� �ݺ���
	// ���� 1) : �ʱ��;											���� 2) �ʱ��;
	//			 while(���ǽ�){												while(true){				
	//			 ���ǽ��� ���϶� ������ ����;								* if(������������) break;(����Ż��) // ������� �� Ż��
	//			 ���ǽ��� ���϶� ������ ����;								���ǽ��� ���϶� ������ ����;
	//			 ������;													* if(������������) break;(����Ż��) // ������� �� Ż��
	//			 }     * while���� ���� ������ ���ǽ����� �̵�.				������;
	//																		}
	
	// 0 ~ 15���� �������
	int i = 0;
	while (i < 16) // for(int i = 0; i < 16; i++)�� ����
	{			   // �������� for���� ������ i�� for�������� ���������� while�� �ۿ� �ʱⰪ�� ���������Ƿ� ���߿��� ��밡��
		System.out.println(i);
		i++;
	}
	System.out.println();
	
	i = 0;
	while (true){
		if(i >= 16) break;
		System.out.println(i);
		i++;
	}
	System.out.println();
	
	// 0 ~ 10���� ¦���� ���
	i = 0;
	while (i <= 10){
		if(i % 2 == 0){
		System.out.print(i + " ");
		}
		i++;	
	}
	System.out.println();

	/*
	i = 0;
	while (true)
	{
		if(i >= 11) break;
		if(i % 2 == 0)
			System.out.print(i + " ");
		i++;
	}
	System.out.println();
	*/

	// 0 ~ 10���� Ȧ���� ��� 
	i = 0;
	while (i <= 10){
		if(i % 2 == 1){
		System.out.print(i + " ");
		}
		i++;	
	}
	System.out.println();

	// 0 ~ 50���� 7�� ����� ���
	i = 0;
	while (i <= 50){
		if(i % 7 == 0)
			if(i != 0){
			System.out.print(i + " ");
		}
		i++;	
	}
	System.out.println();
	System.out.println();

	// 5�� ���
	i = 1;
	System.out.println("5��");
	while (i <= 9){
		
		System.out.println("5 * " + i + " = " + (5 * i));
		i++;	
	}
	System.out.println();


	// 0 0 0 0 4�� ���
	i = 0;
	while (i < 4)
	{
		for (int j = 0; j < 4; j++)
		{
			System.out.print("0 ");
		}
		System.out.println();
		i++;
		
	}
	System.out.println();

	/*
	i = 1;
	while (i < 17)
	{
		System.out.print("0 ");
		if (i%4 == 0)
		{
			System.out.println();
		}
		i++;
	}
	System.out.println();
	*/

	// 0 ~ 10���� ������ ���ϱ� (0 + 1 + 2 + 3 ... + 10)
	i = 0;
	int sum = 0;
	while (i < 11)
	{
		sum = sum + i;
		i++;
	}
	System.out.println("�� : " + sum);

	// Ȧ���� ¦���� �������� ���� ���Ͻÿ�
	i = 0;
	int odd = 0;
	int even = 0;
	while (i < 11)
	{
		if(i % 2 == 1) {
			odd = odd + i;
			}
		else {
			even = even + i;
			}
		i++;
	}
	System.out.println("odd�� : " + odd);
	System.out.println("even�� : " + even);

	}
}
