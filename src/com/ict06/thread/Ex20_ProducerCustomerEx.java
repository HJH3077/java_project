package com.ict06.thread;

public class Ex20_ProducerCustomerEx {
	public static void main(String[] args) {
		// 공통자원 = 임계영역 => 동기화 처리
		Ex17_Car car = new Ex17_Car();
		
		Ex18_Producer producer = new Ex18_Producer(car);
		Thread tProducer = new Thread(producer);
		Ex19_Customer customer = new Ex19_Customer(car);
		Thread tCustomer = new Thread(customer);
		tProducer.start();
		tCustomer.start();
		
		
		
	}
}
