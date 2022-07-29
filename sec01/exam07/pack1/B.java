package sec01.exam07.pack1;

public class B {
	public void method() {
		A a = new A();
		a.field = "value";		//접근가능(같은패키지)
		a.method();
	}
}
