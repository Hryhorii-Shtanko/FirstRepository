package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("Henry");
	list.add("APerl");
	list.add("Karl");
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	
	
	
	List<Employee1> list2 = new ArrayList<Employee1>();
	Employee1 emp1 = new Employee1("Mashka", 100, 11110);
	Employee1 emp2 = new Employee1("Zealot", 120, 8988);
	Employee1 emp3=  new Employee1("Aspec", 81, 1888);
	Employee1 emp4 = new Employee1("Craizar", 10, 5550);
	Employee1 emp5 = new Employee1("Zaur", 3, 12111);
	
	list2.add(emp1);
	list2.add(emp3);
	list2.add(emp2);
	list2.add(emp4);
	list2.add(emp5);
	System.out.println(list2);
	Collections.sort(list2);
	System.out.println(list2);	
//
//	int i1 = 5;
//	int i2 = 11;
//	double d2 = 1.3;
//double d1= 5.5;
//long L= 20l;
//double result =0;
//double rt =i2/d1 + d2%i1 ;
//double rtz =2+ 1.3%5 ;
//
//result = i2/d1 + d2%i1 - L;
int a = 5;
int b =8;
int result= a-- - --a + ++a + a++ + a;
int rt = ++b -b++ + ++b - --b;
	System.out.println(result);
System.out.println(rt);

	
	

}
}

class Employee1 implements Comparable<Employee1>{
	int id;
	String name;
		String surname;
				int salary;
		public Employee1(String name, int id, int salary) {
			this.name = name;
		this.id = id;
		this.salary = salary;
	}
		public Employee1(int id, String name, String surname, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.surname = surname;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee1 [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
		}
		@Override
		public int compareTo(Employee1 sortById) {
			// TODO Auto-generated method stub
			if(this.id== sortById.id) {
				return 0;
		}
		else if (this.id <sortById.id ) {
			return -1;
		}else {return 1;
		}
			//int result = this.id - this.sortById;
}		//(result ==0) {
				//result = this.salary .compareTo(sortById);
		
				
		}
		