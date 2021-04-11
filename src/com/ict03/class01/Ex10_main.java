package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*Ex10 coffee = new Ex10();
		coffee.setName("카페모카");
		coffee.setPrice(3500);
		
		Ex10 juice = new Ex10();
		juice.setName("딸기스무디");
		juice.setPrice(4000);
		
		Ex10 tea = new Ex10();
		tea.setName("녹차");
		tea.setPrice(3000);
		
		Ex10[] arr = {coffee, juice, tea};
		
		
		System.out.print("금액을 입력하세요 : ");
		int input = sc.nextInt();*/
		
		System.out.print("몇 명인가요? : ");
		int su = sc.nextInt();
		// 상품명과 가격(Ex10)을 가지는 배열
		Ex10[] offer = new Ex10[su];
		for (int i = 0; i < offer.length; i++) {
			System.out.println("1.아메리카노(2500)");
			System.out.println("2.카페모카(3000)");
			System.out.println("3.카페라떼(3500)");
			System.out.println("4.자몽쥬스(3000)");
			System.out.print("선택하세요 >>> ");
			int menu = sc.nextInt();
			Ex10 product = new Ex10();
			if (menu == 1) {
				product.setName("아메리카노");
				product.setPrice(2500);
			} else if (menu == 2) {
				product.setName("카페모카");
				product.setPrice(3000);
			} else if (menu == 3) {
				product.setName("카페라떼");
				product.setPrice(3500);
			} else if (menu == 4) {
				product.setName("자몽쥬스");
				product.setPrice(3000);
			}

			offer[i] = product; // 상품 i번의 주문 Ex08의 예제와 달리 if drink로 일일히 금액을 뺄 필요없이
								// 주문 배열을 만들어서 해당 주문일 때 가격을 나오게함.
		}
		
		// 전체금액
		int sum = 0;
		for (int i = 0; i < offer.length; i++) {
			sum = sum + offer[i].getPrice();
		}
		System.out.println("총 액 : " + sum);
		System.out.print("입 금 액 : ");
		int input = sc.nextInt();
		System.out.print("잔 돈 : " + (input - sum));
		
		
		
		
		/*for(int k = 0; k < su; k++) {	
		System.out.println("1.카페모카\t  2.딸기스무디\t      3.녹차");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getPrice() <= input)
				System.out.print("\tO\t");
			else
				System.out.print("\tX\t");				
		}
		System.out.println();
		
	
		System.out.print("번호로 선택하세요 >> ");
		int drink = sc.nextInt();
		int output = 0;
		if(drink == 1)
			output = input - coffee.getPrice();
		else if(drink == 2)
			output = input - juice.getPrice();
		else if(drink == 3)
			output = input - tea.getPrice();
		
		System.out.println("잔액은 : " + output);
		input = output;


		
			
			}*/
		}
	
		
		
	}
