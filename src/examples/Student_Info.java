package examples;

import java.util.Comparator;

public class Student_Info  {
    int age;
    Student_Info(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Age: "+age;
    }
}
