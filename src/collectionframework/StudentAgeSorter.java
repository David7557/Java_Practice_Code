package collectionframework;

import java.util.Comparator;

public class StudentAgeSorter implements Comparator<Student> {
    @Override
    public int compare(Student currentObj, Student existingObj){
        return Double.compare(currentObj.age, existingObj.age);
    }

}
