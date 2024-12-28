package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMainClass {
    public static void main(String[] args) {
        Student s1 = new Student("David", 22);
        Student s2 = new Student("Sumit", 21);
        Student s3 = new Student("Ram", 20);

        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        al.sort(new StudentAgeSorter());
        for(Student s: al){
            System.out.println(s);
        }
    }
}
