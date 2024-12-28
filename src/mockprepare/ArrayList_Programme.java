package mockprepare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1>{
    String name;
    int age;
    Student1(String name, int age){
        this.name=name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name: "+name+" Age: "+age;
    }

    @Override
    public int compareTo(Student1 existingObject){
        return this.age - existingObject.age;
    }
}

public class ArrayList_Programme {
    public static void main(String[] args){
       ArrayList <Student1> list = new ArrayList<>();
        list.add(new Student1("David", 22));
        list.add(new Student1("Rama", 21));
        list.add(new Student1("Laxman", 25));
        list.add(new Student1("Seeta", 23));

        Collections.sort(list);

        List<Integer> listInt = new ArrayList<>();
        listInt.add(10);
        listInt.add(5);
        listInt.add(2);
        listInt.add(1);
        listInt.add(7);
        listInt.add(3);
        listInt.add(6);
        listInt.add(8);
        listInt.add(9);

        Collections.sort(listInt);

        System.out.println(listInt);

        System.out.println(list);
    }
}
