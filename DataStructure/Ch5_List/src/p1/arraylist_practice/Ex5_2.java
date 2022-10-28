package p1.arraylist_practice;
// 2차원 배열
public class Ex5_2 {
	public static void main(String[] args) {
		int sale[][] = new int[][] {{63, 83, 150, 130}, {158, 209, 251, 312}};
		
		for(int i = 0; i<sale.length; i++) {
			for(int j = 0; j < sale[i].length; j++)
				System.out.printf("%d/4분기 : sale[%d][%d] = %d%n", j+1, i, j, sale[i][j]);
			System.out.println();
		}
	}
}
