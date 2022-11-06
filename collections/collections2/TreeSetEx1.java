package collections2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
public static void main(String[] args) {
	
	Set<Integer> treeset = new TreeSet<Integer>();
	treeset.add(10);
	treeset.add(8);
	treeset.add(2);
	treeset.add(5);
	treeset.add(6);
	//treeset
	
	System.out.println(treeset);
	System.out.println(treeset.contains(2));
}
}
