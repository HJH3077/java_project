package com.ict05.collection;

import java.util.HashMap;
import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		// Map 인터페이스 : Key와 Value를 매핑하는 구조로 이루어짐
		//					Key는 절대 중복될 수 없다.(key는 중복되면 덮어쓰기가된다. Value는 중복가능)
		//					Key를 호출하면 Value가 나온다.
		//					Key를 set컬렉션에 별도로 관리 => keySet()
		
		// 주요메소드
		// add()로 추가, 삽입 안됨
		// 삽입 : put(K key, V value)
		// key를 set에서 관리 : ketSet();
		// containsKey(Object key) : boolean반환 -  인자로 받은 Key가 존재하면 true, 아니면 false
		// containsValue(Object value) : boolean반환 - 인자로 받은 Value가 존재하면 true, 아니면 false
		// get(Object key) : 키를 받아서 value를 리턴한다.
		// remove(Object key) : 키를 받아서 삭제한다.
		// replace(K key, V value) : 치환
		
		// 1. key를 순서있는 숫자로 만들면 for문 사용 가능
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "한국");
		map1.put(2, "미국");
		map1.put(3, "중국");
		map1.put(4, "영국");
		map1.put(5, "태국");
		System.out.println(map1); // { } 블록으로 나옴. 배열이 아님!
		
		map1.put(3, "일본"); // key가 중복된 경우
		System.out.println(map1); // 3번 키의 value가 덮어쓰기됨
		
		map1.put(6, "한국"); // value가 중복(아무 문제없음)
		System.out.println(map1);
		
		// 하나씩 추출(get(key))
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
		
		// 개선된 for문 사용 => keySet() 사용
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
		System.out.println(map1.keySet());
		System.out.println(2);
		
		// iterator 사용 => keySet() 사용
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			int s1 = (int)it.next();
			System.out.println(map1.get(s1));
		}
		System.out.println("==========================");
		
		// 2. key를 문자로 만들면 출력 시 keySet을 사용해야 된다. 
		//    key를 문자로 만들면 출력 시 iterator를 사용해야 된다. // 보통 문자로 사용!
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("이름", "고길동");
		map2.put("나이", "34");
		map2.put("주소", "도봉구");
		map2.put("성별", "남");
		map2.put("취미", "잠자기");
		
		System.out.println(map2.get("이름"));
		System.out.println(map2.get("나이"));
		System.out.println(map2.get("주소"));
		System.out.println(map2.get("성별"));
		System.out.println(map2.get("취미"));
		System.out.println();
		
		// 개선된 for문                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
		for (String k : map2.keySet()) {
			System.out.println(map2.get(k));
		}
		
		// iterator 사용
		Iterator<String> it2 = map2.keySet().iterator();
		while(it2.hasNext()) {
			String k = (String)it2.next();
			System.out.println(map2.get(k));
		}
		
		
		
	}
}
