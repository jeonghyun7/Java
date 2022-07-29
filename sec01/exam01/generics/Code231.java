package sec01.exam01.generics;

class Data1<T extends Number> { //Number 클래스의 하위 클래스 타입
	T obj;
	Data1(T ob) {
		obj = ob;
	}
	int calcMultiple(int n) {
		return obj.intValue() * n;
	}
}

public class Code231 {
	public static void main(String[] args) {
		Data1<Integer> d = new Data1<Integer>(100); //Integer는 Number의 하위 클래스임
		int result = d.calcMultiple(5);
		System.out.println(result);
		
		Data1<Double> e = new Data1<Double>(17.5); // Double 역시 Number의 하위 클래스임.
		int result2 = e.calcMultiple(5);
		System.out.println(result2);
	}
}