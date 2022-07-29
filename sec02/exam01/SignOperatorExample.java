package sec02.exam01;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		byte b = 100;
		//byte result3 = -b;	//컴파일에러 -> result3 = -1 * 100 과 같이 산술연산이 들어감으로써 int타입으로 변수값을 받아야한다.
		int result3 = -b;
		System.out.println("result3=" + result3);
	}
}