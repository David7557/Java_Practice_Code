package examples;

public class StudentName implements Comparable<StudentName>{
    String name;
    StudentName(String name){
        this.name= name;
    }

    @Override
    public int compareTo(StudentName sn){
        return this.name.compareTo(sn.name);
    }
}
