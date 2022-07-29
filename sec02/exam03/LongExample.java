package sec02.exam03;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; <- 컴파일 에러발생!! 정수 리터럴이 int타입의 허용범위 밖이라서.
		long var4 = 1000000000000L;
				
		System.out.println(var1);
		System.out.println(var2);
		//System.out.println(var3); <- 컴파일 에러발생!!
		System.out.println(var4);
	}
}