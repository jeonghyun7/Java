package sec02.exam06;

public class ArrayInArrayExample3 {

	public static void main(String[] args) {
		int[][] data = new int[3][4];
			data[0][0] = 10;
			data[0][1] = 15;
			data[0][2] = 7;
			data[0][3] = 3;
			data[1][0] = 1;
			data[1][1] = 6;
			data[1][2] = 17;
			data[1][3] = 2;
			data[2][0] = 20;
			data[2][1] = 2;
			data[2][2] = 6;
			data[2][3] = 4;
			
			for(int i=0; i<data.length; i++) {
				for(int j=0; j<data[i].length; j++)
					System.out.print(data[i][j] + " ");
				System.out.println();
			}
		}
	}