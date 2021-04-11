package com.ict03.class02;

public class Ex01 {
	public static void main(String[] args) {
		
	
	// String 클래스
	String str1 = "abc"; // abc를 문자열로 표현
	
	char[] data = {'a','b','c'}; // char로 각 문자를 배열에 넣음
	String str2 = new String(data); // 문자 + 배열 = 문자열
	
	byte[] data2 = {97,98,99};
	String str3 = new String(data2);
	
	String str4 = new String("abc");
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);

	System.out.println("=== 주요 메소드 ===");
	String msg = "한국 ICT 인재개발원 1강의장";
	// 1. charAt(int index) : char 반환
	// 위치값을 받아서 그 위치에 존재하는 문자를 반환한다.
	// 이 때 위치값(index)는 0부터이다.
	char c1 = msg.charAt(5);
	System.out.println(c1); // "한" 부터 0 시작 ~

	msg = "대한 I Love You 123"; // 문자열의 길이를 알아야 함.
	// 문자열의 길이를 구하자. : length() (메소드임) - 배열과 달리 메소드여서 ()를 써야함 - int를 반환함

	System.out.println(msg.length()); // 17 (길이이므로 1부터 시작)
	// 다음 문자들 중에 소문자를 대문자로 변경하시오
	// 힌트) a는 97, A는 65이다. (차이는 32)
	for (int i = 0; i < msg.length(); i++) {
		char c2 = msg.charAt(i);
		if (c2 > 'a' && c2 < 'z')
			c2 = (char) (c2 - 32);
		System.out.print(c2);
	}
	System.out.println();
	System.out.println();
	/*
	char[] c2 = new char[msg.length()];
	for (int i = 0; i < msg.length(); i++) {
		c2[i] = msg.charAt(i);
			if (c2[i] > 'a' && c2[i] < 'z')
				c2[i] = (char) (c2[i] - 32);
		}
	String st = new String(c2);
	System.out.println(st);
	System.out.println();
	 */
	
	// 2. concat(String str) : String반환
	// 지정한 문자열을 현재 문자열의 끝에 연결한다.
	String msg1 = "대한민국";
	String msg2 = "KOREA";
	String msg3 = msg1.concat(msg2); // 문자연결자(= msg1 + msg2)와 같음 누가 concat씀 ㄹㅇㅋㅋ
									 // 사실 문자연결자도 안쓰고 string 버퍼를 나중에 배우는데 다 그거씀 ㅋ
	System.out.println(msg3);

	// 회사에서 특정하게 자주쓰는 API가 있는데 그걸 공부하고 익혀야함!
	
	// 3. contains(String s) : boolean반환
	// 받은 문자열이 해당 문자열에 존재하면 true, 존재하지 않으면 false
	msg = "대한 I Love You 123";
	boolean b1 = msg.contains("You"); // msg안에 You가 있으면 true 아니면 false
	System.out.println(b1); // 욕설 필터링 같은 곳에 사용 가능.
	if (b1)
		System.out.println("포함되어 있다.");
	else
		System.out.println("포함되어 있지 않다.");
	
	System.out.println();
	
	// 4. equals(Object anObject) - boolean반환
	// 받은 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자를 구별!)
	// 5. equalsIgnoreCase(String anotherString) - boolean반환
	// 받은 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자를 구별안함!)
	// ** 주의사항 : 문자열이나 객체를 비교할 때 "==" 를 사용하면 "내용이 같냐"가 아니라 "주소가 같냐" 라는뜻 
	//				 문자열에는 "==" 사용하면 안됨. 4,5번을 사용해야함.
	String s1 = "Korea";
	String s2 = "KOREA";
	String s3 = new String("Korea");
	String s4 = new String("Korea");
	
	System.out.println(s1 == s2); // false
	System.out.println(s2 == s3); // false
	System.out.println(s3 == s4); // false, 두 객체의 주소가 다르므로 다르다고 나옴.
	System.out.println(s1.equalsIgnoreCase(s2)); // true
	System.out.println(s2.equalsIgnoreCase(s3)); // true
	System.out.println(s3.equalsIgnoreCase(s4)); // true
	// equalsIgnoreCase(대소문자 구분 x)를 쓰는 이유
	System.out.println();
	
	s1 = "seoul";
	s2 = "seoul";
	System.out.println(s1 == s2); // 주소가 같은지 비교, 주소가 
	System.out.println(s1.equalsIgnoreCase(s2)); // 내용이 같은지 비교
	System.out.println();
	
	// 6. format(Locale l, String format, Object... args) - static String 반환
	// 형식을 지정하고 형식에 맞게 생성
	// %s 는 문자열, %d 는 정수, %f 는 실수(반올림 됨. = .1 은 첫째자리까지 반올림, .2는 둘째자리)
	String msg4 = "한국 ICT 인재 개발원";
	int s5 = 14;
	double s6 = 89.167;
	String msg5 = msg4.format("%s의 시작년도는 %d년 이고 평균전수는 %.2f이다.", msg4, s5, s6); // printf와 같음
	System.out.println(msg5);
	System.out.println();
	
	// 7. getBytes() - byte[]반환
	// 해당 문자열을 byte[]로 변경시킨다.
	// 보통 입/출력 스트림할 때 사용한다. (영문자 대소문자와 숫자만 가능, 한글은 불가 - 크기가 부족해서)
	// 입/출력할 때 자주 사용!! (단점 : 영문자 대소문자 숫자만 가능하다는 점. 한글x)
	String msg6 = "java";
	byte[] b = msg6.getBytes();
	for (int i = 0; i < b.length; i++) { // 배열이므로 for문으로 출력
		System.out.println((char)(b[i]) + ":" + b[i]); // 숫자로 출력됨. byte로 반환되므로
	}
	System.out.println();
	
	// 반대로 해당 byte 배열을 문자열로 만들 수도 있다. (= 생성자 이용)
	String msg7 = new String(b);
	System.out.println(msg7);
	System.out.println();
	
	// 8. toCharArray() - char[]반환
	// 해당 문자열을 char[]로 변경시킨다.
	// 보통 입/출력 스트림할 때 사용한다. (전 세계 모든 문자 가능)
	String msg8 = "자바8 java8 大韓民國 123";
	char[] c = msg8.toCharArray();
	for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]);
	}
	System.out.println();
	
	// 반대로 해당 char 배열을 문자열로 만들 수도 있다. (= 생성자 이용)
	String msg9 = new String(c);
	System.out.println(msg9);
	System.out.println();
	
	// 9. indexOf(int ch) - int반환
	// 문자를 받아서 해당 문자의 위치값을 표시
	// 시작위치는 처음부터, 찾는 문자가 없으면 -1이다.
	// 10. indexOf(int ch, int fromIndex) - int반환
	// 문자와 시작위치를 받아서 해당 문자의 위치값을 표시
	// 찾는 문자가 없으면 -1이다.
	// 11. indexOf(String str) - int반환
	// 문자열을 받아서 해당 문자의 위치값을 표시
	// 시작위치는 처음부터, 찾는 문자가 없으면 -1이다.
	// 12. indexOf(String str, int fromIndex) - int반환
	// 문자열과 시작위치를 받아서 해당 문자의 위치값을 표시
	// 찾는 문자가 없으면 -1이다.
	
	String msg10 = "BufferedReader";
	// 'e'를 찾아라
	int k1 = msg10.indexOf('e'); 
	System.out.println(k1); // 4
	
	// 두번째 'e'를 찾아라
	// 첫번째 'e'가 4이므로 5번부터 시작하면 두번째 'e'를 찾을 수 있음
	// int k2 = msg10.indexOf('e', 5);
	k1 = msg10.indexOf('e', msg10.indexOf('e') + 1);
	System.out.println(k1); // 6
	
	// 세번째 'e'를 찾아라
	// 두번째 'e'가 6이므로 7부터 시작함.
	k1 = msg10.indexOf('e', msg10.indexOf('e', msg10.indexOf('e') + 1) + 1);
	System.out.println(k1); // 9
	
	// 없는 글자 찾기('A')
	k1 = msg10.indexOf('A');
	System.out.println(k1); // 없으므로 -1
	
	b1 = msg10.contains("A"); // 있는지 없는지 판별
	System.out.println(b1); // false 
	
	// char말고 String으로 찾기
	k1 = msg10.indexOf("er");
	System.out.println(k1); // 4, er의 첫글자가 있는 위치가 4임.
	k1 = msg10.indexOf("er", msg10.indexOf("er") + 1); // 두번째 er찾기
	System.out.println(k1); // 12
	System.out.println();
	
	// 11. lastIndexOf(int ch) - int반환
	//	   lastIndexOf(String str) - int반환
	// 마지막 문자나 문자열의 위치를 표시
	k1 = msg10.lastIndexOf('e', 7);
	System.out.println(k1);
	k1 = msg10.lastIndexOf('e'); 
	System.out.println(k1);
	k1 = msg10.lastIndexOf("er");
	System.out.println(k1);
	
	// 12. isEmpty() - boolean반환
	// 문자열의 길이가 0이면 true, 아니면 false
	// 즉, 문자가 없으면(비어있으면) true, 아니면 false
	// 13. length() - int반환
	// 문자열의 길이를 숫자로 표시
	String msg11 = ""; // null은 사용안됨
	String msg12 = "java";
	System.out.println(msg11.isEmpty()); // true
	System.out.println(msg12.isEmpty()); // false
	
	System.out.println(msg11.length()); // 0 
	System.out.println(msg12.length()); // 4
	System.out.println();
	
	// 14. replace(char oldChar, char newChar) - String반환
	//	   replace(String target, String replacement) - String반환
	// 문자나 문자열을 받아서 치환하기
	String msg13 = "대한민국";
	String msg14 = msg13.replace("대한민국", "korea"); // string을 string으로
	String msg15 = msg13.replace('한', '韓'); // char를 char
	String msg16 = msg13.replace( msg13, "korea"); // msg 통채로 넣어도 문제없음
	System.out.println(msg14);
	System.out.println(msg15);
	System.out.println(msg16);
	System.out.println();
	
	// 15. split(String regex) : String[]반환
	// 구분자를 받아서 배열로 나눈다. (배열크기는 알아서 자동으로) (구분자는 나누는 기준 ,나 . 같은거)
	// 	   split(String regex, int limit)
	// 구분자를 받아서 배열로 나눈다. (limit가 배열 크기)
	String msg17 = "사과,딸기,망고,오렌지,파인애플";
	String[] res = msg17.split(",");
	for (int i = 0; i < res.length; i++) {
		System.out.println(res[i]);	
	}
	System.out.println();
	
	String[] res2 = msg17.split(",", 3); // 처음 만나는 , 에서 배열이 2개로 나눠짐
										 // 제한이 3이면 첫 , 에서 한번 두번째 , 에서 한번 나눌 것임.
	System.out.println(res2[0]);
	System.out.println(res2[1]);
	System.out.println(res2[2]);
	
	String[] res3 = msg17.split(",", 10); // 10개라고 해도 갯수가 5개라 5개로 쪼개지는 것.
	for (int i = 0; i < res3.length; i++) {
		System.out.println("i = " + i + ", res = " + res3[i]);
	}
	System.out.println();
	
	// 16. substring(int beginIndex) - String반환
	// 시작위치를 받아서 해당 문자열을 끝까지 문자열 추출 (시작위치 포함)
	//     substring(int beginIndex, int endIndex) - String반환
	// 시작위치와 끝 위치를 받아서 해당 문자열 추출(끝 위치 전까지 추출, 끝 위치는 포함 x)
	String msg18 = "010-7979-9999";
	String res4 = msg18.substring(4); // 7979-9999
	System.out.println(res4);
	String res5 = msg18.substring(4, 8); // 7979
	String res6 = msg18.substring(msg18.indexOf('-') + 1, msg18.lastIndexOf('-')); // - 와 - 사이의 숫자 
	System.out.println(res5); // * 끝 위치 전까지! 
	System.out.println(res6); // * 끝 위치 전까지! 
	
	String msg19 = "770707";
	// 태어난 년도 추출
	String res7 = msg19.substring(0, 2); // 77
	// 태어난 달 추출
	String res8 = msg19.substring(2, 4); // 07
	System.out.println();
	
	
	// 퀴즈) 010-7777-9999 => 010-XXXX-9999, 010-7777-XXXX
	// X를 넣어야하니 치환이 들어가든지 해야함, 아니면 부분을 뽑아서 바꾸고 넣든가
	String quiz = "010-7777-9999";
	String[] anser = quiz.split("-"); // 여기서 010, 7777, 9999로 나눔 3개 [0],[1],[2]
	anser[1] = anser[1].replace(anser[1], "XXXX");
	for (int i = 0; i < anser.length; i++) {
		if(i == anser.length - 1)
			System.out.print(anser[i]);
		else
			System.out.print(anser[i] + "-");
	}
	System.out.println();
	
	System.out.println(anser[0].concat("-" + anser[1].concat("-" + anser[2])));
	System.out.println(anser[0] + "-" + anser[1] + "-" + anser[2]);
	
	// 17. toLowerCase() - String반환
	// 해당 문자열의 모든 대문자를 소문자로 변경
	// 18. toUpperCase() - String반환
	// 해당 문자열의 모든 소문자를 대문자로 변경
	String msg20 = "자바8 java8 Java8";
	String res9 = msg20.toLowerCase();
	String res10 = msg20.toUpperCase();
	System.out.println(res9);
	System.out.println(res10);
	System.out.println();
	
	// 19. toString() - String반환
	// 		String의 toString() : 문자열 자체를 반환
	// 		Object의 toString() : 모든 객체에서 사용이 가능
	//							  객체가 가지고 있는 정보나 값들을 문자열로 리턴할 때 사용.(오버라이딩에서 다시배움)
	String msg21 = "java8 Java8 자바8";
	String res11 = msg21.toString();
	System.out.println(msg21);
	System.out.println(res11); // 두 결과가 같음
	System.out.println();
	
	// 20. trim() - String반환
	// 해당 문자열의 앞, 뒤에이는 공백 제거, 중간공백은 제거 못함.(중간 공백은 문자취급하기 때문에)
	String msg22 = "    java   자바    Java      ";
	System.out.println(msg22);
	System.out.println(msg22.trim());
	System.out.println(msg22.length()); // 27
	System.out.println(msg22.trim().length()); // 17
	System.out.println();
	
	// 21. valueOf(각종자료형) - static String반환
	// 어떤 자료형이든지 String으로 변경시킨다.
	boolean p1 = true;
	char p2 = 'c';
	int p3 = 100;
	long p4 = 100L;
	float p5 = 100.0f;
	double p6 = 100.0;
	
	// 각종 자료형에 + 1; 
	// System.out.println(p1 + 1); boolean은 연산 안됨
	System.out.println(p2 + 1); // char + 정수는 정수로 나온다.
	System.out.println(p3 + 1);
	System.out.println(p4 + 1);
	System.out.println(p5 + 1);
	System.out.println(p6 + 1);
	System.out.println();
	
	// String으로 변경시켜서 + 1
	System.out.println(String.valueOf(p1) + 1); // String으로 변경되어서 문자열로 인식해서 오류 x
	System.out.println(String.valueOf(p2) + 1);
	System.out.println(String.valueOf(p3) + 1);
	System.out.println(String.valueOf(p4) + 1);
	System.out.println(String.valueOf(p5) + 1);
	System.out.println(String.valueOf(p6) + 1);
	System.out.println();
			
	System.out.println(p1 + "1");  // 이런 방법으로도 위가 아니여도 가능은 하지만
	System.out.println(p2 + "1");  // 메모리 차지를 많이하게 됨. 이런 식으로 일일히 써야하므로
	System.out.println(p3 + "1");
	System.out.println(p4 + "1");
	System.out.println(p5 + "1");
	System.out.println(p6 + "1");
	System.out.println();
			
	// 21번의 반대개념 (각종 자료형 모양의 문자열을 각종 자료형으로 변경)
	// Wrapper Class : 각 자료형의 형태를 가진 문자열을 진짜 자료형으로 변경 시키는 클래스들
	//				   원래 의미는 기본자료형을 만들 때 사용하는 클래스
	//				   (이제는 자동으로 만들어짐 => 오토박싱)
	//				   기본자료형 => 객체형  자동으로 변경(오토박싱)
	//				   객체형 => 기본자료형  자동으로 변경(오토언박싱)
	//		(Boolean, (Byte, Short, Int) Integer, Double 등)
	
	//	1) boolean 형태의 문자열을 boolean형으로 변경
	msg = "true";
	/*
	 * if(msg) { // 실제 boolean형이 아니어서 오류발생 break; }
	 */

	boolean a1 = Boolean.parseBoolean("true");
	if (a1)
		System.out.println("변경성공");
	else
		System.out.println("변경성공2"); // 이러면 "true" 라는 글자 외에는 다 false가됨.
		
	//	2) int 형태의 문자열을 int형으로 변경 : Integer.parseInt(String s)
	msg = "100";
	int a2 = Integer.parseInt(msg);
	System.out.println(msg + 10); // 10010
	System.out.println(a2 + 10); // 110
	
	//	3) double 형태의 문자열을 double형으로 변뎡 : Double.parseDouble(String s)
	msg = "3.145";
	double a3 = Double.parseDouble(msg);
	System.out.println(msg + 10); // 3.14510
	System.out.println(a3 + 10); // 13.145
	
	// 4) Char 형태의 문자열을 char형으로 변경할 메소드는 없다 (단, Character 클래스는존재한다.)
	//	  문자열에서 charAt(위치값)을 이용하면 된다.
	msg = "c";
	char a4 = msg.charAt(0);
	System.out.println(msg + 1); // c1
	System.out.println(a4 + 1); // 100 (정수랑 더해서 정수형으로 나옴)
	System.out.println((char)(a4 + 1)); // d
	System.out.println();
	
	// 주민번호 앞자리를 받았다? 나이를 구하자
	String jumin = "941210";
	String gender = "1";
	
	// 앞자리 두 자리
	String year = jumin.substring(0, 2);
	
	// 앞자리 두 자리 숫자로 변경
	int y_year = Integer.parseInt(year);
	// int y_year = Integer.parseInt(String year = jumin.substring(0, 2)); 원래 이런식으로 한줄로씀
	
	// 앞자리 두 자리에 19나 21을 붙여라(1994, 2004같은 년도로 만들기 위해)
	// (gender가 1 또는 2 이면 1900년대 생, 3 또는 4면 20년대 생  - 뒷자리 첫숫자!)
	if(gender.equals("1") || gender.equals("2")) {
		y_year = y_year + 1900;
	} else if(gender.equals("3") || gender.equals("4")) {
		y_year = y_year + 2000;
	}
	// (올해 연도 - 구한 년도) + 1  = 나이
	int age = 2021 - y_year + 1;
	System.out.println("나이는 " + age + "살 입니다.");
		
	}
}
