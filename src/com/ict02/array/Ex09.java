package com.ict02.array;

public class Ex09 {
	public static void main(String[] args) {
		int[][] persons = new int[5][];
		
		// ��ȣ, ����, ���, ����, ����
		int[] person01 = {1, 270, 90, 'A', 1};
		int[] person02 = {2, 210, 70, 'C', 1};
		int[] person03 = {3, 180, 60, 'F', 1};
		int[] person04 = {4, 300, 100, 'A', 1};
		int[] person05 = {5, 285, 95, 'A', 1};
		
		persons[0] = person01;
		persons[1] = person02;
		persons[2] = person03;
		persons[3] = person04;
		persons[4] = person05;
		
		// ���� ���ϱ�
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons.length; j++) {
				if(persons[i][1] < persons[j][1])
					persons[i][4]++;
			}
		}
		
		// ���� (���� ���İ� �ٸ� ���� �� �迭�� �� ������ �������� �ְ� ���η� ����� �������µ� 
		//		 ������ �� �迭�� �� ����� ���� ������ ������ �������)
		// ������ �Ϸ��� �ӽ������� �ʿ��ѵ� �� �迭�� �Űܾ� �ϴ� �ӽ����� tmp�� �迭�� �����ߵ�
		
		int[] tmp = new int[5];
		System.out.println("�� ��\t�� ��\t�� ��\t�� ��\t�� ��");
		for (int i = 0; i < person01.length - 1; i++) { // i�� 0 ~ ���� ������(�������� ��i�� ���ʿ䰡 �����Ƿ�)
			for (int j = i + 1; j < person01.length; j++) { // j�� i+1���� ������(��i �������� �̹Ƿ� +1)
				if(persons[i][4] > persons[j][4]) { // ��(i)�� ��(j)���� ũ�� �ڸ��� �ٲٴ� ���̹Ƿ�
					tmp = persons[i];
					persons[i] = persons[j];
					persons[j] = tmp;
				}
			}
		}


		// ���
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons[i].length; j++) {
				if(j == 3)
					System.out.print((char)(persons[i][j]) + "\t");	
				else			
					System.out.print(persons[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
	}
}
