package sec01.exam01;

public class IfExample {
	public static void main(String[] args) {
		int score =90;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score< 90) 	// score 가 90보다 작았을때 13, 14라인을 출력하기 위해서는 {}를 12라인에서 추가 해주어야 한다.
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
	}	//14라인은 들여쓰기만 되어있을 뿐 if문과는 아무런관련이 없기 때문에 12라인 if문과 관계없이 무조건 출력된다.
}