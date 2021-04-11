package com.ict05.collection;

import java.util.ArrayList; 
import java.util.Iterator;
import java.util.List;
import java.util.Vector;



public class Ex06 {
	public static void main(String[] args) {
		// List 인터페이스를 구현한 클래스들 : Stack, ArrayList, Vector
		// ArrayList 와 Vector : 배열과 가장 흡사한 구조
		//						 단, 삽입, 삭제, 추가가 자유롭고 크기를 미리 지정안해도된다.
		//						 ArrayList는 동기화 지원 안함, Vector는 동기화 지원(= 동시접속)
		
		// Set 구조는 순서가 없다. 중복이 안됨.
		// List 구조는 순서가 있고 중복이 가능하다. (저장하고 관리해야하므로)
		// 배열과 보기엔 비슷하지만 실제는 다른 것들과 달리 ArrayList는 진짜로 배열 구조임.
		ArrayList<String> list = new ArrayList<String>();
		// 추가 : add
		list.add("박찬호");
		list.add("류현진");
		list.add("손흥민");
		System.out.println(list);
		
		// 삽입 : add
		list.add(1, "추신수");
		System.out.println(list);
		System.out.println("======================================");
		
		Vector<String> vector = new Vector<String>();
		// 추가 : add, addElement
		vector.add("둘리");
		vector.add("도우너");
		vector.addElement("또치");
		System.out.println(vector);
		
		// 삽입
		vector.add(2, "희동이");
		System.out.println(vector);
		
		if(list.contains("손흥민")) {
			// 검색 : 오브젝트를 받아 위치값 검색
			System.out.println(list.indexOf("손흥민") + "번째 위치"); 
			// 검색 : 해당 위치에 있는 개체 검색
			System.out.println(list.get(3)); 						
			System.out.println(list.get(list.indexOf("손흥민"))); // 손흥민 위치를 찾아서 꺼내라.						
		} else {
			System.out.println("존재하지 않습니다.");
		}
		System.out.println(list.size() + "요소가 존재합니다.");
		
		// 치환 : set
		list.set(3, "이대호");
		System.out.println(list);
		
		// 추신수가 있으면 추신수를 이종범으로 변경해라
		if(list.contains("추신수")) {
			list.set(list.indexOf("추신수"), "이종범");
		} else {
			System.out.println("없다.");
		}
		System.out.println();
		
		// 하나씩 꺼내서 (개선된 for, Iterator)
		for (String k : list) {
			System.out.println(k);
		}
		System.out.println();
			
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s1 = (String) it.next();
			System.out.println(s1);
		}
		
	}
}
