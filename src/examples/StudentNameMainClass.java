package examples;

import java.util.TreeSet;

public class StudentNameMainClass {
    public static void main(String[] args) {
        StudentName sn1 = new StudentName("David");
        StudentName sn2 = new StudentName("Rakesh");
        StudentName sn3 = new StudentName("Fucking");

        TreeSet<StudentName> ts = new TreeSet<>();
        ts.add(sn1);
        ts.add(sn2);
        ts.add(sn3);

        for(StudentName sn : ts){
            System.out.println(sn.name);
        }
    }
}
