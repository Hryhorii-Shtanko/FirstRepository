package collections2;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {

		PriorityQueue <Student> pQue = new PriorityQueue();

		Student st1 = new Student("Zaur", 1);
		Student st2 = new Student("Nikolay", 3);
		Student st3 = new Student("Elena",2);
		Student st4 = new Student("Elena", 4);
		Student st6 = new Student("Evan", 2);
		Student st7= new Student("Evan", 5);
		pQue.add(st2);
		pQue.add(st1);
		pQue.add(st3);
		pQue.add(st4);
		pQue.add(st7);
		
		
		System.out.println(pQue.poll());
		System.out.println(pQue.poll());
		System.out.println(pQue.poll());
		System.out.println(pQue.poll());
		System.out.println(pQue.poll());
		System.out.println(pQue.poll());
    
		
//		PriorityQueue <Integer> pQ = new PriorityQueue<>();
//		// pQ.add(null);
//		pQ.add(4);
//		pQ.add(1);
//		pQ.add(7);
//		pQ.add(10);
//		pQ.add(8);
//		
//		System.out.println(pQ);
////		System.out.println(pQ.peek() );
//		System.out.println(pQ.poll());
//		System.out.println(pQ.poll());
//		System.out.println(pQ.poll());
//		System.out.println(pQ.poll());
//		System.out.println(pQ.poll());
		
	}

}
