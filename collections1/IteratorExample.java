package collections;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample {
	public static void main(String[] args) {
		//povtoritel
	
		ArrayList<String> arrayList1= new ArrayList<>();
	arrayList1.add("Zayr");
	arrayList1.add("Katia");
	arrayList1.add("Muftang");
	arrayList1.add("Kolia");
	arrayList1.add("Elena");
	
	Iterator<String> iterator = arrayList1.iterator();
	while (iterator.hasNext()) {
		iterator.next();
		iterator.remove();
		//System.out.println(iterator.next() );
	}
	System.out.println(arrayList1);
	
	
}
}