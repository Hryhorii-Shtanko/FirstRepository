package foreach;

public class Test4 {
	public static void main(String[] args) {
		String[] students = { "Ivanov", "Podoliak", "Osadchiy" };
		String[] exams = { "mat analiz", "filosofiya" };
		for (String s1 : students) {
			for (String s2 : exams) {
				System.out.println(s1 + " " + s2);
			}
		}
	}
}
