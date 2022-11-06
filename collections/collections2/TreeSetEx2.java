package collections2;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
public static void main(String[] args) {
	
	TreeSet<Student> treeset = new TreeSet<>();

	Student st1 = new Student("Zaur", 1);
	Student st2 = new Student("Nikolay", 3);
	Student st3 = new Student("Elena",2);
	Student st4 = new Student("Elena", 4);
	Student st6 = new Student("Evan", 2);
	Student st7= new Student("Evan", 4);
	treeset.add(st2);
	treeset.add(st1);
	treeset.add(st3);
	treeset.add(st4);
	
	//	treeset.put(5.8, st1);
	System.out.println(treeset);
	System.out.println(st7.equals(st4));
	System.out.println(st7.hashCode() ==st4.hashCode());
	System.out.println(treeset.subSet(st6,st7));
System.out.println(st7.hashCode());
	
}
}
class Student implements Comparable<Student>{
	String name;
	int course;
	
	public Student(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(course);
	}

	@Override
	public boolean equals(Object  obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return course == other.course ;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.course - o.course;
	}
}
