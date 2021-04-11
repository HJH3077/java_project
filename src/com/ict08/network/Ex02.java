package com.ict08.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex02 {
	public static void main(String[] args) {
		// URL 클래스 : URL(Uniform Resource Locator) - 접근 가능한 자원의 주소를 말한다.
		//				final 클래스이기 때문에 상속이 불가능.
		
		InputStream is = null; // 파일이 아닌 컴퓨터니까 그냥 InputStream
							   // 읽는건 웹상의 것을 읽고 쓰는건 내 컴퓨터에 쓰므로
		InputStreamReader isr = null; // 기계어인데 글자로 가져옴
		BufferedReader br = null; // 속도상승
		
		String pathname = "C:" + File.separator + "study" + File.separator + "util"
											+ File.separator + "네이버영화.txt";
		File file = new File(pathname);
		FileWriter fw = null; // 파일에 쓰니까 FileWriter
		BufferedWriter bw = null;
		
		try {
			// 먼저 웹 페이지를 읽자
			URL url = new URL("https://www.kma.go.kr/XML/weather/sfc_web_map.xml"); // 접근주소
			is = url.openStream(); // 접속, 웹사이트 가서 읽기
			isr = new InputStreamReader(is, "utf-8"); // 여기서 받은 정보를 한글 처리로 역직렬화
													  // utf-8은 한글처리를 의미함
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer(); // String을 계속 누적시키면 메모리가 소모되므로
												  // 있던 곳에 누적시키기 위해
			while((msg =br.readLine())!= null) {
				sb.append(msg+"\n"); // 계속 한줄씩 sb에 추가됨
			}
			
			// System.out.println(sb.toString());
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString()); // "sb.toString의 값을 file로 써라" 라는 의미
			bw.flush();
			
			
		} catch (Exception e) {
			System.out.println(e); // 혹시 오류날까봐
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
			System.out.println(e2);
			}
		}
	}
}
