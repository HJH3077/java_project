package com.ict03.class01;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		// 5���� �̸�, ����, ����, ���� ������ �޾Ƽ� �̸�, ����, ���, ����, ������ ���ϰ� ��������
		
		// �Է¹޾Ƽ� ������ �ֱ�
		Scanner sc = new Scanner(System.in);
		Ex09[] arr = new Ex09[5]; // Ŭ������ �����ϴ� �迭, Ex09�� �ڷ����̵�.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("���� : ");
			int kor = sc.nextInt();
			System.out.print("���� : ");
			int eng = sc.nextInt();
			System.out.print("���� : ");
			int math = sc.nextInt();
			
			Ex09 person = new Ex09();
			person.setName(name);
			person.p_sum(kor, eng, math);
			person.p_avg();
			person.p_hak();
			
			arr[i] = person; // 2���� �迭 ���� ������ ��. person�� name, sum, avg, hak, rank�� �ִ� �迭
							 // arr�� �� ���� �Ŷ� �����δ� 1���� �迭��.
		}
		
		// ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) continue;
					if(arr[i].getSum() < arr[j].getSum())
						arr[i].setRank(arr[i].getRank() + 1); // �ٲٷ��� setter�� �ؾ���.
			}
		}
		
		// ����
		// �ڸ��� �����ϱ� ���� �ӽ�����
		Ex09 tmp = new Ex09();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
		// ���
		System.out.println("�� ��\t�� ��\t�� ��\t�� ��\t�� ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + "\t");
			System.out.print(arr[i].getSum() + "\t");
			System.out.print(arr[i].getAvg() + "\t");
			System.out.print(arr[i].getHak() + "\t");
			System.out.println(arr[i].getRank());
		}
		
		
		
		
		
		
		
	}
}
