package com.ict05.collection;

import java.util.LinkedList;

public class Ex07 {
	public static void main(String[] args) {
		// Queue(ť) �������̽��� ������ Ŭ���� : LinkedList
		// Ư¡ : FIFO(First In First Out) - ���� ���� ������ ���� ����
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// �߰�, ���� : add, addFirst, addLast, offer, offerFisrt, offerLast
		linkedList.add("����ȣ");
		linkedList.offer("�ڼ���");
		linkedList.add("�����");
		System.out.println(linkedList);
		
		linkedList.addFirst("�豤��"); // ù �ڸ��� ����
		System.out.println(linkedList);
		
		linkedList.offerFirst("�Ѹ�"); // ù �ڸ��� ����
		System.out.println(linkedList);
		
		if(linkedList.contains("�ڼ���")) {
			System.out.println(linkedList.indexOf("�ڼ���")); // index
			System.out.println(linkedList.get(linkedList.indexOf("�ڼ���"))); // �ڼ����� ��ġ�� ã�Ƽ� ������
			System.out.println(linkedList.getFirst()); // ù �ڸ��� ��ü ������
			System.out.println(linkedList.getLast()); // ������ �ڸ��� ��ü ������
		} else {
			System.out.println("�����ϴ�.");
		}
		System.out.println(linkedList.size() + "���� ��Ұ� ������");
		
		// ġȯ
		if(linkedList.contains("�Ѹ�")) {
			linkedList.set(linkedList.indexOf("�Ѹ�"), "�̴�ȣ");
		} else {
			System.out.println("�����ϴ�.");
		}
		System.out.println(linkedList);
		
		// ���� : remove, removeFirst, removeLast
		linkedList.removeFirst();
		System.out.println(linkedList); // �� �ڸ��� �̴�ȣ ����
		linkedList.removeLast();
		System.out.println(linkedList); // �� �ڸ��� ����� ����
		System.out.println(linkedList.remove(1) + "���� ���� �Ǿ����ϴ�."); 
		// remove(int index)�� ��ȯ���� String�̹Ƿ� print�ص� ���� 
		System.out.println(linkedList);
		
	}
}
