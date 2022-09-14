package nestedClasses2;

public class Car {
	String color;
static int doorCount;
Engine engine;

public Car(String color, int doorCount) {
	Engine e = new Engine(122);
	System.out.println(e.horsePower);
	this.color = color;
	this.doorCount = doorCount;
	}
public void setEngine(Engine engine) {
	this.engine=engine;
	
}
@Override
public String toString() {
	return "My Car [color=" + color + ", doorCount=" + doorCount + ", engine=" + engine + "]";
} 
public  class Engine{
	
	private int horsePower;
	 
	@Override
	public String toString() {
		return "My Engine [horsePower=" + horsePower + "]";
	}

	public Engine(  int horsePower) {
		System.out.println(doorCount);
		this.horsePower = horsePower;
	}


}}
class Test{
	public static void main(String[] args) {
		Car car = new Car("black", 4);
		Car.Engine engine=car.new Engine(150);
		car.setEngine(engine);
		System.out.println(engine);
		System.out.println(car  );
//		Car.Engine engine2=new Car.Engine(150);
		Car.Engine engine3= new Car("yellow",4).new Engine(200);
		System.out.println(engine3);
			}
}

 