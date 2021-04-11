package com.ict03.class01;

public class Ex09 {
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank = 1; // 순위의 초기값을 1로줌
	
	// 모든 메소드가 void 이다.
	// 이름 받기 : setName을 통해 받으면 됨.
	// 총점 구하기
	// 보이드가 아니면 return으로 위의 private값이 없어도
	//main에 값이 넘어 갈 수 있음. 하지만 출력에서 결국 get으로 불러오므로 private가 필요하긴함
	
	public void p_sum(int kor, int eng, int math) {  
		sum = kor + eng + math;
		// p_avg(); 이런 식으로 메소드로 메소드를 실행하면 main에서 여러번 메소드를 부를 필요가 없음.
		// 단, 메소드는 결국 호출한 곳으로 가기때문에 이런식이면 sum하고 avg로 가고 hak으로 가고 다시 
		//	   sum으로 돌아온 뒤 main으로 간다. ******* 호출한 곳으로 돌아오는걸 꼭 인지!!
	}
	// 평균 구하기
	public void p_avg() {
		avg = (int)(sum / 3.0 * 10) / 10.0;
		// p_hak();
	}
	// 학점 구하기
	public void p_hak() {
		if(avg >= 90)
			hak = "A학점";
		else if(avg >= 80)
			hak = "B학점";
		else if(avg >= 70)
			hak = "C학점";
		else
			hak = "F학점";
	}
	
	// 순위와 정렬은 여기서 할 수 없음. main에서 수행
	
	
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
