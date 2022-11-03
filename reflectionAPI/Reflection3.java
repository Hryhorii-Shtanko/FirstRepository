package reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class employeeClass = Class.forName("reflectionAPI.Employee");

        Constructor <Employee>constructor1 = employeeClass.getConstructor();
        Employee obj1 = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class,
                String.class, String.class);
        Object obj2 = constructor2.newInstance(5,"Gregory","IT");
        System.out.println(obj2);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 800.88);
        System.out.println(obj2);

    }
}
