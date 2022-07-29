package sec01.exam02;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		String data1 = arg[0];	//두개의 실행 매개값을 주지 않았기에 인덱스를 사용할 수 없어 예외발생
		String data2 = arg[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}
}