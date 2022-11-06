package collections1;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx2 implements Comparable<StudentChDTU> {
	public static void main(String[] args) {
		TreeMap<StudentChDTU, Double> treemap2 = new TreeMap<>(new Comparator<StudentChDTU>() {
			@Override
			public int compare(StudentChDTU o1, StudentChDTU o2) {
				return 0;
				// o1.name.compareTo(o2.name);
			}
		});

		StudentChDTU st1 = new StudentChDTU("Zaur", "Tregulov", 3);
		StudentChDTU st2 = new StudentChDTU("Nikolay", "Mavlof", 28);
		StudentChDTU st3 = new StudentChDTU("Elena", "Frogina", 19);
		StudentChDTU st4 = new StudentChDTU("Zaur", "Tregulov", 3);
		StudentChDTU st5 = new StudentChDTU("Babur", "Tregulov", 2);
		StudentChDTU st7 = new StudentChDTU("Babur", "Bargulov", 2);
		StudentChDTU st6 = new StudentChDTU("Babur", "Bargulov", 2);
		StudentChDTU st8 = new StudentChDTU("Pietr", "Sidorov", 2);
		treemap2.put(st1, 10.2);
		treemap2.put(st2, 7.5);
		treemap2.put(st3, 6.4);
		treemap2.put(st4, 8.2);
		treemap2.put(st5, 8.3);
		treemap2.put(st6, 8.9);
		treemap2.put(st7, 8.9);
		treemap2.put(st8, 8.1);

		System.out.println(treemap2.containsKey(st7));
		System.out.println(treemap2.containsValue(st6));

		System.out.println(treemap2.descendingMap());
		System.out.println(treemap2.firstEntry());

		System.out.println(treemap2.containsKey(st3));
	}

	@Override
	public int compareTo(StudentChDTU o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
