package com.ict03.class02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// StringBuffer, StringBuilder : ���ڿ��� ����ϰ� ����, ����, �߰��� ��� ����� �����Ѵ�.
		String msg ="hello";
		System.out.println(msg);
		
		// String�� �Һ��� �Ӽ��� ������ �־ �޸𸮿� ���ο� ������ �����ؼ� ���θ����.
		// �޸𸮿� ���ο� ������ �����ؼ� hellojava�� ���θ����. ��, �޸𸮿� hello��� msg�� ��������.(= ������)
		msg = msg + "java"; // ��, �̰� hello�� java�� �ٿ��� �����Ѱ� �ƴ϶� hello�� java�� �ٿ��� ���� ����
		System.out.println(msg);
	
		// StringBuffer�� ������ �Ӽ��� ������ �־ ���� �������� ������ �߰��Ѵ�.
		// ��, ���� �ִ� ���� �߰��ϹǷ� �ּҰ��� �ٲ��� �ʴ´�. (���ο� �ڸ����� x)
		StringBuffer sb = new StringBuffer("welcome"); // ��Ʈ�� ����
		System.out.println(sb.toString()); // toString() : sb�� ���ڿ��� �����´�.
		// ������ �߰��� �� (append("���ڿ�"));
		sb.append("hiJAVA");
		System.out.println(sb.append(" JAVA"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��ϼ��� : ");
		String m = sc.next();
		sb.append("\t" + m);
		System.out.println(sb.toString());
		
		
	}	
}
