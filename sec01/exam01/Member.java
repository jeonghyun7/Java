package sec01.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {	//매개값이 Member타입인지 확인
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true; //Member타입으로 강제타입 변환하고 id필드값이 동일한지 검사후, 동일하다면 true를 리턴
			}
		}
		return false;	//매개값이 Member 타입이 아니거나 id 필드값이 다른 경우 false를 리턴
	}
}
