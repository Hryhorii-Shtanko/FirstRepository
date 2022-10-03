package foreach;

public class Test5 {
	public static void main(String[] args) {
		int[][] array = { { 3, 7, 8 }, { 4, 5 }, { 9, 4, 4, 6, 8, 3 } };
		for (int i = 0; 1 < array[i].length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
	}
}
