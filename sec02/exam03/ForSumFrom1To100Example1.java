package sec02.exam03;

public class ForSumFrom1To100Example1 {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}			// 8라인에서 마지막에 i가 빠져나올 때 101이 되어서 빠져나오기 때문에 (i-1)을 해주어 100이 된다.

}
