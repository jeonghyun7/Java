package sec01.exam04;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servelet/JSP");
		set.add("Java");	//"Java"는 한 번만 저장됨
		set.add("iBATIS");
		
		int size = set.size(); //저장된 객체 수 얻기
		System.out.println("총 객체수: " + size);//총 객체수: 4 출력
		
		Iterator<String> iterator = set.iterator(); //반복자 얻기
		while(iterator.hasNext()) { //객체 수 만큼 루핑/ hasNext() - 가져올 객체가 있으면 true를 리턴하고 없으면 false를 리턴합니다.
			String element = iterator.next(); //1개의 객체를 가져옴
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC"); //1개의 객체 삭제
		set.remove("iBATIS"); //1개의 객체 삭제
		
		System.out.println("총 객체수: " + set.size()); //저장된 객체 수 얻기, 총 객체수: 2 출력
		
		iterator = set.iterator(); //반복자 얻기
		for(String element : set) {
			System.out.println("\t" + element); //객체 수 만큼 루핑
		}
		
		set.clear(); //모든 객체를 제거하고 비움
		if(set.isEmpty()) { System.out.println("비어 있음"); }
	}
}