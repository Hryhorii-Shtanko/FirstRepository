package collections1;

import java.util.Arrays;

public class Test3 {

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

		System.out.println();
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		int index1 = Arrays.binarySearch(array, 15);
		System.out.println(index1);

		System.out.println((Arrays.toString(array)));

	}
}