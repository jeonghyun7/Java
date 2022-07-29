package sec02.exam10;

public class ContinueExample {
	public static void main(String[] args) throws Exception {
		System.out.println("짝수출력");
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			
			System.out.println(i);
		}
		System.out.println("홀수출력");
		for(int i=1; i<=10; i++) {
			if(i%2 != 1) {
				continue;
			}
		
			System.out.println(i);
		}
	}
}