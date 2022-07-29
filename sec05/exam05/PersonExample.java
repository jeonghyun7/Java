package sec05.exam05;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";		 //_final이 붙어있는 필드는 값변경 불가
		//p1.ssn = "654321-7654321"; //_final이 붙어있는 필드는 값변경 불가
		p1.name = "홍삼원";	// 값 변경가능.
		System.out.println(p1.name);	//변경된 값이 출력된다.
	}
}