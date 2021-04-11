package com.ict03.class02;

public class Ex01 {
	public static void main(String[] args) {
		
	
	// String Ŭ����
	String str1 = "abc"; // abc�� ���ڿ��� ǥ��
	
	char[] data = {'a','b','c'}; // char�� �� ���ڸ� �迭�� ����
	String str2 = new String(data); // ���� + �迭 = ���ڿ�
	
	byte[] data2 = {97,98,99};
	String str3 = new String(data2);
	
	String str4 = new String("abc");
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);

	System.out.println("=== �ֿ� �޼ҵ� ===");
	String msg = "�ѱ� ICT ���簳�߿� 1������";
	// 1. charAt(int index) : char ��ȯ
	// ��ġ���� �޾Ƽ� �� ��ġ�� �����ϴ� ���ڸ� ��ȯ�Ѵ�.
	// �� �� ��ġ��(index)�� 0�����̴�.
	char c1 = msg.charAt(5);
	System.out.println(c1); // "��" ���� 0 ���� ~

	msg = "���� I Love You 123"; // ���ڿ��� ���̸� �˾ƾ� ��.
	// ���ڿ��� ���̸� ������. : length() (�޼ҵ���) - �迭�� �޸� �޼ҵ忩�� ()�� ����� - int�� ��ȯ��

	System.out.println(msg.length()); // 17 (�����̹Ƿ� 1���� ����)
	// ���� ���ڵ� �߿� �ҹ��ڸ� �빮�ڷ� �����Ͻÿ�
	// ��Ʈ) a�� 97, A�� 65�̴�. (���̴� 32)
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
	
	// 2. concat(String str) : String��ȯ
	// ������ ���ڿ��� ���� ���ڿ��� ���� �����Ѵ�.
	String msg1 = "���ѹα�";
	String msg2 = "KOREA";
	String msg3 = msg1.concat(msg2); // ���ڿ�����(= msg1 + msg2)�� ���� ���� concat�� ��������
									 // ��� ���ڿ����ڵ� �Ⱦ��� string ���۸� ���߿� ���µ� �� �װž� ��
	System.out.println(msg3);

	// ȸ�翡�� Ư���ϰ� ���־��� API�� �ִµ� �װ� �����ϰ� ��������!
	
	// 3. contains(String s) : boolean��ȯ
	// ���� ���ڿ��� �ش� ���ڿ��� �����ϸ� true, �������� ������ false
	msg = "���� I Love You 123";
	boolean b1 = msg.contains("You"); // msg�ȿ� You�� ������ true �ƴϸ� false
	System.out.println(b1); // �弳 ���͸� ���� ���� ��� ����.
	if (b1)
		System.out.println("���ԵǾ� �ִ�.");
	else
		System.out.println("���ԵǾ� ���� �ʴ�.");
	
	System.out.println();
	
	// 4. equals(Object anObject) - boolean��ȯ
	// ���� ���ڿ��� ���� ���ڿ��� ������ true, �ٸ��� false (��ҹ��ڸ� ����!)
	// 5. equalsIgnoreCase(String anotherString) - boolean��ȯ
	// ���� ���ڿ��� ���� ���ڿ��� ������ true, �ٸ��� false (��ҹ��ڸ� ��������!)
	// ** ���ǻ��� : ���ڿ��̳� ��ü�� ���� �� "==" �� ����ϸ� "������ ����"�� �ƴ϶� "�ּҰ� ����" ��¶� 
	//				 ���ڿ����� "==" ����ϸ� �ȵ�. 4,5���� ����ؾ���.
	String s1 = "Korea";
	String s2 = "KOREA";
	String s3 = new String("Korea");
	String s4 = new String("Korea");
	
	System.out.println(s1 == s2); // false
	System.out.println(s2 == s3); // false
	System.out.println(s3 == s4); // false, �� ��ü�� �ּҰ� �ٸ��Ƿ� �ٸ��ٰ� ����.
	System.out.println(s1.equalsIgnoreCase(s2)); // true
	System.out.println(s2.equalsIgnoreCase(s3)); // true
	System.out.println(s3.equalsIgnoreCase(s4)); // true
	// equalsIgnoreCase(��ҹ��� ���� x)�� ���� ����
	System.out.println();
	
	s1 = "seoul";
	s2 = "seoul";
	System.out.println(s1 == s2); // �ּҰ� ������ ��, �ּҰ� 
	System.out.println(s1.equalsIgnoreCase(s2)); // ������ ������ ��
	System.out.println();
	
	// 6. format(Locale l, String format, Object... args) - static String ��ȯ
	// ������ �����ϰ� ���Ŀ� �°� ����
	// %s �� ���ڿ�, %d �� ����, %f �� �Ǽ�(�ݿø� ��. = .1 �� ù°�ڸ����� �ݿø�, .2�� ��°�ڸ�)
	String msg4 = "�ѱ� ICT ���� ���߿�";
	int s5 = 14;
	double s6 = 89.167;
	String msg5 = msg4.format("%s�� ���۳⵵�� %d�� �̰� ��������� %.2f�̴�.", msg4, s5, s6); // printf�� ����
	System.out.println(msg5);
	System.out.println();
	
	// 7. getBytes() - byte[]��ȯ
	// �ش� ���ڿ��� byte[]�� �����Ų��.
	// ���� ��/��� ��Ʈ���� �� ����Ѵ�. (������ ��ҹ��ڿ� ���ڸ� ����, �ѱ��� �Ұ� - ũ�Ⱑ �����ؼ�)
	// ��/����� �� ���� ���!! (���� : ������ ��ҹ��� ���ڸ� �����ϴٴ� ��. �ѱ�x)
	String msg6 = "java";
	byte[] b = msg6.getBytes();
	for (int i = 0; i < b.length; i++) { // �迭�̹Ƿ� for������ ���
		System.out.println((char)(b[i]) + ":" + b[i]); // ���ڷ� ��µ�. byte�� ��ȯ�ǹǷ�
	}
	System.out.println();
	
	// �ݴ�� �ش� byte �迭�� ���ڿ��� ���� ���� �ִ�. (= ������ �̿�)
	String msg7 = new String(b);
	System.out.println(msg7);
	System.out.println();
	
	// 8. toCharArray() - char[]��ȯ
	// �ش� ���ڿ��� char[]�� �����Ų��.
	// ���� ��/��� ��Ʈ���� �� ����Ѵ�. (�� ���� ��� ���� ����)
	String msg8 = "�ڹ�8 java8 �������� 123";
	char[] c = msg8.toCharArray();
	for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]);
	}
	System.out.println();
	
	// �ݴ�� �ش� char �迭�� ���ڿ��� ���� ���� �ִ�. (= ������ �̿�)
	String msg9 = new String(c);
	System.out.println(msg9);
	System.out.println();
	
	// 9. indexOf(int ch) - int��ȯ
	// ���ڸ� �޾Ƽ� �ش� ������ ��ġ���� ǥ��
	// ������ġ�� ó������, ã�� ���ڰ� ������ -1�̴�.
	// 10. indexOf(int ch, int fromIndex) - int��ȯ
	// ���ڿ� ������ġ�� �޾Ƽ� �ش� ������ ��ġ���� ǥ��
	// ã�� ���ڰ� ������ -1�̴�.
	// 11. indexOf(String str) - int��ȯ
	// ���ڿ��� �޾Ƽ� �ش� ������ ��ġ���� ǥ��
	// ������ġ�� ó������, ã�� ���ڰ� ������ -1�̴�.
	// 12. indexOf(String str, int fromIndex) - int��ȯ
	// ���ڿ��� ������ġ�� �޾Ƽ� �ش� ������ ��ġ���� ǥ��
	// ã�� ���ڰ� ������ -1�̴�.
	
	String msg10 = "BufferedReader";
	// 'e'�� ã�ƶ�
	int k1 = msg10.indexOf('e'); 
	System.out.println(k1); // 4
	
	// �ι�° 'e'�� ã�ƶ�
	// ù��° 'e'�� 4�̹Ƿ� 5������ �����ϸ� �ι�° 'e'�� ã�� �� ����
	// int k2 = msg10.indexOf('e', 5);
	k1 = msg10.indexOf('e', msg10.indexOf('e') + 1);
	System.out.println(k1); // 6
	
	// ����° 'e'�� ã�ƶ�
	// �ι�° 'e'�� 6�̹Ƿ� 7���� ������.
	k1 = msg10.indexOf('e', msg10.indexOf('e', msg10.indexOf('e') + 1) + 1);
	System.out.println(k1); // 9
	
	// ���� ���� ã��('A')
	k1 = msg10.indexOf('A');
	System.out.println(k1); // �����Ƿ� -1
	
	b1 = msg10.contains("A"); // �ִ��� ������ �Ǻ�
	System.out.println(b1); // false 
	
	// char���� String���� ã��
	k1 = msg10.indexOf("er");
	System.out.println(k1); // 4, er�� ù���ڰ� �ִ� ��ġ�� 4��.
	k1 = msg10.indexOf("er", msg10.indexOf("er") + 1); // �ι�° erã��
	System.out.println(k1); // 12
	System.out.println();
	
	// 11. lastIndexOf(int ch) - int��ȯ
	//	   lastIndexOf(String str) - int��ȯ
	// ������ ���ڳ� ���ڿ��� ��ġ�� ǥ��
	k1 = msg10.lastIndexOf('e', 7);
	System.out.println(k1);
	k1 = msg10.lastIndexOf('e'); 
	System.out.println(k1);
	k1 = msg10.lastIndexOf("er");
	System.out.println(k1);
	
	// 12. isEmpty() - boolean��ȯ
	// ���ڿ��� ���̰� 0�̸� true, �ƴϸ� false
	// ��, ���ڰ� ������(���������) true, �ƴϸ� false
	// 13. length() - int��ȯ
	// ���ڿ��� ���̸� ���ڷ� ǥ��
	String msg11 = ""; // null�� ���ȵ�
	String msg12 = "java";
	System.out.println(msg11.isEmpty()); // true
	System.out.println(msg12.isEmpty()); // false
	
	System.out.println(msg11.length()); // 0 
	System.out.println(msg12.length()); // 4
	System.out.println();
	
	// 14. replace(char oldChar, char newChar) - String��ȯ
	//	   replace(String target, String replacement) - String��ȯ
	// ���ڳ� ���ڿ��� �޾Ƽ� ġȯ�ϱ�
	String msg13 = "���ѹα�";
	String msg14 = msg13.replace("���ѹα�", "korea"); // string�� string����
	String msg15 = msg13.replace('��', '��'); // char�� char
	String msg16 = msg13.replace( msg13, "korea"); // msg ��ä�� �־ ��������
	System.out.println(msg14);
	System.out.println(msg15);
	System.out.println(msg16);
	System.out.println();
	
	// 15. split(String regex) : String[]��ȯ
	// �����ڸ� �޾Ƽ� �迭�� ������. (�迭ũ��� �˾Ƽ� �ڵ�����) (�����ڴ� ������ ���� ,�� . ������)
	// 	   split(String regex, int limit)
	// �����ڸ� �޾Ƽ� �迭�� ������. (limit�� �迭 ũ��)
	String msg17 = "���,����,����,������,���ξ���";
	String[] res = msg17.split(",");
	for (int i = 0; i < res.length; i++) {
		System.out.println(res[i]);	
	}
	System.out.println();
	
	String[] res2 = msg17.split(",", 3); // ó�� ������ , ���� �迭�� 2���� ������
										 // ������ 3�̸� ù , ���� �ѹ� �ι�° , ���� �ѹ� ���� ����.
	System.out.println(res2[0]);
	System.out.println(res2[1]);
	System.out.println(res2[2]);
	
	String[] res3 = msg17.split(",", 10); // 10����� �ص� ������ 5���� 5���� �ɰ����� ��.
	for (int i = 0; i < res3.length; i++) {
		System.out.println("i = " + i + ", res = " + res3[i]);
	}
	System.out.println();
	
	// 16. substring(int beginIndex) - String��ȯ
	// ������ġ�� �޾Ƽ� �ش� ���ڿ��� ������ ���ڿ� ���� (������ġ ����)
	//     substring(int beginIndex, int endIndex) - String��ȯ
	// ������ġ�� �� ��ġ�� �޾Ƽ� �ش� ���ڿ� ����(�� ��ġ ������ ����, �� ��ġ�� ���� x)
	String msg18 = "010-7979-9999";
	String res4 = msg18.substring(4); // 7979-9999
	System.out.println(res4);
	String res5 = msg18.substring(4, 8); // 7979
	String res6 = msg18.substring(msg18.indexOf('-') + 1, msg18.lastIndexOf('-')); // - �� - ������ ���� 
	System.out.println(res5); // * �� ��ġ ������! 
	System.out.println(res6); // * �� ��ġ ������! 
	
	String msg19 = "770707";
	// �¾ �⵵ ����
	String res7 = msg19.substring(0, 2); // 77
	// �¾ �� ����
	String res8 = msg19.substring(2, 4); // 07
	System.out.println();
	
	
	// ����) 010-7777-9999 => 010-XXXX-9999, 010-7777-XXXX
	// X�� �־���ϴ� ġȯ�� ������ �ؾ���, �ƴϸ� �κ��� �̾Ƽ� �ٲٰ� �ֵ簡
	String quiz = "010-7777-9999";
	String[] anser = quiz.split("-"); // ���⼭ 010, 7777, 9999�� ���� 3�� [0],[1],[2]
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
	
	// 17. toLowerCase() - String��ȯ
	// �ش� ���ڿ��� ��� �빮�ڸ� �ҹ��ڷ� ����
	// 18. toUpperCase() - String��ȯ
	// �ش� ���ڿ��� ��� �ҹ��ڸ� �빮�ڷ� ����
	String msg20 = "�ڹ�8 java8 Java8";
	String res9 = msg20.toLowerCase();
	String res10 = msg20.toUpperCase();
	System.out.println(res9);
	System.out.println(res10);
	System.out.println();
	
	// 19. toString() - String��ȯ
	// 		String�� toString() : ���ڿ� ��ü�� ��ȯ
	// 		Object�� toString() : ��� ��ü���� ����� ����
	//							  ��ü�� ������ �ִ� ������ ������ ���ڿ��� ������ �� ���.(�������̵����� �ٽù��)
	String msg21 = "java8 Java8 �ڹ�8";
	String res11 = msg21.toString();
	System.out.println(msg21);
	System.out.println(res11); // �� ����� ����
	System.out.println();
	
	// 20. trim() - String��ȯ
	// �ش� ���ڿ��� ��, �ڿ��̴� ���� ����, �߰������� ���� ����.(�߰� ������ ��������ϱ� ������)
	String msg22 = "    java   �ڹ�    Java      ";
	System.out.println(msg22);
	System.out.println(msg22.trim());
	System.out.println(msg22.length()); // 27
	System.out.println(msg22.trim().length()); // 17
	System.out.println();
	
	// 21. valueOf(�����ڷ���) - static String��ȯ
	// � �ڷ����̵��� String���� �����Ų��.
	boolean p1 = true;
	char p2 = 'c';
	int p3 = 100;
	long p4 = 100L;
	float p5 = 100.0f;
	double p6 = 100.0;
	
	// ���� �ڷ����� + 1; 
	// System.out.println(p1 + 1); boolean�� ���� �ȵ�
	System.out.println(p2 + 1); // char + ������ ������ ���´�.
	System.out.println(p3 + 1);
	System.out.println(p4 + 1);
	System.out.println(p5 + 1);
	System.out.println(p6 + 1);
	System.out.println();
	
	// String���� ������Ѽ� + 1
	System.out.println(String.valueOf(p1) + 1); // String���� ����Ǿ ���ڿ��� �ν��ؼ� ���� x
	System.out.println(String.valueOf(p2) + 1);
	System.out.println(String.valueOf(p3) + 1);
	System.out.println(String.valueOf(p4) + 1);
	System.out.println(String.valueOf(p5) + 1);
	System.out.println(String.valueOf(p6) + 1);
	System.out.println();
			
	System.out.println(p1 + "1");  // �̷� ������ε� ���� �ƴϿ��� ������ ������
	System.out.println(p2 + "1");  // �޸� ������ �����ϰ� ��. �̷� ������ ������ ����ϹǷ�
	System.out.println(p3 + "1");
	System.out.println(p4 + "1");
	System.out.println(p5 + "1");
	System.out.println(p6 + "1");
	System.out.println();
			
	// 21���� �ݴ밳�� (���� �ڷ��� ����� ���ڿ��� ���� �ڷ������� ����)
	// Wrapper Class : �� �ڷ����� ���¸� ���� ���ڿ��� ��¥ �ڷ������� ���� ��Ű�� Ŭ������
	//				   ���� �ǹ̴� �⺻�ڷ����� ���� �� ����ϴ� Ŭ����
	//				   (������ �ڵ����� ������� => ����ڽ�)
	//				   �⺻�ڷ��� => ��ü��  �ڵ����� ����(����ڽ�)
	//				   ��ü�� => �⺻�ڷ���  �ڵ����� ����(�����ڽ�)
	//		(Boolean, (Byte, Short, Int) Integer, Double ��)
	
	//	1) boolean ������ ���ڿ��� boolean������ ����
	msg = "true";
	/*
	 * if(msg) { // ���� boolean���� �ƴϾ �����߻� break; }
	 */

	boolean a1 = Boolean.parseBoolean("true");
	if (a1)
		System.out.println("���漺��");
	else
		System.out.println("���漺��2"); // �̷��� "true" ��� ���� �ܿ��� �� false����.
		
	//	2) int ������ ���ڿ��� int������ ���� : Integer.parseInt(String s)
	msg = "100";
	int a2 = Integer.parseInt(msg);
	System.out.println(msg + 10); // 10010
	System.out.println(a2 + 10); // 110
	
	//	3) double ������ ���ڿ��� double������ ���� : Double.parseDouble(String s)
	msg = "3.145";
	double a3 = Double.parseDouble(msg);
	System.out.println(msg + 10); // 3.14510
	System.out.println(a3 + 10); // 13.145
	
	// 4) Char ������ ���ڿ��� char������ ������ �޼ҵ�� ���� (��, Character Ŭ�����������Ѵ�.)
	//	  ���ڿ����� charAt(��ġ��)�� �̿��ϸ� �ȴ�.
	msg = "c";
	char a4 = msg.charAt(0);
	System.out.println(msg + 1); // c1
	System.out.println(a4 + 1); // 100 (������ ���ؼ� ���������� ����)
	System.out.println((char)(a4 + 1)); // d
	System.out.println();
	
	// �ֹι�ȣ ���ڸ��� �޾Ҵ�? ���̸� ������
	String jumin = "941210";
	String gender = "1";
	
	// ���ڸ� �� �ڸ�
	String year = jumin.substring(0, 2);
	
	// ���ڸ� �� �ڸ� ���ڷ� ����
	int y_year = Integer.parseInt(year);
	// int y_year = Integer.parseInt(String year = jumin.substring(0, 2)); ���� �̷������� ���ٷξ�
	
	// ���ڸ� �� �ڸ��� 19�� 21�� �ٿ���(1994, 2004���� �⵵�� ����� ����)
	// (gender�� 1 �Ǵ� 2 �̸� 1900��� ��, 3 �Ǵ� 4�� 20��� ��  - ���ڸ� ù����!)
	if(gender.equals("1") || gender.equals("2")) {
		y_year = y_year + 1900;
	} else if(gender.equals("3") || gender.equals("4")) {
		y_year = y_year + 2000;
	}
	// (���� ���� - ���� �⵵) + 1  = ����
	int age = 2021 - y_year + 1;
	System.out.println("���̴� " + age + "�� �Դϴ�.");
		
	}
}
