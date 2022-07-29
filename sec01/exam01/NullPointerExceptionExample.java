package sec01.exam01;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());
	}
}	//NullPointerException 객체가 없는 상태에서 객체를 사용하려하여 예외 발생.

/*5라인에서 data변수는 null값을 가지고 있기 때문에 String객체를 참조하고 있지 않습니다.
하지만 6라인에서 String객체의 toString() 메소드를 호출하고 있습니다. 
여기에서 NullPointer Exception이 발생합니다. */