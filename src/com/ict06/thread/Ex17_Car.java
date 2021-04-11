package com.ict06.thread;

import java.util.*;

public class Ex17_Car { // 의문1 : list와 arraylist의 차이
	// 컬렉션 : 자동차들을 저장하는 저장 창고
	private List<String> carList = null;

	// 생성자 : 해당 클ㄹ스가 객체로 생성되면서 carList를 생성한다.
	public Ex17_Car() {
		carList = new ArrayList<>();
	}

	// 호출 시 랜덤으로 자동차 생산
	public String getCar() {
		String carName = null;
		switch ((int)(Math.random() * 3)) {
			case 0 : carName = "SM5"; break;
			case 1 : carName = "매그너스"; break;
			case 2 : carName = "카렌스"; break;		
		
		}
		return carName;
	}
	
	// 차 판매
	public synchronized String pop() {
		String carName = null;
		// 재고가 없으면
		if(carList.size() == 0) {
			try {
				System.out.println("차가 없어요. 생산할 때까지 기다리세요");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 재고가 있으면 
		// carList에서 가장 마지막에 들어온 차를 먼저 판매.
		carName = (String)carList.remove(carList.size() - 1); 
		System.out.println("손님이 차를 사갔습니다. 손님이 구입한 차의 이름은 : " + carName);
		
		return carName;	
	}
	
	// 차 생성 및 리스트에 넣기
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("차가 만들어 졌습니다. 차의 이름은 : " + car);
		if(carList.size() == 5) {
			this.notify();
		}
	}
}
