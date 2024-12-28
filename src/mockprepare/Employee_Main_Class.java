package mockprepare;

import java.util.ArrayList;

public class Employee_Main_Class {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Developer(101, "David", 12000));
        employees.add(new Tester(102, "David", 12000));
        employees.add(new Software(103, "David", 12000));

        for (Employee e: employees){
            if (e instanceof Developer developer){
                developer.m1();
            }
            if(e instanceof Tester tester){
                tester.m2();
            }
            if (e instanceof Software software){
                software.m3();
            }
        }
    }
}

class Employee {
    int empId;
    String empName;
    int empSalary;

    Employee(int empId, String empName, int empSalary){
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }
}

class Developer extends Employee {
    Developer(int empId, String empName, int empSalary) {
        super(empId, empName, empSalary);
    }

    public void m1(){
        System.out.println(empId+" "+empName+" "+empSalary+" is Developing");
    }
}

class Tester extends Employee {
    Tester(int empId, String empName, int empSalary) {
        super(empId, empName, empSalary);
    }

    public void m2(){
        System.out.println(empId+" "+empName+" "+empSalary+" is Testing");
    }
}

class Software extends Employee {
    Software(int empId, String empName, int empSalary) {
        super(empId, empName, empSalary);
    }

    public void m3(){
        System.out.println("Software was developed by "+empId+" "+empName+" "+empSalary);
    }
}
