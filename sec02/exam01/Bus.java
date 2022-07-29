package sec02.exam01;

public class Bus implements Vehicle {
	@Override	//Vehicle run()메소드 재정의
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}