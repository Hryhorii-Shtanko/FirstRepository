package collections;

import java.util.ArrayList;

public class ArrayListmethods {
	public static void main(String[] args) {
		
	
	ArrayList<String> arrayList1= new ArrayList<>();
	arrayList1.add("Zayr");
	arrayList1.add("Katia");
	arrayList1.add("Muftang");
	arrayList1.add(1,"Misha");
	for(String s: arrayList1) {
		System.out.print(s + " ");
	}
	System.out.println();
	
	//ArrayList<Integer> ist2 =new ArrayList<>();
//for(int i= 0; i < arrayList1.size(); i ++) {
//	System.out.println(arrayList1.get(i));
//	}
arrayList1.set(1, "Masha");
arrayList1.remove(0);
arrayList1.remove(0);
//arrayList1.remove(arrayList1);

System.out.println(arrayList1);

	}
}
