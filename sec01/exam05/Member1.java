package sec01.exam05;

public class Member1 {
	public String name;
	public int age;
	
	public Member1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) { //name과 age값이 같으면 true를 리턴
		if(obj instanceof Member1) {
			Member1 member = (Member1) obj;
			return member.name.equals(name) && (member.age==age);
		} else {
			return false;
		}
	}
	
	@Override 
	public int hashCode() { //name과 age값이 같으면 동일한 hashCode를 리턴
		return name.hashCode() + age; //String의 hashCode() 이용
	}
}//해쉬코드 먼저 비교하고 true가 반환되면 equals도 비교하여 또 true가 반환되면 같은 값으로 판단하여 중복저장X