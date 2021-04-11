package com.ict05.collection;

public class Ex01 {
	// 제네닉과 컬렉션 (자료구조)
	// 제네닉 : 컬렉션이 어떤 객체들로 이루어졌는지를 표시하는 객체 타입을 말한다.
	// 컬렉션 : 객체들을 모아서 관리하는 인터페이스를 구현한 것
	// API에서 <T> => 객체 타입을 의미, <E> => 요소(컬렉션 안에 존재하는 객체 하나를 뜻한다.)를 의미
	// Map 형식에서는 <K, V> => K는 Key(키), Value(값)을 의미하며 Key와 Value가 1:1 대응,
	// Key를 호출하면 Value가 나온다.
	// 형식 : 컬렉션<제네닉>
	// 최상위 컬렉션은 Collection<E>, Map<K, V>
	// Collection은 인터페이스 = 인터페이스는 상수와 추상메소드만 저장가능
	// Collection<E>를 상속받은 인터페이스 : Set<E>, List<E>, Queue<E>
	
	// Collection의 주요 메소드 
	// add(E e) : boolean => 해당 컬렉션에 객체추가, 성공하면 true, 실패하면 false
	// addAll(collection<? extends E> C) : boolean 반환
	// 									  => 특정컬렉션에 있는 모든 요소들을 다른 컬렉션에 추가
	// clear() : void => 모든요소 삭제
	// cotainsAll(Collection<>) : boolean 반환 
	//							=> 해당 컬렉션에 인자로 드어온 객체가 존재하면 true, 아니면 false
	// equals(Object B) : boolean 반환 => 지정된 객체와 컬렉션이 같은지 비교
	// isEmpty() : boolean 반환 => 해당 컬렉션이 비어있으면 true
	// iterator() : Iterator<E>
	//				=> 컬렉션 안에 존재하는 요소들을 순서대로 접근하기 위한 Iterator 객체를 반환		
	//				=> 컬렉션 안에 존재하는 요소들을 하나씩 꺼내서 작업할 때 사용한다.
	// remove(Object o) : boolean 반환 => 인자로 들어온 객체를 삭제할 때 사용
	//									=> 성공하면 true, 실패하면 false
	// size() : int 반환 => 컬렉션안에 존재하는 요소들의 수 (for문에 사용가능)
	// toArray() : Object[] => 컬렉션을 배열로 만든다.
	
	
	// nojm73@naver.com에 숙제
		
		
		
		
		
}
