package sec01.exam07.pack2;
import sec01.exam07.pack1.A;

public class D extends A {
	public D() {
		super();
		this.field = "value";	//접근가능 다른패키지이지만 D는 A의 자식클래스이고 자식생성자에서 super();로 A를 호출함.
		this.method();
	}
}
