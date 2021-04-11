package com.ict01.grammer04;

class Ex07 {
	public static void main(String[] args)
	{
	// break문 : 현재 반복문을 탈출할 때 사용.
	// continue문 : continue문 이하의 수행문을 포기하고 다음 회차를 반복수행
	for (int i = 1; i < 11; i++)
	{
		if(i == 4) break;  // 1 2 3 찍고 4때 빠져나와서 안찍음
		System.out.print(i + " ");
	}
	System.out.println();


	for (int i = 1; i < 11; i++)
	{
		if(i == 4) continue; // 1 2 3 찍고 4때는 continue 밑의 수행문을 포기하고 5부터 다시시작
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
		if(k == 17) continue; // 무한루프임. continue밑으로 내려가지 않으니 k가 17에서 증가하지 않고 17에서 계속 루프를 돌게됨.
							  // 그래서 while문은 continue를 잘 안씀. 무한루프에 빠지기 쉽기 때문에.
		System.out.print(k + " ");
		k++;
	}
	System.out.println();
	*/



	
	// 중첩 for문에서 break 사용 : j= 3일때 break;
	for (int i = 1; i < 4; i++) // i = 1 j = 1, i = 1 j =2 이후 j가 3은 break로 안나옴 i = 2부터 다시하고 다시 j = 2까지 i가 3까지
	{
		for(int j = 1; j< 6; j++){
			if(j == 3) break;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println();

	// 중첩 for문에서 break 사용 : i = 2일때 break;
	for (int i = 1; i < 4; i++) // i = 1, j = 1 ~ 5 이후 i = 2부분은 모두 스킵, i = 3 j = 1 ~ 5가되어 i = 2부분은 모두없어짐.
	{
		for(int j = 1; j< 6; j++){
			if(i == 2) break;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println("====================================");
	

		// 중첩 for문에서 continue 사용 : j= 3일때 continue;
	for (int i = 1; i < 4; i++) // j = 3일때는 아래의 명령문을 실행안하므로 i = 1 ~ 3 모두에서 j = 3이 없다.
	{
		for(int j = 1; j< 6; j++){
			if(j == 3) continue;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println();

	// 중첩 for문에서 continue 사용 : i = 2일때 continue;
	for (int i = 1; i < 4; i++) // i = 2일때는 아래의 명령문을 계속 실행 안하므로 i = 2일 때 j = 1 ~ 5가 모두 수행안함. 
	{
		for(int j = 1; j< 6; j++){
			if(i == 2) continue;
			System.out.println("i = " + i + ", j = " + j);
		}
	}
	System.out.println();



	}
}
