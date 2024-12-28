package examples;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student si, Student si1){
        return si.age-si1.age;
    }
}
