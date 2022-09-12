package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {
public static void main(String[] args) {
	//Map<Integer, String> hashmap= new HashMap<>(16,0.75f);
	Map<StudentChDTU, Double> map = new HashMap<StudentChDTU, Double>();
	StudentChDTU st1 = new StudentChDTU ("Zaur", "Tregulov",3);  
	StudentChDTU st2= new StudentChDTU ("Nikolay","Mavlof",28);  
	StudentChDTU st3 = new StudentChDTU ("Elena","Frogina",18); 
	StudentChDTU st4 = new StudentChDTU ("Elena","Frogina",19); 
	map.put(st1, 10.2);
	map.put(st2, 7.5);
	map.put(st3, 6.4);
	
System.out.println(map.containsKey("Elena"));
	//System.out.println(map.containsValue());
	//st3.course=4;
}
}
final class StudentChDTU implements Comparable<StudentChDTU>{
	private final String name;
	private final  String surname;
	private final int course;
	public StudentChDTU(String name, String surname, int course) {
		super();
		this.name = name;
		this.surname = surname;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getCourse() {
		return course;
	}
	
	@Override
	public String toString() {
		return "StudentChDTU [name=" + name + ", surname=" + surname + ", course=" + course + "]";
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(course, name, surname);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		StudentChDTU other = (StudentChDTU) obj;
//		return course == other.course && Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
//	}
	@Override
	public int compareTo(StudentChDTU o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}