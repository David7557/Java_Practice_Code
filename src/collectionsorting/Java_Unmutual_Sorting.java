package collectionsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Java_Unmutual_Sorting {
  public static void main(String[] args){
    Student_Class s1 = new Student_Class(101, "David", 67);
    Student_Class s2 = new Student_Class(103, "Sumit", 66);
    Employee_Class e1 = new Employee_Class(102, "Jyoti", 45000);
    Student_Class s3 = new Student_Class(104, "Kajal", 12);
    Employee_Class e2 = new Employee_Class(105, "Raghu", 78000);

      ArrayList<Person> list = new ArrayList<>();
      list.add(s1);
      list.add(s2);
      list.add(s3);
      list.add(e1);
      list.add(e2);

      Collections.sort(list, new IdComparator());

      Iterator<Person> it = list.iterator();

      while(it.hasNext()){
          System.out.println(it.next());
      }
  }
}

class Person {
    int id;
    String name;

    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
}

class Student_Class extends Person {
    int marks;
    Student_Class(int id, String name, int marks){
        super(id, name);
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "Id: "+id+" Name: "+name+" Marks: "+marks;
    }
}

class Employee_Class extends Person {
    int salary;
    Employee_Class(int id, String name, int salary){
        super(id, name);
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Id: "+id+" Name: "+name+" Salary: "+salary;
    }
}

class IdComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2){
        return p1.id - p2.id;
    }
}
