package collections;

import java.util.LinkedList;

public class LinkedListEx1 {
	public static void main(String[] args) {
		
	
	Student2 st1 = new Student2 ("Ivan",3);  
	Student2 st2= new Student2 ("Nikolay",4);  
	Student2 st3 = new Student2 ("Elena",2);  
	Student2 st4 = new Student2 ("Pietr",5);  
Student2 st5 = new Student2 ( "Maria",3);  
LinkedList<Student2>student2LinkedList=new LinkedList<>();
student2LinkedList.add(st1);
student2LinkedList.add(st2);
student2LinkedList.add(st3);
student2LinkedList.add(st4);
student2LinkedList.add(st5);
System.out.println("LinkedList = "+ student2LinkedList);
System.out.println(student2LinkedList.get(1 ));
Student2 st6= new Student2 ("Gora",2);  
Student2 st7 = new Student2 ("Nickoglay",5);
student2LinkedList.add(st6);
student2LinkedList.add(st7);
System.out.println("LinkedList = "+ student2LinkedList);
student2LinkedList.remove(2);

System.out.println("LinkedList = "+ student2LinkedList);

}
}
class Student2{
	private String name;
	
	private int course;

	public Student2() {
		
	}
	public Student2(String name,int course) {
		
		this.name = name;
				this.course = course;
			}
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", course=" + course + "]";
	}
	
	
}