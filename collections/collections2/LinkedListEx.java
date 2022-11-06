package collections2;

import java.util.LinkedList;
import java.util.Queue;

public abstract class LinkedListEx {

	public static void main(String[] args) {
		Queue<String>que =    new LinkedList<String>();
		que.add(null);
		que.add("Lara");
		que.add("Oskar");
		que.add("Maria");
		que.add("Alexandr");
		
		
		System.out.println(que.remove("Oskar")     );
		System.out.println(que);
//		System.out.println(que.remove());
//		System.out.println();
//		System.out.println(que.element());
//
//		System.out.println(que.remove());
//		System.out.println(que.element());
//		
//		System.out.println(que.remove());
//		System.out.println(que.element());
//		System.out.println(que.remove());
//		System.out.println(que.element());
//		System.out.println(que.remove());
//		System.out.println(que.peek());
		
		//que.add("Zaur");
		
	}
}
