package markerinterface;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    int id;
    int age;

    public Employee(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }


}
