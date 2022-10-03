package foreach;

public class Test3 {

	public static void main(String[] args) {
		int[] array = { 0, 6, 4, 1 };
		int summ = 0;
		for (int a : array) {
			summ += a;
		}
		System.out.println(summ);
	}

}
