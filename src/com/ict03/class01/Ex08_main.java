package com.ict03.class01;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
	Ex08 coffee = new Ex08(); // 각각 name과 price를 가지고 있음.
	coffee.setName("커피음료");
	coffee.setPrice(1800);
	
	Ex08 ion = new Ex08();	  // 같은 설계도로 만들었으므로 가지고 있는 구조가 똑같음
	ion.setName("이온음료");
	ion.setPrice(1500);
	
	Ex08 cola = new Ex08();	  // 클래스를 사용하는 이유. 같은걸 재사용해서 똑같이 만들 수 있다.
	cola.setName("탄산음료");
	cola.setPrice(2000);
	
	Ex08 juice = new Ex08();
	juice.setName("과일음료");
	juice.setPrice(2200);
	
	// 배열에 넣자
	// 자료형[] 이름 = new 자료형[갯수]
	/*
	Ex08[] arr = new Ex08[4];
	arr[0] = coffee;
	arr[1] = ion;
	arr[2] = cola;
	arr[3] = juice;
	*/
	
	Ex08[] arr = {coffee, ion, cola, juice};
	// arr[]이 가지고 있는 이름, 가격들을 출력하다.
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i].getName() + ", " + arr[i].getPrice());
	}
	
	
	// 금액 투입	
	// 1500미만이면 금액 부족(제일싼게 1500)
	// 1500이상이면 구입 가능(가격에 맞는)
	/*Scanner sc = new Scanner(System.in);
	System.out.print("금액을 입력하세요 : ");
	int input = sc.nextInt();
	if (input < 1500) 
		System.out.println("금액이 부족합니다.");
	else {
		System.out.println("1.커 피\t2.이 온\t3.탄 산\t4.쥬 스");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getPrice() <= input)
				System.out.print("    O\t"); // 돈 넣으면 자판기에 불 켜지는 것을 표현.
			else
				System.out.print("    X\t");
		}
	}
	System.out.println();*/
	
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int input = sc.nextInt();
		while (true) {
		if (input < 1500) 
			System.out.println("금액이 부족합니다.");
		else {
			System.out.println("1.커 피\t2.이 온\t3.탄 산\t4.쥬 스");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].getPrice() <= input)
					System.out.print("    O\t"); // 돈 넣으면 자판기에 불 켜지는 것을 표현.
				else
					System.out.print("    X\t");
			}
		}
		System.out.println();
		// 메뉴 선택
		System.out.print("번호로 선택하세요 >>  ");
		int drink = sc.nextInt();
		int output = 0;
		if(drink == 1)
			output = input - arr[0].getPrice();
		else if(drink == 2)
			output = input - arr[1].getPrice();
		else if(drink == 3)
			output = input - arr[2].getPrice();
		else if(drink == 4)
			output = input - arr[3].getPrice();
		
		System.out.println("잔돈 : " + output);
		input = output;
		
		if(input > 1500)
		System.out.print("더 구매하시겠습니까? (1.yes 2.no) >>>  ");
		int choice = sc.nextInt();
		if(choice == 2) break;
		
	}
	
	
	// 추가 과제 : 잔돈이 남았을 때 다시 물어볼 수 있도록 while문 사용.
	
	
	
	}
}
