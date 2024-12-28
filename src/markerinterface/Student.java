package markerinterface;

public class Student implements Cloneable{
    String name;
    int id;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
