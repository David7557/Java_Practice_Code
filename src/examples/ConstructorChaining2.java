package examples;

public class ConstructorChaining2 extends Parent {
    ConstructorChaining2(String name){
        super(name);
        System.out.println("Namaste ji");
    }

    public static void main(String[] args) {
        ConstructorChaining2 c = new ConstructorChaining2("David");
    }
}
