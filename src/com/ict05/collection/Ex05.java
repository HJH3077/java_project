package com.ict05.collection;

import java.util.Iterator;
import java.util.Stack;

public class Ex05 {
	public static void main(String[] args) {
		// List �������̽��� ������ Ŭ������ : Stack, ArrayList, Vector
		// Stack(����) : LIFO (Last In First Out) - �������� ���� �����Ͱ� �� ó�� ������.
		// �ֿ�޼ҵ� : add, push, addElement (�߰� ��ɾ�)		  (�߰��� ���� �ִ°�)
		//				add(index, E) (���� ��ɾ�)   			  (������ �߰��� �ִ°�)
		//				pop : �� ���� �����ϴ� ��ü�� ��ȯ�ϰ� �����Ѵ�.
		//				peek : �� ���� �����ϴ� ��ü�� ��ȯ�ϰ� �������� �ʴ´�.(���ѷ�������)
		// indexOf : �˻�(����, 0����) => �迭���
		// elementAt(index) : ��ġ���� �޾Ƽ� �ش� ��ü�� ����
		// get(index) : ��ġ���� �پƼ� �ش� ��ü ����
		// firstElement : �� ó�� ��� ����
		// lastElement : �� ������ ��� ����
		// setElement(Element, index) : ġȯ
		
		Stack<String> stack = new Stack<String>();
		stack.add("�Ѹ�");
		stack.addElement("������");
		stack.push("������");
		System.out.println(stack);
		
		// �Ѹ��� ������ ���̿� �ֱ�
		stack.add(1, "�����"); // ����
		stack.add(0, "��ġ"); // ����
		stack.add(1, "�Ѳ�"); // ���� (�ߺ��� �ƴϴ�)
		stack.add(1, "�Ѹ�"); // �ߺ�, �ٵ� �ߺ� ��밡��
		System.out.println(stack);
		System.out.println("====================================");
		
		// pop, peak
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		// contains, indexOf, search, get, elementAt, firstElement, lastElement
		if(stack.contains("�Ѹ�")) {
			// �ش� ��ü�� ��ġ��
			System.out.println(stack.indexOf("�Ѹ�") + "��° ��ġ"); // �迭 ���
			System.out.println(stack.search("�Ѹ�") + "��° ��ġ"); // stack ���
			// �ش���ġ�� ��ü ������
			System.out.println(stack.get(1)); // 1�� ��ġ�� �ִ°� ������
			System.out.println(stack.get(stack.indexOf("�Ѹ�"))); // �Ѹ� ã�Ƽ� ������ ������
			System.out.println(stack.elementAt(stack.indexOf("�Ѹ�"))); // get�� ������ get�� �� ���̾�
			System.out.println(stack.firstElement());
			System.out.println(stack.lastElement());
		} else {
			System.out.println("������������");
		}
		System.out.println("====================================");
		
		// size, set(ġȯ), setElementAt(ġȯ)
		System.out.println(stack.size() + "���� ��Ұ� �����մϴ�.");
		
		// index�� 3�� 
		stack.set(3, "������");
		// stack.setElementAt("������", 3);
		System.out.println(stack);
		System.out.println("====================================");
		
		
		// �ϳ��� ������ (������ for��, Iterator(), pop)
		//  			  ������ for, Iterator = �����Ͱ� �״�� ���� / pop = �����Ͱ� ������.
		// 1. ������ for��
		for (String k : stack) {
			System.out.println(k);
		}
		System.out.println(stack.size() + "��Ұ� ������");
		System.out.println();
		
		// 2. Iterator
		Iterator<String> it = stack.iterator();
		while(it.hasNext()) {
			String msg = (String)it.next();
			System.out.println(msg);
		}
		System.out.println(stack.size() + "��Ұ� ������");
		
		while (! stack.isEmpty()) { // stack�� ��ԵǸ� �׸��ϱ�
			String k = stack.pop();
			System.out.println(k + " ������, ũ��� " + stack.size());
			// ������ ���� ������ ���Լ���
		}
		
		
	}
}
