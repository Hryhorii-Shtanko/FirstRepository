package collections1;

import java.util.TreeMap;

public class TreeMapEx1 {
	public static void main(String[] args) {
		TreeMap<Double, StudentChDTU> treemap = new TreeMap<>();
		// TreeMap<StudentChDTU, Double> treemap2= new TreeMap<>(new
		// Comparator<StudentChDTU>() {
//			@Override
//			public int compare(StudentChDTU o1, StudentChDTU o2) {
//				// TODO Auto-generated method stub
//				return o1.name.compareTo(o2.name);
//			}

		StudentChDTU st1 = new StudentChDTU("Zaur", "Tregulov", 3);
		StudentChDTU st2 = new StudentChDTU("Nikolay", "Mavlof", 28);
		StudentChDTU st3 = new StudentChDTU("Elena", "Frogina", 19);
		StudentChDTU st4 = new StudentChDTU("Zaur", "Tregulov", 3);
		StudentChDTU st5 = new StudentChDTU("Babur", "Tregulov", 2);
		StudentChDTU st7 = new StudentChDTU("Babur", "Bargulov", 2);
		StudentChDTU st6 = new StudentChDTU("Babur", "Bargulov", 2);
		StudentChDTU st8 = new StudentChDTU("Pietr", "Sidorov", 2);
		treemap.put(10.2, st1);
		treemap.put(7.5, st2);
		treemap.put(6.4, st3);
		treemap.put(8.2, st4);
		treemap.put(8.3, st5);
		treemap.put(8.9, st6);
		treemap.put(8.9, st7);
		treemap.put(8.1, st8);

		System.out.println(treemap.containsKey(st7));
		System.out.println(treemap.containsValue(st6));

		// System.out.println(treemap.get(8.2));
		System.out.println(treemap.descendingMap());
		System.out.println(treemap.firstEntry());

		// System.out.println(treemap.containsKey(st3));
	}
}
