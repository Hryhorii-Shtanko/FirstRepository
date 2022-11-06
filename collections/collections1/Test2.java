package collections1;

public class Test2 {

	public static void main(String[] args) {
		int[] array = { 20, -10, 15, -7, -8, 45 };
		double max = array[0];
		double min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
