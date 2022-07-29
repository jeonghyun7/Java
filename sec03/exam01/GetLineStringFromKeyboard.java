package sec03.exam01;

import java.io.*;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
			//InputStream을 Reader로 변환하고 다시 BufferedReader를 연결
		while(true) {
			System.out.print("입력하세요: ");
			String lineStr = br.readLine(); //라인 단위로 문자열을 읽음
			if(lineStr.equals("q") || lineStr.equals("quit")) break;//||이거나 또는.
			System.out.print("입력된내용: " + lineStr);
			System.out.println();
		}
		
		br.close(); // 입력 스트림 닫기
	}
}