package examples;

public class ConstructorChaining1 {
    String name;
    int age;
    double salary;


    ConstructorChaining1(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    ConstructorChaining1(String name, int age, double salary){
        this(name, salary);
        this.age = age;
    }

    public static void main(String[] args) {
        ConstructorChaining1 c1 = new ConstructorChaining1("David", 22, 12000.00);
        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.salary);
    }
}
