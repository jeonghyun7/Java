package sec02.exam01;

public class Car1Example {
	public static void main(String[] args) {
		Car1 myCar = new Car1();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
	}
}
