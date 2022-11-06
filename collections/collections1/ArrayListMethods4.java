package collections1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods4 {
	public static void main(String[] args) {
		
		
		ArrayList<String> arrayList1= new ArrayList<>();
		arrayList1.add("Zayr");
		arrayList1.add("Katia");
		arrayList1.add("Muftang");
		arrayList1.add("Misha");
		arrayList1.add("Kolia");
		System.out.println(" ArrayList = "+arrayList1);
	Object[]Array=	arrayList1.toArray();
	String[]string = arrayList1.toArray(new String[0]);
		for(String s:string  ) {
			System.out.println(s);
		
		
		
	}
		
		System.out.println(Array.toString());
//		List<String> myList= arrayList1.subList(1,4);
//		System.out.println("SubList = "+myList);
//		myList.add("Fioder");
//		System.out.println("SubList = "+myList);
//		System.out.println(" ArrayList = "+arrayList1);
//		arrayList1.add("Cvetta"); 
//		System.out.println(" ArrayList = "+arrayList1);
//		
//		
	}
		
//		ArrayList<String> arrayList2= new ArrayList<>();
//		arrayList2.add("Muftang");
//		arrayList2.add("Katia");
//		arrayList2.add("Igor");
//		System.out.println(arrayList2.containsAll(arrayList1));
//		//arrayList1.retainAll(arrayList2);
//		System.out.println(arrayList2);
//		
//}
}