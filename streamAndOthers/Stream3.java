package streamAndOthers;

import java.util.ArrayList;
import java.util.List;

public class Stream3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(4);
		list.add(3);

		int re = list.stream().reduce((accumulator, element) -> accumulator + element).get();

		int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator + element);

		List<String> list3 = new ArrayList<String>();
		list3.add("privet");
		list3.add("kak dela&");
		list3.add("Ok");
		list3.add("poka");
		list3.add("privet");

		String result3 = list3.stream().reduce((a, e) -> a + " " + e).get();
		System.out.println(result3);

	}

}
