package foreach;

public class Test11 {
	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Hi");
		StringBuilder sb2 = new StringBuilder("Hello");
		StringBuilder sb3 = new StringBuilder("Czeshc");
		StringBuilder[] array = { sb1, sb2, sb3 };
		for (StringBuilder sb : array) {
			sb.append("Java");
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
