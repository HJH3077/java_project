package com.ict05.collection;

import java.util.Iterator;
import java.util.Stack;

public class Ex05 {
	public static void main(String[] args) {
		// List 인터페이스를 구현한 클래스들 : Stack, ArrayList, Vector
		// Stack(스택) : LIFO (Last In First Out) - 마지막에 들어온 데이터가 맨 처음 나간다.
		// 주요메소드 : add, push, addElement (추가 명령어)		  (추가는 끝에 넣는거)
		//				add(index, E) (삽입 명령어)   			  (삽입은 중간에 넣는거)
		//				pop : 맨 위에 존재하는 객체를 반환하고 삭제한다.
		//				peek : 맨 위에 존재하는 객체를 반환하고 삭제하지 않는다.(무한루프조심)
		// indexOf : 검색(왼쪽, 0부터) => 배열방식
		// elementAt(index) : 위치값을 받아서 해당 객체를 추출
		// get(index) : 위치값을 바아서 해당 객체 추출
		// firstElement : 맨 처음 요소 추출
		// lastElement : 맨 마지막 요소 추출
		// setElement(Element, index) : 치환
		
		Stack<String> stack = new Stack<String>();
		stack.add("둘리");
		stack.addElement("공실이");
		stack.push("마이콜");
		System.out.println(stack);
		
		// 둘리와 공실이 사이에 넣기
		stack.add(1, "도우너"); // 삽입
		stack.add(0, "또치"); // 삽입
		stack.add(1, "뿌끄"); // 삽입 (중복이 아니다)
		stack.add(1, "둘리"); // 중복, 근데 중복 사용가능
		System.out.println(stack);
		System.out.println("====================================");
		
		// pop, peak
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		// contains, indexOf, search, get, elementAt, firstElement, lastElement
		if(stack.contains("둘리")) {
			// 해당 객체의 위치값
			System.out.println(stack.indexOf("둘리") + "번째 위치"); // 배열 방식
			System.out.println(stack.search("둘리") + "번째 위치"); // stack 방식
			// 해당위치의 객체 꺼내기
			System.out.println(stack.get(1)); // 1번 위치에 있는거 가져와
			System.out.println(stack.get(stack.indexOf("둘리"))); // 둘리 찾아서 있으면 가져와
			System.out.println(stack.elementAt(stack.indexOf("둘리"))); // get과 같지만 get을 더 많이씀
			System.out.println(stack.firstElement());
			System.out.println(stack.lastElement());
		} else {
			System.out.println("존재하지않음");
		}
		System.out.println("====================================");
		
		// size, set(치환), setElementAt(치환)
		System.out.println(stack.size() + "개의 요소가 존재합니다.");
		
		// index가 3인 
		stack.set(3, "마이콜");
		// stack.setElementAt("마이콜", 3);
		System.out.println(stack);
		System.out.println("====================================");
		
		
		// 하나씩 꺼내기 (개선된 for문, Iterator(), pop)
		//  			  개선된 for, Iterator = 데이터가 그대로 존재 / pop = 데이터가 삭제됨.
		// 1. 개선된 for문
		for (String k : stack) {
			System.out.println(k);
		}
		System.out.println(stack.size() + "요소가 존재함");
		System.out.println();
		
		// 2. Iterator
		Iterator<String> it = stack.iterator();
		while(it.hasNext()) {
			String msg = (String)it.next();
			System.out.println(msg);
		}
		System.out.println(stack.size() + "요소가 존재함");
		
		while (! stack.isEmpty()) { // stack이 비게되면 그만하기
			String k = stack.pop();
			System.out.println(k + " 삭제됨, 크기는 " + stack.size());
			// 공실이 부터 삭제됨 후입선출
		}
		
		
	}
}
