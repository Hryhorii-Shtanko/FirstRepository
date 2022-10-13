package streamAndOthers;

import java.util.ArrayList;
import java.util.List;

public class Stream1 {
	public static void main(String[] args) {
		Student st1 = new Student("Zaur", 'm', 22, 1, 4.2);
		Student st2 = new Student("Nikolay", 'm', 21, 3, 9.5);
		Student st3 = new Student("Elena", 'f', 22, 2, 7.1);
		Student st4 = new Student("Nika", 'f', 18, 1, 8.1);
		Student st5 = new Student("Evan", 'm', 31, 2, 7.5);
		List<Student> students = new ArrayList<Student>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);

		Student first = students.stream().map(element -> {
			element.setName(element.getName().toUpperCase());
			return element;
		}).filter(element -> element.getSex() == 'f').sorted((x, y) -> x.getAge() - y.getAge()).findFirst().get();
		System.out.println(first);

	}
}

class Student {
	private String name;
	private char sex;
	private int age;
	private int course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public double getAvgGrade() {
		return avgGrade;
	}

	public void setAvgGrade(double avgGrade) {
		this.avgGrade = avgGrade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + ", course=" + course + ", avgGrade="
				+ avgGrade + "]";
	}

	public Student(String name, char sex, int age, int course, double avgGrade) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
		this.avgGrade = avgGrade;
	}

	private double avgGrade;
}
