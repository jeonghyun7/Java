package sec04.exam05;

import java.util.Scanner;			//scanner.nextLine() 메소드를 사용하기 위하여 사용되는 import문

public class ScannerExample {
	public static void main(String[] args) throws Exception {		//throws Exception 입출력 관련, 즉 System.in.read()에 대한 예외처리코드.
		Scanner scanner = new Scanner(System.in);	//new는 객체 생성 예약어
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")) {
				break;					// break; -> 가장 가까운 반복문을 빠져나감
			}
		}

		System.out.println("종료");
	}
}