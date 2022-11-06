package collections1;

import java.util.ArrayList;
import java.util.Objects;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentR st1 = new StudentR ("Ivan",'m',22,3,8.3);  
		StudentR st2= new StudentR ("Nikolay",'m',28,2,6.4);  
		StudentR st3 = new StudentR ("Elena",'f',19,1,8.9);  
		StudentR st4 = new StudentR ("Pietr",'m',35,4,7);  
StudentR st5 = new StudentR ("Maria",'f',23,3,7.4);  
ArrayList<StudentR> studentList1= new ArrayList<>();
studentList1.add(st1);
studentList1.add(st2);
studentList1.add(st3);
studentList1.add(st4);
studentList1.add(st5);
System.out.println(studentList1);
StudentR st6= new StudentR ("Maria",'f',23,3,7.4);  
//studentList1.add(st6);
//studentList1.remove(st6);
int index=studentList1.indexOf(st6);
System.out.println(index);


	}

}
class StudentR{
	private String name;
	private char sex;
	private int age;
	private int course;
	private double avgGrade;
	public StudentR(String string, String string2, int i) {
		
	}
	public StudentR(String name, char sex, int age, int course, double avgGrade) {
		
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
		this.avgGrade = avgGrade;
	}
	@Override
	public String toString() {
		return "Student {" + "name=" + name + ", sex=" + sex + ", age=" + age + ", course=" + course + ", avgGrade="
				+ avgGrade + '}';
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentR other = (StudentR) obj;
		return age == other.age && Double.doubleToLongBits(avgGrade) == Double.doubleToLongBits(other.avgGrade)
				&& course == other.course && Objects.equals(name, other.name) && sex == other.sex;
	}
	
}