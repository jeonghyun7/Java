package sec02.exam01;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //매개변수의 다형성 자동타입변환 발생(Vehicle vehicle = bus;)
		driver.drive(taxi);//매개변수의 다형성 자동타입변환 발생(Vehicle vehicle = taxi;)
	}
}