package sec02.exam05;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;					//A의 유니코드65 + 1 = 66 유니코드를 가지고 c1에 저장됨
		char c2 = 'A';			
		//char c3 = c2 + 1;					//컴파일 에러 -> char변수를 산술연산하면 int 타입으로 c3을 저장해주어야 한다.
		System.out.println("c1: " + c1);	//c1은 유니코드66의 char 타입 B가 출력 
		System.out.println("c2: " + c2);	//c2는 A 그대로 출력
		//System.out.println("c3: " + c3);	//출력하기 위해서는 변수 c3을 int타입 으로 저장받고 출력
	}
}