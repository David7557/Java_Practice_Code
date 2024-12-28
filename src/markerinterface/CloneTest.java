package markerinterface;

public class CloneTest {
    public static void main(String[] args) {
        Student s = new Student("David", 100);
        Object obj = null;
        try{
            obj =  s.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        if (obj instanceof Student){
            Student s1 = (Student) obj;
            System.out.println(s1.name+" "+s1.id);
        }

    }
}
