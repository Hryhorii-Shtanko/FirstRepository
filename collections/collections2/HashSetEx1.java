package collections2;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
public static void main(String[] args) {
	Set<String> set = new HashSet<String>();
	set.add(null);
	set.add("Dcember");
	set.add("December");
	set.add("October");
	set.add("October");
	
	System.out.println(set);
	set.remove("October");	
	for(String s: set) {
		System.out.println(s);
	}
int lenghtofSet = set.size();
System.out.println(set.contains("December"));
	
	
}

}
