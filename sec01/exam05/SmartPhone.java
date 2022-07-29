package sec01.exam05;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override					//toString() 재정의
	public String toString() {
		return company + ", " + os;
	}	
}
