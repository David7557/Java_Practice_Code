package collectionframework;

public class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name of the student is "+name+ " and age of the student is "+age;
    }
}
