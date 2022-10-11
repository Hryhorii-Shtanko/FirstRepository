package streamAndOthers;


import java.util.ArrayList;
import java.util.List;

public class ArraySecondHeap {

	public static void main(String[] args) {
		List<String> list = List.of("privet", "kak dela?", "normalno", "poka");
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(4);
		list2.add(8);
		list2.add(16);
		list2.add(32);
		
		list2.forEach(el ->{
			System.out.println(el);
			el*=2;
			System.out.println(el);
			});
		}
}
