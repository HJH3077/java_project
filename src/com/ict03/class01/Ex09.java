package com.ict03.class01;

public class Ex09 {
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank = 1; // ������ �ʱⰪ�� 1����
	
	// ��� �޼ҵ尡 void �̴�.
	// �̸� �ޱ� : setName�� ���� ������ ��.
	// ���� ���ϱ�
	// ���̵尡 �ƴϸ� return���� ���� private���� ���
	//main�� ���� �Ѿ� �� �� ����. ������ ��¿��� �ᱹ get���� �ҷ����Ƿ� private�� �ʿ��ϱ���
	
	public void p_sum(int kor, int eng, int math) {  
		sum = kor + eng + math;
		// p_avg(); �̷� ������ �޼ҵ�� �޼ҵ带 �����ϸ� main���� ������ �޼ҵ带 �θ� �ʿ䰡 ����.
		// ��, �޼ҵ�� �ᱹ ȣ���� ������ ���⶧���� �̷����̸� sum�ϰ� avg�� ���� hak���� ���� �ٽ� 
		//	   sum���� ���ƿ� �� main���� ����. ******* ȣ���� ������ ���ƿ��°� �� ����!!
	}
	// ��� ���ϱ�
	public void p_avg() {
		avg = (int)(sum / 3.0 * 10) / 10.0;
		// p_hak();
	}
	// ���� ���ϱ�
	public void p_hak() {
		if(avg >= 90)
			hak = "A����";
		else if(avg >= 80)
			hak = "B����";
		else if(avg >= 70)
			hak = "C����";
		else
			hak = "F����";
	}
	
	// ������ ������ ���⼭ �� �� ����. main���� ����
	
	
	//getter
	public String getName() {
		return name;
	}
	public int getSum() {
		return sum;
	}
	public double getAvg() {
		return avg;
	}
	public String getHak() {
		return hak;
	}
	public int getRank() {
		return rank;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
	
	
	
	
}
