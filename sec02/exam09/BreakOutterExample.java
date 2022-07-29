package sec02.exam09;

public class BreakOutterExample {
	public static void main(String[] args) throws Exception {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;	// Outter라고 지정한 레이블의 반복문이 빠져나가진다. 
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}