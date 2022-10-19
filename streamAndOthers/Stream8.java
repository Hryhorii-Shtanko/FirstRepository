package streamAndOthers;

import java.util.ArrayList;
import java.util.List;

public class Stream8 {
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

		int sum = students.stream().mapToInt(el -> el.getCourse()).sum();
		double average = students.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();
		System.out.println(average);

		int min = students.stream().mapToInt(el -> el.getCourse()).min().getAsInt();

		System.out.println(min);

		int max = students.stream().mapToInt(el -> el.getCourse()).max().getAsInt();

		System.out.println(max);

	}
}
