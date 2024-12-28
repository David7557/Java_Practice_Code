package javaframeworks;

public class EmployeeMainClass {
    public static void main(String[] args) {
        Employee e1 = new Employee("David", 25000.0);
        Employee e2 = new Employee("Jackson", 20000.0);

        Employee[] emp = new Employee[2];
        emp[0] = e1;
        emp[1] = e2;

        System.out.println(emp[0]);
        System.out.println(emp[1]);
    }
}
