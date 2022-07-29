package sec02.exam06;

public class ArrayInArrayExample2 {
	public static void main(String[] args) {
		int data[][] = new int[3][];	//행의 길이만 명시함.
		data[0] = new int[4];			//0으로 초기화됨.
		data[1] = new int[5];
		data[2] = new int[3];
		
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++)
				System.out.print(data[i][j] + " ");
			System.out.println();
		}
	}
}