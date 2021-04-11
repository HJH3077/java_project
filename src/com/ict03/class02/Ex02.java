package com.ict03.class02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02 {
	public static void main(String[] args) {
		// 날짜 관련 클래스 : 현재 사용하고 있는 컴퓨터 기준
		// Date 클래스, Calendar 클래스
		// deprecated : 언제든지 지원을 안할 수도 있음
		
		// Date 클래스
		Date date = new Date();
		System.out.println(date); // 컴퓨터 기준 한국 시간이 나옴
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy. MM. dd.  hh:mm:ss  E"); // E: 요일 M: 월(분인 m과 구별)
		System.out.println(dateFormat.format(date));
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yy. M. d.  hh:mm:ss  E"); // yy면 2자리로만 나옴
		System.out.println(dateFormat2.format(date));
		System.out.println();
		
		// 년, 월, 일, 시, 분, 초, 요일 각 각 구하기
		System.out.println((date.getYear() + 1900) + "년"); // Calendar.get(Calendar.YEAR) 2021 - 1900. 이므로 +1900 해야함
		System.out.println((date.getMonth() + 1) + "월"); // 0 - 11 까지 이므로 반드시 + 1을 해야함. Calendar도 같음
		System.out.println(date.getDate() + "일");
		System.out.println(date.getHours() + "시");
		System.out.println(date.getMinutes() + "분");
		System.out.println(date.getSeconds() + "초");
		System.out.println(date.getDay()); // Calendar.get(Calendar.HOUR_OF_DAY) (0 = 일요일 ~ 6 = 토요일) 숫자로나오므로 
		
		System.out.println("===============================================");
		
		// Calendar 클래스
		// 현재 날짜와 시간을 구할 때는 new예약어를 사용하지 않고 객체를 생성한다. (= static이라는 의미)
		// 년, 월, 일, 시, 분, 초를 구할 때 Calendar.getInstance().get(Calendar.상수)를 사용한다.
		System.out.println(Calendar.getInstance().get(Calendar.YEAR) + "년");
		// 위 대신 이런 방법도 가능
		Calendar now = Calendar.getInstance(); // 컴퓨터의 현재 날짜와 시간, 요일을 뜻한다.
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) + 1 + "월"); // 0 ~ 11 까지 이므로 반드시 + 1
		System.out.println(now.get(Calendar.DATE) + "일");
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + "일");	
	
		// 시간 : 12시간제, 24시간제
		System.out.println(now.get(Calendar.HOUR) + "시"); // 12시간제
		System.out.println(now.get(Calendar.HOUR_OF_DAY) + "시"); // 24시간제(하루를 24시간으로봄)
		// 12시간제는 오전, 오후가 필요하다. (AM_PM) / AM = 0, PM = 1
		int res = now.get(Calendar.AM_PM);
		if (res == 0)
			System.out.println("AM " + now.get(Calendar.HOUR) + "시");
		else if (res == 1)
			System.out.println("PM " + now.get(Calendar.HOUR) + "시");
		
		// 요일 (1 ~ 7) 1 = 일요일, 7 = 토요일  * date와 달라서 헷갈리기 좋음
		// 실제로 강사님이 문제로 내신 부분
		int res2 = now.get(Calendar.DAY_OF_WEEK);
		switch (res2) {
		case 1: System.out.println("일요일"); break;
		case 2: System.out.println("월요일"); break;
		case 3: System.out.println("화요일"); break;
		case 4: System.out.println("수요일"); break;
		case 5: System.out.println("목요일"); break;
		case 6: System.out.println("금요일"); break;
		case 7: System.out.println("토요일"); break;	
		}
		
		
		
	}
}
