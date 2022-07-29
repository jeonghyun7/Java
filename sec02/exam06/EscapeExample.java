package sec02.exam06;

public class EscapeExample {
	public static void main(String[] args) {
		System.out.println("번호\t이름\t직업");			// Tab만큼 띄우기<-\t
		System.out.print("행 단위 출력\n");			// println은 줄바꿈기능까지 추가
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.print("봄\\여름\\가을\\겨울");
	}
}