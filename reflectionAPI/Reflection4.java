package reflectionAPI;

import java.lang.reflect.Field;

public class Reflection4 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        EmployeeX employeex = new EmployeeX(10,"Gregory","IT");
        Class employeexClass = employeex.getClass();
        Field field =employeexClass.getDeclaredField("salary");
field.setAccessible(true);
        double saloryValue = (Double)field.get(employeex);
        System.out.println(saloryValue);

        field.set(employeex,1500);
        System.out.println(employeex);

    }
}
