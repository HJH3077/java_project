package com.ict01.grammer04;

class Ex07 {
	public static void main(String[] args)
	{
	// break�� : ���� �ݺ����� Ż���� �� ���.
	// continue�� : continue�� ������ ���๮�� �����ϰ� ���� ȸ���� �ݺ�����
	for (int i = 1; i < 11; i++)
	{
		if(i == 4) break;  // 1 2 3 ��� 4�� �������ͼ� ������
		System.out.print(i + " ");
	}
	System.out.println();


	for (int i = 1; i < 11; i++)
	{
		if(i == 4) continue; // 1 2 3 ��� 4���� continue ���� ���๮�� �����ϰ� 5���� �ٽý���
		System.out.print(i + " ");
	}
	System.out.println();


	int k = 11;
	while (k < 21)
	{	
		if(k == 17) break;
		System.out.print(k + " ");
		k++;
	}
	System.out.println();
	System.out.println();

	/*
	k = 11;
	while (k < 21)
	{	
		if(k == 17) continue; // ���ѷ�����. continue������ �������� ������ k�� 17���� �������� �ʰ� 17���� ��� ������ ���Ե�.
							  // �׷��� while���� continue�� �� �Ⱦ�. ���ѷ����� ������ ���� ������.
		System.out.print(k + " ");
		k++;
	}
	System.out.println();
	*/



	
	// ��ø for������ break ��� : j= 3�϶� break;
	for (int i = 1; i < 4; i++) // i = 1 j = 1, i = 1 j =2 ���� j�� 3�� break�� �ȳ��� i = 2���� �ٽ��ϰ� �ٽ� j = 2���� i�� 3����
	{
		for(int j = 1; j< 6; j++){
			if(j == 3) break;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println();

	// ��ø for������ break ��� : i = 2�϶� break;
	for (int i = 1; i < 4; i++) // i = 1, j = 1 ~ 5 ���� i = 2�κ��� ��� ��ŵ, i = 3 j = 1 ~ 5���Ǿ� i = 2�κ��� ��ξ�����.
	{
		for(int j = 1; j< 6; j++){
			if(i == 2) break;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println("====================================");
	

		// ��ø for������ continue ��� : j= 3�϶� continue;
	for (int i = 1; i < 4; i++) // j = 3�϶��� �Ʒ��� ��ɹ��� ������ϹǷ� i = 1 ~ 3 ��ο��� j = 3�� ����.
	{
		for(int j = 1; j< 6; j++){
			if(j == 3) continue;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println();

	// ��ø for������ continue ��� : i = 2�϶� continue;
	for (int i = 1; i < 4; i++) // i = 2�϶��� �Ʒ��� ��ɹ��� ��� ���� ���ϹǷ� i = 2�� �� j = 1 ~ 5�� ��� �������. 
	{
		for(int j = 1; j< 6; j++){
			if(i == 2) continue;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println();



	}
}
