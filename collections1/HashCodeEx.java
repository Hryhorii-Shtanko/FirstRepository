package collections1;

public class HashCodeEx {
public static void main(String[] args) {
//	Map<StudentChDTU, Double> map = new HashMap<StudentChDTU, Double>();
//	StudentChDTU st1 = new StudentChDTU ("Zaur", "Tregulov",3);  
//	StudentChDTU st2= new StudentChDTU ("Nikolay","Mavlof",28);  
//	StudentChDTU st3 = new StudentChDTU ("Elena","Frogina",19); 
//	map.put(st1, 10.2);
//	map.put(st2, 7.5);
//	map.put(st3, 6.4);
	
	//System.out.println(map);
//	System.out.println(map.containsKey(st3));
//	st3.course=4;
//	System.out.println(map.containsKey(st3));

	
	//StudentChDTU st4 = new StudentChDTU ("Zaur","Tregulov",3); 
	//StudentChDTU st5= new StudentChDTU ("Babur","Tregulov",2); 
//	int i = 	2129496296;
//		System.out.println(i);
//		int b12 = 014;
//		System.out.println(b12);
	//System.out.println(st5.hashCode());
	//System.out.println(st4.hashCode());
	//for (Map.Entry<StudentChDTU, Double> entry :map.entrySet())
	//System.out.println(entry.getKey()+ ":" + entry.getValue());

	//map.put(st4, 6.7);
//System.out.println(map.containsKey(st4));
	//System.out.println("result = "+result);
	//System.out.println(st5.equals(st4));
}
}//final
// class StudentChDTU {
//	 String name;
//	 String surname;
//	 int course;
//	public StudentChDTU(String name, String surname, int course) {
//				this.name = name;
//		this.surname = surname;
//		this.course = course;
//	}
//	
//	public int hashCode() {
//		return name.length()*31+surname.length()*5+course*9;
//		//return Objects.hash(name,course, surname);
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
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", surname=" + surname + ", course=" + course + "]";
//	}
//	 
// }