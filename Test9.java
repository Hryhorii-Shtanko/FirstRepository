package foreach;

public class Test9 {
	public static void main(String[] args) {
		String[] array = {"Hi","Hello","Czeshc"};
		for (String s : array) {
			s = new String ("Hey");
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
