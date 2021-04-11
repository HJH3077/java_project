package com.ict05.collection;

import java.util.LinkedList;

public class Ex07 {
	public static void main(String[] args) {
		// Queue(큐) 인터페이스를 구현한 클래스 : LinkedList
		// 특징 : FIFO(First In First Out) - 먼저 들어온 정보가 먼저 나감
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// 추가, 삽입 : add, addFirst, addLast, offer, offerFisrt, offerLast
		linkedList.add("박찬호");
		linkedList.offer("박세리");
		linkedList.add("김미현");
		System.out.println(linkedList);
		
		linkedList.addFirst("김광현"); // 첫 자리에 넣음
		System.out.println(linkedList);
		
		linkedList.offerFirst("둘리"); // 첫 자리에 넣음
		System.out.println(linkedList);
		
		if(linkedList.contains("박세리")) {
			System.out.println(linkedList.indexOf("박세리")); // index
			System.out.println(linkedList.get(linkedList.indexOf("박세리"))); // 박세리의 위치를 찾아서 가져와
			System.out.println(linkedList.getFirst()); // 첫 자리의 객체 가져와
			System.out.println(linkedList.getLast()); // 마지막 자리의 객체 가져와
		} else {
			System.out.println("없습니다.");
		}
		System.out.println(linkedList.size() + "개의 요소가 존재함");
		
		// 치환
		if(linkedList.contains("둘리")) {
			linkedList.set(linkedList.indexOf("둘리"), "이대호");
		} else {
			System.out.println("없습니다.");
		}
		System.out.println(linkedList);
		
		// 삭제 : remove, removeFirst, removeLast
		linkedList.removeFirst();
		System.out.println(linkedList); // 앞 자리의 이대호 삭제
		linkedList.removeLast();
		System.out.println(linkedList); // 뒷 자리의 김미현 삭제
		System.out.println(linkedList.remove(1) + "님이 삭제 되었습니다."); 
		// remove(int index)의 반환형이 String이므로 print해도 찍힘 
		System.out.println(linkedList);
		
	}
}
