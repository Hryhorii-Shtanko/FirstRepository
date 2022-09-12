package collections1;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx {
public static void main(String[] args) {
	Map<Integer, String> map1= new HashMap<>();
	map1.put(1000, "Zaur Trigul");
	map1.put(1010, "Narzolo Trigul");
	map1.put(1030, "Dovbuch Karpat");
	map1.put(112345, "Kiev Tolkmach");
	System.out.println(map1);
	map1.remove(112345);
	System.out.println(map1);
//	System.out.println(map1.containsValue("Narzolo Trigul"));
	System.out.println(map1.containsKey(1000));
	System.out.println(map1.values());
	Map<String, String> map2 = new HashMap<>();
	map2.put("Durnoy", "Josha Dydaev");
	map2.put("Gorzniy", "Josha Kadirow");
	 System.out.println(map2.values());
	
	
}
}
