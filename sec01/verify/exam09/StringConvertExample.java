package sec01.verify.exam09;

public class StringConvertExample {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);

	System.out.println("문자열->기본타입값 숫자: " +intData1);
	System.out.println("기본타입값 숫자->문자열: " + strData2);
	}
}