package com.ict07.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

	// Externalizable

public class Ex26_VO implements Externalizable { // 2개의 추상메소드를 오버라이드 해야함!
	// 2개의 오버라이드한 메소드안에 객체 직렬화할 멤버를 넣어준다.
	private String name;
	private int age;
	private double weight;
	private boolean gender;
	
	// 생성자
	public Ex26_VO() {}
	
	// 4가지 변수가 들어간 생성자
	public Ex26_VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}
	
	// 직렬화가 쓰는 것이므로 write인 이쪽이 직렬화
	@Override
	public void writeExternal(ObjectOutput out) throws IOException { 
		// 직렬화 대상을 입력
		out.writeObject(name);
		out.writeObject(age);
		// out.writeObject(weight); 직렬화 대상을 뺄거면 역직렬화 대상도 같이 빼야한다. 안빼면 오류남
		out.writeObject(gender);
	}
	
	// read가 읽는 것이므로 이쪽이 역직렬화
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// 역직렬화 대상을 입력
		name = (String)in.readObject();
		age = (int)in.readObject();
		// weight = (double)in.readObject(); 반대로 역직렬화는 빼도 차피 해당 부분만 직렬화 안시키면 그만이라 오류는 안남
		// gender = (boolean)in.readObject(); 그래도 같이 빼는게 이론상 낫긴함
		
	}

	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
	
	
}
