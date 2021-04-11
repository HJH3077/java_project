package com.ict06.thread;

import java.util.*;

public class Ex17_Car { // �ǹ�1 : list�� arraylist�� ����
	// �÷��� : �ڵ������� �����ϴ� ���� â��
	private List<String> carList = null;

	// ������ : �ش� Ŭ������ ��ü�� �����Ǹ鼭 carList�� �����Ѵ�.
	public Ex17_Car() {
		carList = new ArrayList<>();
	}

	// ȣ�� �� �������� �ڵ��� ����
	public String getCar() {
		String carName = null;
		switch ((int)(Math.random() * 3)) {
			case 0 : carName = "SM5"; break;
			case 1 : carName = "�ű׳ʽ�"; break;
			case 2 : carName = "ī����"; break;		
		
		}
		return carName;
	}
	
	// �� �Ǹ�
	public synchronized String pop() {
		String carName = null;
		// ��� ������
		if(carList.size() == 0) {
			try {
				System.out.println("���� �����. ������ ������ ��ٸ�����");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// ��� ������ 
		// carList���� ���� �������� ���� ���� ���� �Ǹ�.
		carName = (String)carList.remove(carList.size() - 1); 
		System.out.println("�մ��� ���� �簬���ϴ�. �մ��� ������ ���� �̸��� : " + carName);
		
		return carName;	
	}
	
	// �� ���� �� ����Ʈ�� �ֱ�
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("���� ����� �����ϴ�. ���� �̸��� : " + car);
		if(carList.size() == 5) {
			this.notify();
		}
	}
}
