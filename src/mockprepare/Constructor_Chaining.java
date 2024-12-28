package mockprepare;

public class Constructor_Chaining {
    //this calling statement
    private String name;
    private int age;

    Constructor_Chaining(String name){
        this.name =name;
    }

    Constructor_Chaining(String name, int age){
        this(name);
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name: "+name+" Age: "+age);
    }

    public static void main(String[] args){
        Constructor_Chaining chain = new Constructor_Chaining("David", 22);
        chain.displayInfo();
    }
}

