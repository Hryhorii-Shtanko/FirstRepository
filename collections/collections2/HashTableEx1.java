package collections2;

import java.util.Hashtable;

public class HashTableEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map<Integer, String> hashmap= new HashMap<>(16,0.75f);
		// LinkedHashMap<Double,StudentChDTU> lhm = new LinkedHashMap<>(16, 0.75f,true);
Hashtable<Double, StudentChDTU>Htb = new Hashtable<Double, StudentChDTU>();
		
		StudentChDTU st1 = new StudentChDTU("Zaur", "Tregulov", 3);
		StudentChDTU st2 = new StudentChDTU("Nikolay", "Mavlof", 3);
		StudentChDTU st3 = new StudentChDTU("Elena", "Frogina", 4);
		StudentChDTU st4 = new StudentChDTU("Elena", "Frogina", 4);
		Htb.put(6.4, st2);
		Htb.put(7.2, st3);
		Htb.put(7.5, st4);
		// lhm.(7.5,st4);
		Htb.put(5.8, st1);
		System.out.println(Htb);
		System.out.println(Htb.get(7.2));
		//System.out.println(lhm);
		// System.out.println(st3.equals(st4))
		// System.out.println(map.containsKey(7.2));
		// st3.course=4;
	}
}
