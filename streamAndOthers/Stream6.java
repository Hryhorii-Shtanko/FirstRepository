package streamAndOthers;

import java.util.ArrayList;
import java.util.List;

public class Stream6 {
	public static void main(String[] args) {
		Student st1 = new Student("Zaur", 'm', 22, 1, 4.2);
		Student st2 = new Student("Nikolay", 'm', 21, 3, 9.5);
		Student st3 = new Student("Elena", 'f', 22, 2, 7.1);
		Student st4 = new Student("Nika", 'f', 18, 1, 8.1);
		Student st5 = new Student("Evan", 'm', 31, 2, 7.5);

		Faculty f1 = new Faculty("Economics");
		Faculty f2 = new Faculty("Applied mathematics");
		f1.addStudentToFaculty(st1);
		f1.addStudentToFaculty(st2);
		f1.addStudentToFaculty(st3);
		f2.addStudentToFaculty(st4);
		f2.addStudentToFaculty(st5);

		List<Faculty> facultyList = new ArrayList<Faculty>();
		facultyList.add(f1);
		facultyList.add(f2);

		facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
				.forEach(e -> System.out.println(e.getName()));

	}
}

class Faculty {
	String name;
	List<Student> studentsOnFaculty;

	public Faculty(String name) {
		this.name = name;
		studentsOnFaculty = new ArrayList<Student>();
	}

	public List<Student> getStudentsOnFaculty() {
		return studentsOnFaculty;
	}

	public void addStudentToFaculty(Student st) {
		studentsOnFaculty.add(st);
	}

}
