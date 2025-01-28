package mockprepare;

import java.util.HashSet;

public class HashSet_Custom_insert {
    public static void main(String[] args) {
        Student s1 = new Student("david", 101);
        Student s2 = new Student("Rama", 101);
        Student s3 = new Student("David", 100);
        HashSet<Student> hs = new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println(hs);
    }
}

class Student{
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "Name: "+name+" Marks: "+marks;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student s = (Student) obj;
        return marks == s.marks;
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(marks);
    }
}
