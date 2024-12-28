package core;

public class ConstructorChaining {
    String name;
    int age;

    ConstructorChaining(String name, int age){
        this(name);
        this.age = age;

    }

    ConstructorChaining(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        ConstructorChaining chaining = new ConstructorChaining("David", 22);
        System.out.println(chaining.name+" "+chaining.age);
    }
}
