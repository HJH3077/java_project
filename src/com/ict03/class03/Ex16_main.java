package com.ict03.class03;

public class Ex16_main {
	public static void main(String[] args) {
		// 자식을 호출하는 순간 부모클래스가 만들어진 후 자식클래스가 만들어진다.
		Ex15 person1 = new Ex15(); // Ex15를 만들었지만 Ex14가 먼저 만들어짐 
		// 실제로 실행 시 부모클래스의 생성자가 먼저 실행함
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.id);
		System.out.println();
		
		Ex15 person2 = new Ex15("임꺽정"); // 오버로딩으로 자식클래스의 String name의 인자가 있는 생성자로 감
		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(person2.id);
		// Ex15()가 아닌 Ex15(String name)의 생성자가 실행 되므로 Ex15()의 id와 name이 실행되는게 아니므로
		// Ex14의 id가 나오고 Ex15실행으로 이름이 바뀜
		// 근데 super()가 생략되어 있으므로 Ex14()도 실행해서 age는 Ex14()의 실행으로 바뀜
		System.out.println();
		person2.prn();
		
	}
}
