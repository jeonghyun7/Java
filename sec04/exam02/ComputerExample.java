package sec04.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3}; 	//Computer객체의 sum1메소드의 매개변수가 배열타입이므로 메소드를 호출하는 8라인 전에 배열을 생성해야한다. , 목록값 대입으로 초기화
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);

		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});	//메소드의 매개변수가 배열일 경우 값목록으로 배열을 생성함과 동시에 메소드 매개값으로 전달을 위해서는 new연산자를 사용해주어야한다.
		System.out.println("result2: " + result2);
		
		int result3 = myCom.sum2(1, 2, 3);	//sum2의 메소드 매개변수가 ...을 사용해서 선언되어 있으므로 메소드 호출시(1, 2, 3);처럼 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용됨.
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);
	}
}