package collections1;

class Computer {
	private String name;
	private int dateOfProdaction;
	private String color;

	public Computer() {
	}

	public Computer(String name, int dateOfProdaction, String color) {

		this.name = name;
		this.dateOfProdaction = dateOfProdaction;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDateOfProdaction() {
		return dateOfProdaction;
	}

	public void setDateOfProdaction(int dateOfProdaction) {
		this.dateOfProdaction = dateOfProdaction;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void on() {
		System.out.println(name + " Computer is online");
	}

	public void off() {
		System.out.println(name + " Computer is offline");
	}
}
