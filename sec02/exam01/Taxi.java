package sec02.exam01;

public class Taxi implements Vehicle {
	@Override	//Vehicle run()메소드 재정의
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}