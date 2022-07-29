package sec02.exam02;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------");
		x++;									//후위증가 x=x+1 -> 11
		++x;									//전위증가 x=x+1 -> 12
		System.out.println("x=" + x);			// x=12 출력
		
		System.out.println("----------------");
		y--;									//후위감소 y=y-1 -> 9
		--y;									//선위감소 y=y-1 -> 8
		System.out.println("y=" + y);			// y=8 출력
		
		System.out.println("----------------");
		z = x++;								//x는 후위증가 z에 12대입 -> x=x+1 -> 13
		System.out.println("z=" + z);			// z=12 출력
		System.out.println("x=" + x);			// x=13 출력
		
		System.out.println("----------------");
		z = ++x;								//x는 전위증가 x=x+1 -> 14 -> z에 14대입
		System.out.println("z=" + z);			//z=14 출력
		System.out.println("x=" + x);			//x=14 출력
		
		System.out.println("----------------");
		z = ++x + y++;							//x는 전위증가 , y는 후위증가 x=x+1-> x는 15, y는 8, z는 23 대입 y는 연산 후 증가 y는 9
		System.out.println("z=" + z);			//x=15 , y=8
		System.out.println("x=" + x);			//z=23 , y=9
		System.out.println("y=" + y);			//z=23 , x=15, y=9
	}
}