
public class ArrayMatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] first = { { 1, 2, 0 }, { 2, 3, 4 } };
		 int[][] second = { { 3, 2, 5 }, { 6, 4, 3 } };
		 int[][] third = { { 1, 1, 1, 1 }, { 4, 3, 2, 1 }, { 2, 2, 2, 2 } };
		 int[][] fourth = { { 2, 2, 2, 3 }, { 2, 3, 2, 0 }, { 1, 2, 3, 4 } };
		 
		 int [][] firstSum = new int[2][3];
				 for (int i = 0; i < 2; i++) {
					 for (int j = 0; j < 3; j++) {
						 firstSum[i][j] = first[i][j] + second[i][j];
						 System.out.print(firstSum[i][j] + " ");
					 }
					 
					 System.out.println();
				 }
				 int [][] secondSum = new int[3][4];
				 for (int i = 0; i < 3; i++) {
					 for (int j = 0; j < 4; j++) {
						 secondSum[i][j] = third[i][j] + fourth[i][j];
						 System.out.print(secondSum[i][j] + " ");
					 }
					 System.out.println();
	}
}
}
