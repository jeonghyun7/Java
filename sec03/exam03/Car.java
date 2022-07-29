package sec03.exam03;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car() {
	}
	
	Car(String model) {
		this(model, null, 0);	//가장 많은 필드를 초기화하는 마지막 생성자를 호출.
	}
	
	Car(String model, String color) {
		this(model, color, 0);	//다른생성자를 호출하는 this()메소드는 생성자안에 첫번째 라인에 사용.
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
	/*Car(String model) {
		this.model = model;	//객체자신의 필드를 참조
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}*/
