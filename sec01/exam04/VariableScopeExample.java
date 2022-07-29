package sec01.exam04;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		  int v3 = v1 + v2 + 5;		// v3를 if구문 안에서 같이 선언하고 대입식을 세워줘야 v2변수를 사용할 수 있고 컴파일에러를 피할수 있다.
		  System.out.println(v3);  
	          }		
		}	
}