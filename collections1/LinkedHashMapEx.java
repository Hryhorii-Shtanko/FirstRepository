  package collections;

import java.util.LinkedHashMap;


public class LinkedHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						// Map<Integer, String> hashmap= new HashMap<>(16,0.75f);
				LinkedHashMap<StudentChDTU,Double> lhm = new LinkedHashMap<>();
				
				StudentChDTU st1 = new StudentChDTU("Zaur", "Tregulov", 3);
				StudentChDTU st2 = new StudentChDTU("Nikolay", "Mavlof", 3);
				StudentChDTU st3 = new StudentChDTU("Elena", "Frogina", 4);
				StudentChDTU st4 = new StudentChDTU("Elena", "Frogina", 4);
					lhm.put(st2,6.4);
				lhm.put(st3,7.2);
				lhm.put(st4,7.5);
				lhm.put(st1,5.8);
					System.out.println(lhm);
					System.out.println(st3.equals(st4));
				//System.out.println(map.containsKey(7.2));
				// st3.course=4;
			}
		}
//
//		class StudentChDTU implements Comparable<StudentChDTU> {
//
//			String name;
//			String surname;
//			int course;
//			private int result;
//
//			public StudentChDTU(String name, String surname, int course) {
//				super();
//				this.name = name;
//				this.surname = surname;
//				this.course = course;
//			}
//
//			public String getName() {
//				return name;
//			}
//
//			public String getSurname() {
//				return surname;
//			}
//
//			public int getCourse() {
//				return course;
//			}
//		//
////			@Override
////			public int hashCode() {
////				return course*38+name.length()*9+ surname.length()*12;
////			}
//		//
////			@Override
////			public boolean equals(Object obj) {
////				if (this == obj)
////					return true;
////				if (obj == null)
////					return false;
////				if (getClass() != obj.getClass())
////					return false;
////				StudentChDTU other = (StudentChDTU) obj;
////				return course == other.course && Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
////			}
//
//			@Override
//			public String toString() {
//				return "StudentChDTU [name=" + name + ", surname=" + surname + ", course=" + course + "]";
//			}
//
//			@Override
//			public int compareTo(StudentChDTU o) {
//				// TODO Auto-generated method stub
//				return this.name.compareTo(o.name);
//		}
//		}
//
//	}
//
//}
