package reflectionAPI;

public class Reflection2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
      Class employeeClass = Class.forName("reflectionAPI.Employee");

      Employee  o = (Employee)employeeClass.newInstance();
        System.out.println(o);

    }
}