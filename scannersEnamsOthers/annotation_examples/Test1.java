package annotation_examples;

public class Test1 {
    public static void main(String[] args) {
Parent p = new Child("Gregory");
p.showInfo();
    }
}
class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }
@Deprecated
    void showInfo(){
        System.out.println("It`s Parent class. Name = " + name);
            }
}

class Child extends Parent{

    public Child(String name) {
        super(name);
    }

    void showInfo(){
        System.out.println("It`s Child class. Name = " + name);
    }
}