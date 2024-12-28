package examples;

public class ConstructorOverloading {
    String name;
    int age;
    String designation;
    double salary;
    ConstructorOverloading(String name, int age){
        this.name = name;
        this.age = age;
    }

    ConstructorOverloading(String name, String designation, double salary){
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading("David", 22);
        ConstructorOverloading c2 = new ConstructorOverloading("David", "Developer", 15000.00);

        System.out.println("Name "+c1.name+" Age "+c1.age);
        System.out.println("Name "+c2.name+" Designation "+c2.designation+" Salary "+c2.salary);

    }
}
