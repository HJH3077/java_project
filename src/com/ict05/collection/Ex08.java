package com.ict05.collection;

import java.util.HashMap;
import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		// Map �������̽� : Key�� Value�� �����ϴ� ������ �̷����
		//					Key�� ���� �ߺ��� �� ����.(key�� �ߺ��Ǹ� ����Ⱑ�ȴ�. Value�� �ߺ�����)
		//					Key�� ȣ���ϸ� Value�� ���´�.
		//					Key�� set�÷��ǿ� ������ ���� => keySet()
		
		// �ֿ�޼ҵ�
		// add()�� �߰�, ���� �ȵ�
		// ���� : put(K key, V value)
		// key�� set���� ���� : ketSet();
		// containsKey(Object key) : boolean��ȯ -  ���ڷ� ���� Key�� �����ϸ� true, �ƴϸ� false
		// containsValue(Object value) : boolean��ȯ - ���ڷ� ���� Value�� �����ϸ� true, �ƴϸ� false
		// get(Object key) : Ű�� �޾Ƽ� value�� �����Ѵ�.
		// remove(Object key) : Ű�� �޾Ƽ� �����Ѵ�.
		// replace(K key, V value) : ġȯ
		
		// 1. key�� �����ִ� ���ڷ� ����� for�� ��� ����
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "�ѱ�");
		map1.put(2, "�̱�");
		map1.put(3, "�߱�");
		map1.put(4, "����");
		map1.put(5, "�±�");
		System.out.println(map1); // { } ������� ����. �迭�� �ƴ�!
		
		map1.put(3, "�Ϻ�"); // key�� �ߺ��� ���
		System.out.println(map1); // 3�� Ű�� value�� ������
		
		map1.put(6, "�ѱ�"); // value�� �ߺ�(�ƹ� ��������)
		System.out.println(map1);
		
		// �ϳ��� ����(get(key))
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		System.out.println(map1.get(4));
		System.out.println(map1.get(5));
		System.out.println();
		
		for (int i = 1; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}
		System.out.println(1);
		
		// ������ for�� ��� => keySet() ���
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
		System.out.println(map1.keySet());
		System.out.println(2);
		
		// iterator ��� => keySet() ���
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			int s1 = (int)it.next();
			System.out.println(map1.get(s1));
		}
		System.out.println("==========================");
		
		// 2. key�� ���ڷ� ����� ��� �� keySet�� ����ؾ� �ȴ�. 
		//    key�� ���ڷ� ����� ��� �� iterator�� ����ؾ� �ȴ�. // ���� ���ڷ� ���!
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("�̸�", "��浿");
		map2.put("����", "34");
		map2.put("�ּ�", "������");
		map2.put("����", "��");
		map2.put("���", "���ڱ�");
		
		System.out.println(map2.get("�̸�"));
		System.out.println(map2.get("����"));
		System.out.println(map2.get("�ּ�"));
		System.out.println(map2.get("����"));
		System.out.println(map2.get("���"));
		System.out.println();
		
		// ������ for��                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
		for (String k : map2.keySet()) {
			System.out.println(map2.get(k));
		}
		
		// iterator ���
		Iterator<String> it2 = map2.keySet().iterator();
		while(it2.hasNext()) {
			String k = (String)it2.next();
			System.out.println(map2.get(k));
		}
		
		
		
	}
}
