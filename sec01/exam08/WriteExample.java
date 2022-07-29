package sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		//데이터 도착지를 test8.txt로 하는 문자 기반 파일 출력 스트림을 생성
		char[] array = { 'A', 'B', 'C' };
		
		writer.write(array); // 배열의 모든 문자를 출력
		
		writer.flush(); // 출력 버퍼에 잔류하는 모든 문자를 출력
		writer.close(); // 출력 스트림을 닫음
	}
}