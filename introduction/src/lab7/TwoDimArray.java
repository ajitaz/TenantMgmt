package lab7;

public class TwoDimArray {
	public static void main(String[] args) {
		int[][] array= {{1,2},{3,4},{5,6},{7,8}}; 
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(array[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
