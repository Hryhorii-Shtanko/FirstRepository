package enums;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		Today today = new Today(Weekdays.SATURDAY);
		today.daysInfo();
		System.out.println(today.weekday);
		Weekdays w1 = Weekdays.FRIDAY;
		Weekdays w2 = Weekdays.FRIDAY;
		Weekdays w3 = Weekdays.MONDAY;
		System.out.println(w1 == w2);
		System.out.println(Weekdays.FRIDAY.equals(WeekDays2.FRIDAY));
		Weekdays w15 = Weekdays.valueOf("MONDAY");
		System.out.println(w15);
		Weekdays[]array = Weekdays.values();
		System.out.println(Arrays.toString(array));

	}
}
