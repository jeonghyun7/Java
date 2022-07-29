package sec02.exam07;

public class DowhileSumForm1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while(i<=100);	//조건식이 뒤에 나오기 때문에 만족하지않아도 1회는 실행문을 실행하는 것이 차이점이다.

		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}