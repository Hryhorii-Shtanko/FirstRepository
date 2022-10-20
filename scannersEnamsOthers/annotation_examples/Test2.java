package annotation_examples;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
Class xiaomiClass = Class.forName("annotation_examples.Xiaomi");
Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
SmartPhone sm1 = (SmartPhone)annotation1;
        System.out.println("Annotation info from Xiaomi class: "
        +sm1.OS()+ ", " + sm1.yearOfCompanyFoundation());

        Class iphoneClass = Class.forName("annotation_examples.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2= (SmartPhone)annotation2;
        System.out.println("Annotation info from Iphone class: "
                +sm2.OS()+ ", " + sm2.yearOfCompanyFoundation());

    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
String OS() default "Android";
int yearOfCompanyFoundation() default 2010;
}

@SmartPhone
class Xiaomi{
String model;
double price;
}
@SmartPhone(OS = "IOS", yearOfCompanyFoundation = 1976)
class Iphone{
    String model;
    double price;
}