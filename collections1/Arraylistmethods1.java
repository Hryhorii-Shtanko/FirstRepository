package collections;

import java.util.ArrayList;

public class Arraylistmethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList1= new ArrayList<>();
		arrayList1.add("Ivan");

		arrayList1.add("Zayr");
		arrayList1.add("Zayr");
		arrayList1.add("Mariya");
		System.out.println(arrayList1.toString());
//		ArrayList<String> arrayList2= new ArrayList<>();
//		arrayList2.add("!!!");
//		arrayList2.add("???");
//		arrayList1.addAll(1,arrayList2);
//		System.out.println(arrayList1);
//arrayList1.clear();
		//System.out.println(arrayList1.indexOf("Zayr"));
//System.out.println(arrayList1.size());
////arrayList1.clear();
//System.out.println(arrayList1.isEmpty());
		System.out.println(arrayList1.contains("Nikolay"));
System.out.println(arrayList1.contains("Mariya"));
			}
}
