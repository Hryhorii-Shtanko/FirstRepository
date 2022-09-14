package nestedClasses1;

public class Car {
	String color;
int doorCount;
Engine engine;

public Car(String color, int doorCount, Engine engine) {
	super();
	this.color = color;
	this.doorCount = doorCount;
	this.engine = engine;
}
@Override
public String toString() {
	return "Car [color=" + color + ", doorCount=" + doorCount + ", engine=" + engine + "]";
} 
public static class Engine{
	int horsePower;
	
	public Engine(int horsePower) {
		super();
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "My Engine [horsePower=" + horsePower + "]";
	}
		
	}
}
class Test{
	public static void main(String[] args) {
		Car.Engine engine = new Car.Engine(256);
//	Car car = new Car("red",2,engine);
// 		System.out.println(car);
		System.out.println(engine);
	}
}
