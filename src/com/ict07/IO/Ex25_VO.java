package com.ict07.IO;

import java.io.Serializable;

public class Ex25_VO implements Serializable{
	// Scanner로 이름, 국어, 영어, 수학 받고 계속 할건지 물어보면서 list생성
	// 이름, 총점, 평균, 학점을 저장하고 직렬화
	private String name;
	transient private int kor;
	transient private int eng;
	transient private int math;	
	private int total;
	private double avg;
	private String hak;
	
	public Ex25_VO() {
	}

	public Ex25_VO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor + eng + math;
		avg = ((int) (total / 3.0 * 10)) / 10.0;
		if (avg >= 90)
			hak = "A";
		else if (avg >= 80)
			hak = "B";
		else if (avg >= 70)
			hak = "C";
		else
			hak = "F";
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}
	
	
	
	
}
