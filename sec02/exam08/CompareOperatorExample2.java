package sec02.exam08;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //true -> v2에 1을 1.0으로 자동 형변환하여 비교연산 하므로 true 출력
		
		double v4 = 0.1;
		float v5 = 0.1f;			// 일단 v5를 double형으로 자동형변환 하여 비교 하지만 아래설명 참조.
		System.out.println(v4 == v5); //false -> v5는 0.10000012345처럼 소수점6자리아래는 임의의수가 저장되어있으므로 0.100000000000000인 v4와 달라서 false가 출력
		System.out.println((float)v4 == v5); //true -> 오히려 double을 float형으로 강제 형변환하면 둘다 6자리까지 정확히 표시하기 때문에 true출력
		System.out.println((int)(v4*10) == (int)(v5*10));	//true -> 둘다 모두 int형으로 강제 형변환 하면 모두 정수1이 되기때문에 true가 출력
	}
}