package sec01.exam03;

public class Computer extends Calculator {
	@Override	//메소드 재정의
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}