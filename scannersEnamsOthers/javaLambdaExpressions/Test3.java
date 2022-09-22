/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLambdaExpression;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer ;

/**
 *
 * @author it05082022
 */
public class Test3 {
public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
    ArrayList<Car> al =new ArrayList<>();
    for(int i = 0; i< 3; i ++){
        al.add(carSupplier.get());
                    }
    return al;
}
   public static void changeCAR(Car car, Consumer<Car> carconsumer){
       carconsumer.accept(car);
       
    
}
    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(()->
                new Car("Nissan Dano", "silver Metalic",1.6));
        changeCAR(ourCars.get(0),car->
        {car.color="red";car.engine = 2.1;
        System.out.println("upgrated car "+car);
        });
        System.out.println(ourCars);
    }
}

class Car {

    String name;
    String color;
    double engine;

    public Car(String name, String color, double engine) {
        this.name = name;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", color=" + color + ", engine=" + engine + '}';
    }

}
