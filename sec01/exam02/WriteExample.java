package sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test2.db");
		//데이터 도착지를 test2.db로 하는 바이트 기반 파일 출력 스트림을 생성
		
		byte[] array = { 10, 20, 30 };
		
		os.write(array); // 배열의 모든 바이트를 출력
		
		os.flush(); // 출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close(); // 출력 스트림을 닫음
	}
}