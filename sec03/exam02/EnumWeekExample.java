package sec03.exam02;

import java.util.Calendar;		//Calendar 클래스는 java.util 패키지에 있으므로 import가 필요

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;	//열거타입 변수선언(today) 및 초기값 null대입, 열거타입도 참조타입이기 때문에 null값 저장가능.
		
		Calendar cal = Calendar.getInstance();	//Calendar변수를 선언, Calendar.getInstance메소드로 Calendar 객체를 얻음.
		int week = cal.get(Calendar.DAY_OF_WEEK);//get()메소드를 이용해서 요일(1~7)을 얻음.
		
		switch(week) {
			case 1:
				today = Week.SUNDAY; break;
			case 2:
				today = Week.MONDAY; break;
			case 3:
				today = Week.TUESDAY; break;
			case 4:
				today = Week.WEDNESDAY; break;
			case 5:
				today = Week.THURSDAY; break;
			case 6:
				today = Week.FRIDAY; break;
			case 7:
				today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일: " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");	
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}
	}
}