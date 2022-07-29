package sec01.exam04;

public class Outter {
	//자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100;			//내부에서 변경 X
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후
	public void method2(int arg) {	//매개변수안에 final생략과 같음
		int localVariable = 1;		//로컬변수안에 final생략과 같음
		//arg = 100;			//내부에서 변경 X
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}	//매개변수와 로컬변수를 로컬클래스내부에서 사용할 때 매개변수와 로컬변수가 final의 특성을 가지고 있다.
		}
	}
}