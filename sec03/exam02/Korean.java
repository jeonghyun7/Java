package sec03.exam02;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;

	//생성자
	/*public Korean(String n, String s) {
		name = n;
		ssn = s;
	}*/
	
	public Korean(String name, String ssn) {
	  this.name = name;		//this는 객체 자신의 참조 매개변수명과 필드명 동일 권장.
	  this.ssn = ssn;
	 }
}
