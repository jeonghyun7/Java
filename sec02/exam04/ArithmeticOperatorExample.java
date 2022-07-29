package sec02.exam04;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);	//result1=7
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);	//result2=3
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);	//result3=10
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);	//result4=2 -> int타입으로 변수를 받기 때문에 소수점이하는 손실됨.
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);	//result5=1 -> v1=5 를 v2=2로 나눈 나머지는 1이다.
		
		double result6 = (double) v1 / v2;
		System.out.println("result6=" + result6);	//result6=2.5 -> v1과 v2가 int타입이기 때문에 소수점자리 까지 표현하기 위하여 (double)로 형 변환해줌.
	}
}