package collections1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Binaryseach {

	public static void main(String[] args) {
		String s = "madam";
		List<Character> list = new LinkedList<Character>();
		for (char ch: s.toCharArray()) {
			list.add(ch);
		}
		ListIterator<Character> iterator = list.listIterator();
		ListIterator<Character> reverseIterator = list.listIterator(list.size());
		boolean isPalindrome = true;
		while (iterator.hasNext() && reverseIterator.hasPrevious()) {
			if(iterator.next() != reverseIterator.previous()) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
			
		
//		
//		
//		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		arrayList.add(-30);
//		arrayList.add(-3);
//		arrayList.add(19);
//		arrayList.add(8);
//		arrayList.add(12);
//		arrayList.add(-8);
//		arrayList.add(0);
//		arrayList.add(5);
//		arrayList.add(10);
//		arrayList.add(1);
//		arrayList.add(150);
//		
//		Collections.sort(arrayList);
//		System.out.println(arrayList);
//		int index1 = Collections.binarySearch(arrayList, 150);
//		System.out.println(index1);
//		Collections.reverse(arrayList);
//		System.out.println(arrayList);
//		Collections.shuffle(arrayList);
//		System.out.println(arrayList);
//
//		

	}

}
class Employee implements Comparable<Employee>{
	int id;
		String name;
		
		int salary;
		public Employee(String name, int id, int salary) {
			this.name = name;
		this.id = id;
		this.salary = salary;
	}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
		}
		@Override
		public int compareTo(Employee anotherEmp) {
			// TODO Auto-generated method stub
			int result=this.id -anotherEmp.id;
			if (result==0) {
				 result= this.name.compareTo(anotherEmp.name);
			}
			return result;
		}
	}	
	
