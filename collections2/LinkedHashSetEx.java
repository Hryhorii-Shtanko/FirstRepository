package collections2;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
public static void main(String[] args) {
	LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
	lhs.add(null);
	lhs.add(5);
	lhs.add(3);
	lhs.add(8);
	lhs.add(1);
System.out.println(lhs);
lhs.remove(null);
 System.out.println(lhs.contains(8));
}
}
