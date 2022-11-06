package collections2;

import java.util.ArrayDeque;

public class ArrayDeqEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer>deque = new ArrayDeque<Integer>();
  		deque.addFirst(45);
		deque.addLast(32);
		deque.offerLast(12);
		deque.offerFirst(22);
		System.out.println(deque);
		System.out.println(deque.pollLast());
		
		System.out.println(deque.getLast());
	}

}
