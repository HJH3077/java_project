package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*Ex10 coffee = new Ex10();
		coffee.setName("ī���ī");
		coffee.setPrice(3500);
		
		Ex10 juice = new Ex10();
		juice.setName("���⽺����");
		juice.setPrice(4000);
		
		Ex10 tea = new Ex10();
		tea.setName("����");
		tea.setPrice(3000);
		
		Ex10[] arr = {coffee, juice, tea};
		
		
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int input = sc.nextInt();*/
		
		System.out.print("�� ���ΰ���? : ");
		int su = sc.nextInt();
		// ��ǰ��� ����(Ex10)�� ������ �迭
		Ex10[] offer = new Ex10[su];
		for (int i = 0; i < offer.length; i++) {
			System.out.println("1.�Ƹ޸�ī��(2500)");
			System.out.println("2.ī���ī(3000)");
			System.out.println("3.ī���(3500)");
			System.out.println("4.�ڸ��꽺(3000)");
			System.out.print("�����ϼ��� >>> ");
			int menu = sc.nextInt();
			Ex10 product = new Ex10();
			if (menu == 1) {
				product.setName("�Ƹ޸�ī��");
				product.setPrice(2500);
			} else if (menu == 2) {
				product.setName("ī���ī");
				product.setPrice(3000);
			} else if (menu == 3) {
				product.setName("ī���");
				product.setPrice(3500);
			} else if (menu == 4) {
				product.setName("�ڸ��꽺");
				product.setPrice(3000);
			}

			offer[i] = product; // ��ǰ i���� �ֹ� Ex08�� ������ �޸� if drink�� ������ �ݾ��� �� �ʿ����
								// �ֹ� �迭�� ���� �ش� �ֹ��� �� ������ ��������.
		}
		
		// ��ü�ݾ�
		int sum = 0;
		for (int i = 0; i < offer.length; i++) {
			sum = sum + offer[i].getPrice();
		}
		System.out.println("�� �� : " + sum);
		System.out.print("�� �� �� : ");
		int input = sc.nextInt();
		System.out.print("�� �� : " + (input - sum));
		
		
		
		
		/*for(int k = 0; k < su; k++) {	
		System.out.println("1.ī���ī\t  2.���⽺����\t      3.����");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getPrice() <= input)
				System.out.print("\tO\t");
			else
				System.out.print("\tX\t");				
		}
		System.out.println();
		
	
		System.out.print("��ȣ�� �����ϼ��� >> ");
		int drink = sc.nextInt();
		int output = 0;
		if(drink == 1)
			output = input - coffee.getPrice();
		else if(drink == 2)
			output = input - juice.getPrice();
		else if(drink == 3)
			output = input - tea.getPrice();
		
		System.out.println("�ܾ��� : " + output);
		input = output;


		
			
			}*/
		}
	
		
		
	}
