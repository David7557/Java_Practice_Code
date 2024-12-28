package examples;

public class Constructor {
    String name;
    int age;

    Constructor(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Constructor n = new Constructor("David", 22);
        System.out.println(n.name);
        System.out.println(n.age);
    }

    public void heloWorld(){
        System.out.println("Hello");
    }
}
