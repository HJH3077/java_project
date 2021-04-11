package com.ict07.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		// 바이트-문자 결합 : 체인방식
		// 입력 : InputStreamReader = InputStream -> Reader
		// 구조 : InputSream -> InputStreamReader(젠더역할) -> Reader -> BufferedReader
		// 기계가 쓰는걸 사람이 쓰게 바꾼느낌?
		
		/*
		Scanner scan = new Scanner(System.in); // System.in = 키보드 = 기계
		System.out.print("원하는 문자 입력 : ");
		String msg = scan.next();
		System.out.println("받은 문자 : " + msg); // 기계 -> 사람이 쓰게끔
		*/
		
		System.out.print("원하는 문자 입력 : ");
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine(); // 한줄씩 읽기
			System.out.println("받은 문자 : " + msg); // scanner처럼됨.
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
		
	}
}
