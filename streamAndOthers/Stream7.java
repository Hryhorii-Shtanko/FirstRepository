package streamAndOthers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Stream7 {
	public static void main(String[] args) {

		Student st1 = new Student("Zaur", 'm', 22, 1, 4.2);
		Student st2 = new Student("Nikolay", 'm', 21, 3, 9.5);
		Student st3 = new Student("Elena", 'f', 22, 2, 7.1);
		Student st4 = new Student("Nika", 'f', 18, 1, 8.1);
		Student st5 = new Student("Evan", 'm', 31, 2, 7.5);
		List<Student> studentes = new ArrayList<Student>();
		studentes.add(st1);
		studentes.add(st2);
		studentes.add(st3);
		studentes.add(st4);
		studentes.add(st5);

		Map<Boolean, List<Student>> map = studentes.stream()
				.collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));

		for (Entry<Boolean, List<Student>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue().toString());
		}
	}
}