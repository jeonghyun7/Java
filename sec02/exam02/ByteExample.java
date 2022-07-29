package sec02.exam02;

public class ByteExample {
	public static void main(String[] args) {
	byte var1 = -128;
	byte var2 = -30;
	byte var3 = 0;
	byte var4 = 30;
	byte var5 = 127;
	int var6 = 128;		// 128이란 숫자는 byte형에 저장되는 값의 허용범위 127을 넘기때문에 int형이나 short형으로 받아주어야한다.
	
	System.out.println(var1);
	System.out.println(var2);
	System.out.println(var3);
	System.out.println(var4);
	System.out.println(var5);
	System.out.println(var6);
	}
}