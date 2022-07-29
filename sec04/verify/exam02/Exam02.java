package sec04.verify.exam02;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) throws Exception {	//throws Exception은 System.in.read()에 대한 예외처리코드
		Scanner scanner = new Scanner(System.in);	//new Scanner(System.in)은 시스템의 입력장치로부터 읽는 Scanner를 생성하는 코드
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();		//Enter 이전까지 입력된 문자열을 읽음
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		int num1 = Integer.parseInt(strNum1);		//String타입 , 즉 문자열을 int타입 정수형으로 바꾸어줌.
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}
}