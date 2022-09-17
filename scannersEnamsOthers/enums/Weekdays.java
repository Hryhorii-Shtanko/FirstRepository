package enums;

public enum Weekdays {
	MONDAY("bad"), TUESDAY("bad"), WEDNESDAY("so-so"), THURSDAY("so-so"), FRIDAY, SATURDAY("great"), SUNDAY("good");

	private String mood;

	private Weekdays(String mood) {
		this.mood = mood;
	}

	private Weekdays() {
	}

	public String getMood() {
		return mood;
	}
}

enum WeekDays2 {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

class Today {
	Weekdays weekday;

	public Today(Weekdays weekday) {
		this.weekday = weekday;
	}

	void daysInfo() {
		switch (weekday) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			System.out.println("Go to the work!");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("You can rest a bit");
			break;

		}
		System.out.println("My mood in that day " + weekday.getMood());

	}

}