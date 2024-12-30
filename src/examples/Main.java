package examples;

import java.util.TreeMap;
import java.util.Set;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        TreeMap<Student, Employee> tm = new TreeMap<>(new NameCoparator());
        tm.put(new Student("David", 22), new Employee("Ravan", 45));
        tm.put(new Student("Abcd", 23), new Employee("Laxmi", 45));
        tm.put(new Student("Jagat", 21), new Employee("Kaavan", 45));

        Set<Student> set = tm.keySet();

        for (Student s: set){
            System.out.println(s+" ---> "+tm.get(s));
        }
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name "+name+" Age "+age;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj ){
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Student s = (Student) obj;
        return name.equals(s.name);
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }
}

class Employee {
    String name;
    int age;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name "+name+" Age "+age;
    }
}

class NameCoparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }


}






































