package sec02.exam07;

public class WhileSumForm1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;	//sum =sum+i 와 같다.
			i++;
		}

		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}		//while문에서 마지막에 i가 빠져나올때는 101이기 때문에 i-1을 해주어야 100이 된다.
}