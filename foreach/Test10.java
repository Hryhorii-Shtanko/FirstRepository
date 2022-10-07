package foreach;

public class Test10 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Hi");
		StringBuilder sb2 = new StringBuilder("Hello");
		StringBuilder sb3 = new StringBuilder("Czeshc");
		StringBuilder[] array = { sb1, sb2, sb3 };
		for (StringBuilder sb : array) {
			sb = new StringBuilder ("Hey");
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
