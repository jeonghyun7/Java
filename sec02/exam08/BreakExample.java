package sec02.exam08;

public class BreakExample {
	public static void main(String[] args) {
		while(true ) {
			int num = (int)(Math.random()*6) +1;
			System.out.println(num);
			if(num == 6) {
				break;	//가장 가까운 반복문을 빠져나간다.
			}
		}
		System.out.println("프로그램 종료");
	}
}