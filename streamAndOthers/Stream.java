package streamAndOthers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("privet");
		list.add("kak dela&");
		list.add("Ok");
		list.add("poka");
		list.add("privet");

		List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
		System.out.println(list2);
		int[] array = { 5, 9, 3, 8, 1 };
		array = Arrays.stream(array).map(element -> {
			if (element % 3 == 0) {
				element = element / 3;
			}
			return element;
		}).toArray();
		Set<String> set = new TreeSet<>();
		set.add("kak dela&");
		set.add("Ok");
		set.add("poka");
		set.add("privet");
		System.out.println(set);
		List<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toList());
		System.out.println(set.stream().map(e -> e.length()).collect(Collectors.toSet()));
		System.out.println(set2);
	}
}
