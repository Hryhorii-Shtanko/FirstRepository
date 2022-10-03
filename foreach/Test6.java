package foreach;

public class Test6 {
	public static void main(String[] args) {
		int[][] array = { { 3, 7, 8 }, { 4, 5 }, { 9, 4, 4, 6, 8, 3 } };
		for (int[] array2 : array) {
			for (int a : array2) {
				System.out.print(a + " ");
			}
		}
	}
}
