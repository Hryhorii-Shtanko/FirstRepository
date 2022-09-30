package varargsArguments;

public class Test3 {

	static void summa(int[] a) {
		int summa = 0;
		for (int i = 0; i < a.length; i++) {
			summa += a[i];
		}
		System.out.println(summa);
	}

	public static void main(String... args) {

	}
}
