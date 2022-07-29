package sec01.exam05;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();	//재정의된 toString()호출
		System.out.println(strObj);
		
		System.out.println(myPhone);	//재정의된 toString()을 호출하고 리턴값을 받아 출력
	}
}