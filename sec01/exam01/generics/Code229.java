package sec01.exam01.generics;

class Data<T> { //클래스명 옆에 제네릭 기호<>를 적고 그 안에 매개변수 기술함
	T obj;		//인스턴스 변수 obj의 자료형은 T임.
	Data(T ob) { //생성자 Data는 자료형이 T인 인수 한 개를 입력받음.
		obj = ob;
	}
	T getObj() { //인스턴스 변수 obj의 자료형은 T임.
		return obj;
	}
	
	void showType() {
		System.out.println("Type of T:" + obj.getClass().getName());
	}
	
}

public class Code229 {
	public static void main(String[] args) {
		Data<Integer> d1 = new Data<Integer>(100); //정수 100 인수
		System.out.println(d1.getObj());
		d1.showType();
		
		Data<String> d2 = new Data<String>("JAVA"); //문자열 "JAVA" 인수
		System.out.println(d2.getObj());
		d2.showType();
	}
}