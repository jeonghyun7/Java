package sec02.exam07;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println( strArray[0] == strArray[1]);	//Java가 써져있는 가리키는 주소가 같음
		System.out.println( strArray[0] == strArray[2]);	//주소가 다름
		System.out.println( strArray[0].equals(strArray[2]) );	//주소가 가르키는 곳의 문자열을 비교 같음
	}
}