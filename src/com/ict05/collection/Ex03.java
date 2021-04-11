package com.ict05.collection;

// VO(ValueObject) : 데이터를 저장하는 객체를 뜻한다.
//					 getter만 사용하면 수저할 수 없게 만들 수 있다. (private 이므로)
public class Ex03 {
	private String name;
	private int price;
	
	public Ex03() { // 기본생성자
		
	}

	public Ex03(String name, int price) { // 변수를 갖는 생성자
		super();
		this.name = name;
		this.price = price;
	}

	
	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
