package reflectionAPI;

public class EmployeeX {

    public int id;
    public String name;
    public String department;
    private double salary = 1000;

    public EmployeeX() {
    }

    public EmployeeX(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }


    private void changeDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("New department is: " + department);
    }

    public void increaseSalary() {
        salary *= 2;
    }

    @Override
    public String toString() {
        return "ReflectionAPI.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

