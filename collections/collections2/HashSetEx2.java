package collections2;

import java.util.HashSet;

public class HashSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hashset1 = new HashSet<Integer>();
		hashset1.add(2);
		hashset1.add(3);
		hashset1.add(8);
		hashset1.add(5);
		hashset1.add(1);
		
		HashSet<Integer> hashset2 = new HashSet<Integer>();
		hashset2.add(7);
		hashset2.add(4);
		hashset2.add(5);
		hashset2.add(8);
		hashset2.add(3);
		
		HashSet<Integer> interSect= new HashSet<>(hashset1);
interSect.removeAll(hashset2);
//retainAll.addAll(hashset2);

System.out.println(interSect); 
		
		
		
	}

}
