package streamAndOthers;


import java.util.ArrayList;
import java.util.List;

public class ArrayFirstHeap {
	public static void main(String[] args) {
	

	ArrayList<String> arrayList1= new ArrayList<>();
	arrayList1.add("Zayr");
	arrayList1.add("Katia");
	arrayList1.add("Muftang");
	arrayList1.add("Misha");
	arrayList1.add("Kolia");
	List<Integer> list1 = List.of(3,8,13);
	
	System.out.println(list1);
	List<String> list2 =List.copyOf(arrayList1);
	
	System.out.println(list2);
	}

}
