package constructorchaining;

public class ConsChaining {
    String name;
    int age;

    ConsChaining(int age){
        this.age = age;
    }

    ConsChaining(String name, int age){
        this(age);
        this.name = name;
    }

    public static void main(String[] args) {
        ConsChaining cc = new ConsChaining("david", 22);

        String name = cc.name;
        int age = cc.age;

        System.out.println(name);
        System.out.println(age);
    }
}
