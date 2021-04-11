package com.ict01.grammer04;

class Ex08 
{
	public static void main(String[] args) {
	// break label: 레이블이 지정한 블록을 탈출한다.
	//				단순 for문일때는 break와 break label의 차이가 없다. 즉, 다중 for문에서만 의미가 있음.
	// continue label : 레이블이 지정한 블록의 증감식으로 이동한다.
	//					단순 for문일때는 continue와 continue label의 차이가 없다. 즉, 다중 for문에서만 의미가 있음.
	// 레이블만드는 방법 : 원하는 반복문 위나 앞에 '레이블명 : '
	
	for (int i = 1; i < 11; i++) // 1 ~ 4까지 출력
	{
		if (i == 5) break;
		{
			System.out.print(i + " ");
		}
	}
	System.out.println();
		
	esc1:
	for (int i = 1; i < 11; i++) // 위와 다를게 없음
	{
		if (i == 5) break esc1;
		{
			System.out.print(i + " ");
		}
	}
	System.out.println();
	System.out.println();

	for (int i = 1; i < 4; i++) // j = 1,2 말고는 안찍힘 i = 1 ~ 3
	{
		for (int j = 1; j < 6; j++)
		{
			if(j == 3) break;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println();

	esc2 :
	for (int i = 1; i < 4; i++) // 위와 달리 i = 1일때 돌리다가 j = 3이 되는 순간 바로 레이블이 지적한 for문 자체를 빠져나감.
								// 즉, 2중 for문이므로 바깥쪽의 for문을 빠져나가면 거기서 for문이 끝나게됨. i = 1일때 j = 1,2만 출력
	{
		for (int j = 1; j < 6; j++)
		{
			if(j == 3) break esc2;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println(" ============================================= ");



	for (int i = 1; i < 11; i++) // 1 ~ 4이후 5를 넘기고 6 ~ 10 까지 출력
	{
		if (i == 5) continue;
		{
			System.out.print(i + " ");
		}
	}
	System.out.println();
		
	esc3:
	for (int i = 1; i < 11; i++) // 위와 다를게 없음
	{
		if (i == 5) continue esc3;
		{
			System.out.print(i + " ");
		}
	}
	System.out.println();
	System.out.println();


	for (int i = 1; i < 4; i++) // i = 1 ~ 3, j = 1, 2이후 3제외 4,5 
	{							// continue하면 j의 for문의 증감식으로 감
		for (int j = 1; j < 6; j++)
		{
			if(j == 3) continue;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println();

	esc4 :
	for (int i = 1; i < 4; i++) // i = 1 ~ 3, j = 1, 2이후 i의 for문의 증감식으로 가므로 j는 1,2만 찍히고 i가 1~3으로 증가
	{							// 즉, continue하면 label이 있는 i의 for문의 증감식으로 감.
		for (int j = 1; j < 6; j++)
		{
			if(j == 3) continue esc4;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println();



	}
}
